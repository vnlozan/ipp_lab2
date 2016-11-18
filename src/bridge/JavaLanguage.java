package bridge;

/**
 * Created by Vladok on 17.11.2016.
 */
public class JavaLanguage implements ILanguage {
    @Override
    public void Build() {
        System.out.println("Create ByteCode");
    }
    @Override
    public void Execute() {
        System.out.println("Using JVM, run App");
    }
}
