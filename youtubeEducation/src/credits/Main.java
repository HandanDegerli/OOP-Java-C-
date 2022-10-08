package credits;

public class Main {
    public static void main(String[] args) {
        //interfaces-abstract classes

        //iş yapan operasyonların sınıfları(Managerlar burada)operasyonlarını sadece
        // imza seviyesinde tutarak yazılımda bagımlılıgı azaltmak amacıyla yapılan bir calısmadır

        //IoC Container larla da bu newlemeyi yapıyoruz new =zaafiyet çünkü -injection


        CustomerManager customerManager = new CustomerManager(new TeacherCreditManager());
        customerManager.giveCredit();
        customerManager.save();

        System.out.println("--------------------------");

        CustomerManager customerManager1 = new CustomerManager(new MilitaryCreditManager());
        customerManager1.giveCredit();

        MilitaryCreditManager militaryCreditManager = new MilitaryCreditManager();
        militaryCreditManager.save();




    }

}
