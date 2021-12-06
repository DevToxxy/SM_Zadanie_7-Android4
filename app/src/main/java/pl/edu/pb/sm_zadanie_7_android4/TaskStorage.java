package pl.edu.pb.sm_zadanie_7_android4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();

    private final List<Task> tasks;

    public static TaskStorage getInstance() {
        return taskStorage;
    }

    private TaskStorage() {
        tasks = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Task task = new Task();
            task.setName("Task number: " + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getSingleTask(UUID taskId) {
        Task foundTask = new Task();
        for (Task task : tasks) {
            if (task.getId().equals(taskId)) {
                foundTask = task;
            }
        }
        return foundTask;
    }
    public void addTask(Task task){
        tasks.add(task);
    }
}
