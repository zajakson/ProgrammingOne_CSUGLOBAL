
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Automobile {

    private String make;
    private String model;
    private int year;
    private String color;
    private int mileage;

    // Constructor
    public Automobile() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.color = "";
        this.mileage = 0;
    }

    // Getter and Setter methods for make
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    // Getter and Setter methods for model
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    // Getter and Setter methods for year
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    // Getter and Setter methods for color
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    // Getter and Setter methods for mileage
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return this.mileage;
    }
}

public class AutomobileInventory {

    private static ArrayList<Automobile> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Method to print the inventory
    public static void printInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("(ID#) Make  Model  Year  Color  [Mileage]");
        for (int i = 0; i < inventory.size(); i++) {
            Automobile car = inventory.get(i);
            System.out.printf("(%d) %s  %s  %d  (%s)  [%d]\n",
                    i + 1, car.getMake(), car.getModel(), car.getYear(), car.getColor(), car.getMileage());
        }
    }

    // Method to add a car to the inventory
    public static void addCar() {
        Automobile car = new Automobile();

        System.out.print("Make: ");
        car.setMake(scanner.nextLine());

        System.out.print("Model: ");
        car.setModel(scanner.nextLine());

        System.out.print("Year: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid year.");
            scanner.next();
        }
        car.setYear(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        System.out.print("Color: ");
        car.setColor(scanner.nextLine());

        System.out.print("Mileage: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid mileage.");
            scanner.next();
        }
        car.setMileage(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        inventory.add(car);
    }

    // Method to remove a car from the inventory
    public static void removeCar() {
        printInventory();
        System.out.print("Select ID# for car removal (or 'c' to cancel): ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("c")) {
            return;
        }

        try {
            int index = Integer.parseInt(input) - 1;
            if (index >= 0 && index < inventory.size()) {
                inventory.remove(index);
                System.out.println("Car removed successfully.");
            } else {
                System.out.println("Invalid ID#.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid ID#.");
        }
    }

    // Method to update a car in the inventory
    public static void updateCar() {
        printInventory();
        System.out.print("Select ID# for car update (or 'c' to cancel): ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("c")) {
            return;
        }

        try {
            int index = Integer.parseInt(input) - 1;
            if (index >= 0 && index < inventory.size()) {
                Automobile car = inventory.get(index);

                System.out.print("Make: ");
                car.setMake(scanner.nextLine());

                System.out.print("Model: ");
                car.setModel(scanner.nextLine());

                System.out.print("Year: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid year.");
                    scanner.next();
                }
                car.setYear(scanner.nextInt());
                scanner.nextLine(); // Consume newline

                System.out.print("Color: ");
                car.setColor(scanner.nextLine());

                System.out.print("Mileage: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid mileage.");
                    scanner.next();
                }
                car.setMileage(scanner.nextInt());
                scanner.nextLine(); // Consume newline

                System.out.println("Car updated successfully.");
            } else {
                System.out.println("Invalid ID#.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid ID#.");
        }
    }

    // Method to export the inventory to a text file
    public static void exportInventory() {
        String filePath = "Autos.txt";
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write("(ID#) Make  Model  Year  Color  [Mileage]\n");
            for (int i = 0; i < inventory.size(); i++) {
                Automobile car = inventory.get(i);
                fileWriter.write(String.format("(%d) %s  %s  %d  (%s)  [%d]\n",
                        i + 1, car.getMake(), car.getModel(), car.getYear(), car.getColor(), car.getMileage()));
            }
            System.out.println("Inventory saved to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Main menu method
    public static void mainMenu() {
        while (true) {
            System.out.println("# -------------------------------- #");
            System.out.println("| Automobile Inventory System (AIS)|");
            System.out.println("# -------------------------------- #");
            System.out.println("Choose from the following options:");
            System.out.println("  1. Add a new car");
            System.out.println("  2. Remove a car");
            System.out.println("  3. Update a car");
            System.out.println("  4. Print inventory");
            System.out.println("  5. Export inventory to text file");
            System.out.println("  6. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addCar();
                    break;
                case "2":
                    removeCar();
                    break;
                case "3":
                    updateCar();
                    break;
                case "4":
                    printInventory();
                    break;
                case "5":
                    exportInventory();
                    break;
                case "6":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
