package bridge;

/**
 * Created by Vladok on 17.11.2016.
 */
public class FreelanceProgrammer extends Programmer {
    public FreelanceProgrammer(ILanguage language) {
        super(language);
    }

    @Override
    public void getMoney() {
        System.out.println("Get All Earned Money");
    }
}
