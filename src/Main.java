import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printMenu();
        Scanner scanner = new Scanner(System.in);

        TaskManager taskManager = new TaskManager();

        while (scanner.hasNext()) {
            int action = scanner.nextInt();
            if (action < 1 || action > 4) {
                throw new RuntimeException("Вы выбрали несуществующее действие выберете от 1 до 4");
            }

            if (action == 1) {
                Task task = new Task();

                System.out.println("Введите имя задачи");
                while (scanner.hasNextLine()) {
                    String name = scanner.nextLine();
                    task.setName(name);
                    if (!name.isEmpty()) break;
                }

                System.out.println("Введите описание задачи");
                while (scanner.hasNextLine()) {
                    String description = scanner.nextLine();
                    task.setDescription(description);
                    if (!description.isEmpty()) break;
                }

                taskManager.addTask(task);
                System.out.println("Задача добавлена");
                printMenu();
            }
            else if (action == 2) {
                System.out.println("Введите имя задачи, которую вы хотите удалить");
                while (scanner.hasNextLine()) {
                    String name = scanner.nextLine();
                    taskManager.removeTask(name);
                    if (!name.isEmpty()) break;
                }
                System.out.println("Задача удалена");
                printMenu();
            }
            else if (action == 3) {
                taskManager.viewTasks();
                printMenu();
            }
            else if (action == 4) {
                System.out.println("Выхожу");
                break;
            }


        }

    }
    private static void printMenu() {
        System.out.println("Выбери действия");
        System.out.println("1 - Создать задачу");
        System.out.println("2 - Удалить задачу");
        System.out.println("3 - Посмотреть все задачи");
        System.out.println("4 - Выход");

    }

}
