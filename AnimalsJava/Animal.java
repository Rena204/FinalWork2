import java.util.Date;
public abstract class Animal {
    private String name;
    private Date birthDate;

    public Animal(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public abstract void displayCommands();
}
