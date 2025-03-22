import inheritance.Car;
import polymorphism.CheckBox;
import polymorphism.TextBox;
import polymorphism.UIControl;

public class Main {

    public static void main(String[] args) {

        // In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.
        Account account = new Account();
        System.out.println("Encapsulation");
        account.deposit(10);
        account.withdraw(5);
        System.out.println("My amount is: "+account.getBalance());

        // Abstraction focuses on hiding the complex implementation details and showing only the essential features of an object.
        MailServer mailServer = new MailServer();
        System.out.println("\nAbstraction");
        mailServer.sendEmail();

        // Inheritance in Java is the method to create a hierarchy between classes by inheriting from other classes.
        System.out.println("\nInheritance");
        Car car = new Car();
        car.start();

        // Polymorphism as the ability of a message to be displayed in more than one form.
        System.out.println("\nPolymorphism");
        drawUIControl(new CheckBox());
        drawUIControl(new TextBox());

    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}