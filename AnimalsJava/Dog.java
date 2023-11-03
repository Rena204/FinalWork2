import java.util.Date;
public class Dog extends Pet {
    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void displayCommands() {
        System.out.println("Dog commands: sit, stay, fetch");
    }
}

