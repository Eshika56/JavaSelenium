package labsession.lab18072025;
public class DetailsPrinter {
    public static void printDetails(String name, int age, String city) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        printDetails("John", 22, "Delhi");
    }
}
