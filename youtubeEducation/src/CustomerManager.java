public class CustomerManager{
    private Customer customer;
    public CustomerManager(Customer customer) {
        this.customer = customer;
    }

    public void save(){
        System.out.println("Credit was saved for " + this.customer.firstName);
    }

    public void delete(){
        System.out.println("Credit was deleted for " + this.customer.id);
    }
}
