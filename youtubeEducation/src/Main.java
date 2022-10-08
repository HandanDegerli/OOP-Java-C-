public class Main {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;

        System.out.println(number1);

        // stack     &    //heap   examples for value types and reference types

        int[] numbers1 = new int[] {1, 2, 3, 4, 5};
        int[] numbers2 = new int[] {10, 20, 30};
        numbers1 = numbers2;

        numbers2[0] = 1000;

        System.out.println(numbers1[0]);

        System.out.println("-------------------------------");

        CreditManager creditManager = new CreditManager();//instance oluşturmak
        creditManager.calculate();

        //SOLID

        Customer customer = new Customer();//instance creation
        customer.setId(1);
        customer.setFirstName("Odie");
        customer.setLastName("Degerli");


        System.out.println("-------------------------------");

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        System.out.println("-------------------------------");

        Person person  = new Person();
        person.setNationalIdentity("754782583743");

        Company company = new Company();
        company.setId(12);

        CustomerManager customerManager1 = new CustomerManager(new Company());

        Customer c1 = new Customer();
        Customer c2 = new Company();
        Customer c3 = new Person();

        //inheritance özelliği -extend edince customer extend edildiği reference type larını da tutar





    }
}
