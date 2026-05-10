public class Task {

    int id;
    String title;
    boolean completed;

    // Constructor
    public Task(int id, String title) {

        this.id = id;
        this.title = title;
        this.completed = false;
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