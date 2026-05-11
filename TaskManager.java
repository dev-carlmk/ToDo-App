import java.util.ArrayList;
public class TaskManager{
    ArrayList<Task>tasks = new ArrayList<>();

    // Add Task
    public void addTask(Task task){
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    // View Task
    public void viewTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks found!");
        }else{
            for(Task t: tasks){
                t.displayTask();
            }
        }
    }

    //Count Tasks
    public void countTasks(){
        System.out.println("Total Asks: " + tasks.size());
    }
}