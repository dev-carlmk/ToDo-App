import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TaskManager{

    // Add Task
    public void addTask(Task task){
        String sql = "INSERT INTO tasks VALUES(?,?,?)";
        try(
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
        ) {
            pst.setInt(1, task.id);
            pst.setString(2, task.title);
            pst.setBoolean(3, task.completed);

            pst.executeUpdate();
            System.out.println("Task Added!");
        
        } catch (Exception e){
            System.out.println("Add Error: " + e.getMessage());
        }
    }

    // View Task
    public void viewTasks(){
        String sql = "SELECT * FROM tasks";
        try(
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
        ) {
            boolean found = false;
            while(rs.next()){
                found = true;

                System.out.println("ID: " + rs.getInt("id") +
                                   ", Task: " + rs.getString("title") +
                                   ", Completed: " + rs.getBoolean("completed"));
            }
            if(!found){
                System.out.println("No tasks found.");
            }
        } catch (Exception e){
            System.out.println("View Error: " + e.getMessage());
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