package bridge;

/**
 * Created by Vladok on 17.11.2016.
 */
public class CSharpLanguage implements ILanguage {
    @Override
    public void Build() {
        System.out.println("Compile to Exe");
    }

    @Override
    public void Execute() {
        System.out.println("Compile to BinaryCode");
        System.out.println("CLR executes Compiled BinaryCode");
    }
}
