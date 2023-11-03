import java.util.Date;
public class Donkey extends PackAnimal {
    public Donkey(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void displayCommands() {
        System.out.println("Donkey commands: carry, follow, bray");
    }
}

