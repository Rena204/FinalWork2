import java.util.Date;
public class Cat extends Pet {
    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void displayCommands() {
        System.out.println("Cat commands: jump, sleep, meow");
    }
}
