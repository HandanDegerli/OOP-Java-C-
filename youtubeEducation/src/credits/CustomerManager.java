package credits;

public class CustomerManager{

    private ICreditManager creditManager;

    public CustomerManager(ICreditManager creditManager) {
        this.creditManager = creditManager;
    }

    public void save(){
        creditManager.save();
    }

    public void delete(){
        System.out.println("Credit was deleted");
    }

    public void giveCredit(){
        creditManager.calculate();
        System.out.println("Credit was given");
    }
}
