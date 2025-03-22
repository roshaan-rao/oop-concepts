import inheritance.Box;
import polymorphism.CheckBox;
import polymorphism.TextBox;
import polymorphism.UIControl;

public class Main {
    public static void main(String[] args) {

        // In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.
        Encapsulation encapsulation = new Encapsulation();
        System.out.println("Encapsulation");
        encapsulation.deposit(10);
        encapsulation.withdraw(5);
        System.out.println("\nMy amount is: "+encapsulation.getBalance());

        // Abstraction focuses on hiding the complex implementation details and showing only the essential features of an object.
        Abstraction abstraction = new Abstraction();
        System.out.println("\nAbstraction");
        abstraction.sendEmail();

        // Inheritance in Java is the method to create a hierarchy between classes by inheriting from other classes.
        System.out.println("\nInheritance");
        Box box = new Box();
        box.enable();

        // Polymorphism as the ability of a message to be displayed in more than one form.
        System.out.println("\nPolymorphism");
        drawUIControl(new CheckBox());
        drawUIControl(new TextBox());

    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}