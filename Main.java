import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int nextId = 1;

        System.out.println("Welcome to Java To-Do List!");

        while (true) { 
            // Show menu
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark task as done");
            System.out.println("4. Exit");
            System.out.println("------------");
            System.out.print("\nChoose an option: ");
            // ---- ----

            int choice = 0;

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid number!");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter task title: ");
                    String title = scanner.nextLine();
                    tasks.add(new Task(nextId, title));
                    nextId++;
                    System.out.println("Task added!");
                    break;
                
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Your list is empty!");
                    } else {
                        for(Task task : tasks) {
                            System.out.println(task);
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Enter ID task: ");
                    int ID = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    for (Task task : tasks) {
                        if (task.getId() == ID) {
                            task.markCompleted();
                            System.out.println("Task marked as done!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Task not found!");

                    break;
                
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }
}
