package credits;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

    @Override
    public void calculate() {
        System.out.println("Teacher credit was calculated");
    }

}
