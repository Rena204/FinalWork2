import java.util.Date;
public class Camel extends PackAnimal {
    public Camel(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void displayCommands() {
        System.out.println("Camel commands: sit, stand, walk");
    }
}

