import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Registry {
    private List<Animal> animals;
    private static int animalCount = 0;

    public Registry() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animalCount++;
    }

    public void displayAnimalCommands(int index) {
        Animal animal = animals.get(index);
        animal.displayCommands();
    }

    public void trainAnimal(int index, String command) {
        Animal animal = animals.get(index);
        
        if (animal instanceof Pet) {
            // Обучение новым командам только домашним животным
            ((Pet) animal).trainCommand(command);
        }
    }

    public void displayAnimalsByBirthDate() {
        // Сортировка животных по дате рождения
        List<Animal> sortedAnimals = new ArrayList<>(animals);
        sortedAnimals.sort(Comparator.comparing(Animal::getBirthDate));

        // Вывод списка животных по дате рождения
        for (Animal animal : sortedAnimals) {
            System.out.println(animal.getName() + " - " + animal.getBirthDate());
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
    
}
