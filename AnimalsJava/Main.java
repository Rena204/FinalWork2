import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registry registry = new Registry();
        
        while (true) {
            System.out.println("\n1. Добавить новое животное");
            System.out.println("2. Список команд животного");
            System.out.println("3. Обучение новым командам");
            System.out.println("4. Вывести список животных по дате рождения");
            System.out.println("5. Вывести общее количество животных");
            System.out.println("0. Выход");
            
            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Введите тип животного (dog, cat, hamster, horse, camel, donkey): ");
                    String type = scanner.nextLine();
                    
                    System.out.print("Введите имя животного: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Введите дату рождения животного (гггг-мм-дд): ");
                    String birthDateStr = scanner.nextLine();
                    Date birthDate;
                    
                    try {
                        birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthDateStr);
                    } catch (ParseException e) {
                        System.out.println("Некорректный формат даты.");
                        continue;
                    }
                    
                    Animal animal;
                    
                    switch (type) {
                        case "dog":
                            animal = new Dog(name, birthDate);
                            break;
                        case "cat":
                            animal = new Cat(name, birthDate);
                            break;
                        case "hamster":
                            animal = new Hamster(name, birthDate);
                            break;
                        case "horse":
                            animal = new Horse(name, birthDate);
                            break;
                        case "camel":
                            animal = new Camel(name, birthDate);
                            break;
                        case "donkey":
                            animal = new Donkey(name, birthDate);
                            break;
                        default:
                            System.out.println("Некорректный тип животного.");
                            continue;
                    }
                    
                    registry.addAnimal(animal);
                    System.out.println("Животное добавлено в реестр.");
                    break;
                case 2:
                    System.out.print("Введите индекс животного: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    registry.displayAnimalCommands(index);
                    break;
                case 3:
                    System.out.print("Введите индекс животного: ");
                    int trainIndex = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    System.out.print("Введите новую команду: ");
                    String trainCommand = scanner.nextLine();
                    
                    registry.trainAnimal(trainIndex, trainCommand);
                    break;
                case 4:
                    registry.displayAnimalsByBirthDate();
                    break;
                case 5:
                    System.out.println("Общее количество животных: " + Registry.getAnimalCount());
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        }
    }
}

