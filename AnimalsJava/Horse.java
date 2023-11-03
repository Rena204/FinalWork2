import java.util.Date;
public class Horse extends PackAnimal {
    public Horse(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void displayCommands() {
        System.out.println("Horse commands: walk, trot, gallop");
    }
}

