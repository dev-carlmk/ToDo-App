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
        System.out.println("Total Tasks: " + tasks.size());
    }

    // Delete Tasks
    public void deleteTask(int id){
        boolean removed = false;
        
        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).id == id){
                tasks.remove(i);
                System.out.println("Tasks deleted successfully !");
                removed = true;
                break;
            }
        }
        if(!removed){
            System.out.println("Tasks not found!");
        }
    }

    // Search Task
    public void searchTask(String title){
        boolean found = false;
        for (Task t: tasks){
            t.displayTask();
            System.out.println("Task Found!");
            found = true;
        }
        if(!found){
            System.out.println("Task not found !");
        }
    }

    //Complete Task
    public void completeTask(int id){
        boolean complete = false;

        for(Task t: tasks){
            if(t.id == id){
                t.completed = true;
                complete = true;
                System.out.println("Task Completed!");
                break;
            }
        }
        if(!complete){
            System.out.println("Task not found!");
        }
    }


}