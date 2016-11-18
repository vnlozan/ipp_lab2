package facade;

/**
 * Created by Vladok on 17.11.2016.
 */
public class IntelijIdeaFacade {
    private Compiler compiler;
    private JVM jvm;
    private TextEditor textEditor;

    public IntelijIdeaFacade(Compiler compiler, JVM jvm, TextEditor textEditor) {
        this.compiler = compiler;
        this.jvm = jvm;
        this.textEditor = textEditor;
    }
    public void Start(){
        textEditor.WriteCode();
        textEditor.Save();
        compiler.Compile();
        jvm.Execute();
    }
    public void Stop(){
        jvm.Finish();
    }
}
