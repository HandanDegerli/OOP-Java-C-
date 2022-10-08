package credits;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Military credit was calculated");
    }

    @Override
    public final void save() {
        System.out.println("Military credit was saved");
    }

}
