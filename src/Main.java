import adapter.IXmlData;
import adapter.JsonData;
import adapter.JsonToXmlAdapter;
import bridge.CSharpLanguage;
import bridge.FreelanceProgrammer;
import bridge.JavaLanguage;
import bridge.Programmer;
import composite.Component;
import composite.Directory;
import composite.File;
import decorator.AndroidApp;
import decorator.App;
import decorator.IosApp;
import decorator.MobileApp;
import facade.*;
import facade.Compiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vladok on 11.11.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        SessionConfig sessionConfig=SessionConfig.getInstance();
        while(true) {
            System.out.println("\tCommands");
            System.out.println(
                    "1.read_all_data_xml\n" +
                    "2.set_Programming_request\n" +
                    "3.create_an_App\n"+
                    "4.run_IDE\n"+
                    "5.save_projects"
                                );
            switch ((new BufferedReader(new InputStreamReader(System.in)).readLine())) {
                case "read_all_data_xml":
                    //adapter: JSON TO XML
                    JsonData data=new JsonData();
                    IXmlData xmlData=new JsonToXmlAdapter(data);
                    sessionConfig.setCurrentData(xmlData);
                    System.out.println("Current Data from SessionConfig: "+sessionConfig.getCurrentData());
                    break;
                case "set_Programming_request":
                    //bridge
                    Programmer freelancer = new FreelanceProgrammer(new JavaLanguage());
                    freelancer.DoWork();
                    freelancer.getMoney();
                    // new order received , C# needed
                    freelancer.setLanguage(new CSharpLanguage());
                    freelancer.DoWork();
                    freelancer.getMoney();
                    break;
                case "create_an_App":
                    //decorator
                    App app=new MobileApp();
                    System.out.println(app.getCost());
                    app=new AndroidApp(app);
                    System.out.println(app.getCost());
                    app=new IosApp(app);
                    System.out.println(app.getName());
                    System.out.println(app.getCost());
                    break;
                case "run_IDE":
                    //facade
                    JVM jvm=new JVM();
                    TextEditor textEditor=new TextEditor();
                    Compiler compiler =new Compiler();
                    IntelijIdeaFacade intelijIdeaFacade=new IntelijIdeaFacade(compiler,jvm,textEditor);
                    FreeMachine machine=new FreeMachine();
                    machine.runJava(intelijIdeaFacade);
                    break;
                case "save_projects":
                    //composite
                    Component proj1 =new File("proj1.rar");
                    Component proj2 =new File("proj2.rar");
                    Component MyProj=new Directory("MyProj");
                    MyProj.Add(proj1);
                    MyProj.Add(proj2);
                    Component fileSys=new Directory("FileSys");
                    fileSys.Add(MyProj);
                    fileSys.Print();
                    break;
                default:
                    System.out.println("No operation solved");
                    break;
            }
        }
    }
}
