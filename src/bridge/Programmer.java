package bridge;

/**
 * Created by Vladok on 17.11.2016.
 */
public abstract class Programmer {
    private ILanguage language;

    public void setLanguage(ILanguage language) {
        this.language = language;
    }

    public Programmer(ILanguage language) {
        this.language = language;
    }
    public void DoWork(){
        language.Build();
        language.Execute();
    }
    public abstract void getMoney();
}
