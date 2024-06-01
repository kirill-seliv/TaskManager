import java.util.Arrays;

public class TaskManager {
    private Task[] tasks;

    public TaskManager() {
        this.tasks = new Task[0];
    }
    //[1,2,3] -> [1,2,3,null]
    public void addTask(Task task) {
        tasks = Arrays.copyOf(tasks, tasks.length + 1);
        tasks[tasks.length - 1] = task;
    }

    public void removeTask(String name) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getName().equals(name)) {
                tasks[i] = null;
            }
        }
    }

    public void viewTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

}
