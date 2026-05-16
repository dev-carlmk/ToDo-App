public class Task {

    int id;
    String title;
    boolean completed;

    // Constructor
    public Task(int id, String title, boolean completed) {

        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    // Display Task
    public void displayTask() {

        System.out.println(
                "ID: " + id +
                ", Task: " + title +
                ", Completed: " + completed
        );
    }
}