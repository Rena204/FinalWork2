import java.util.Date;
public class Hamster extends Pet {
    public Hamster(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void displayCommands() {
        System.out.println("Hamster commands: run, eat, play");
    }
}
