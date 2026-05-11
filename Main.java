import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int TaskId = 1;

        while(true){
            System.out.println("\n----------TO-DO APP----------");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Count Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Search Task");
            System.out.println("6. Complete Task");
            System.out.println("7. Exit");

            System.out.println("Choose Option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                System.out.println("Enter the task title: ");
                String title = sc.nextLine();
                Task task = new Task(TaskId, title);
                manager.addTask(task);
                TaskId++;
            
            }else if(choice == 2){
                manager.viewTasks();
            
            }else if(choice == 3){
                manager.countTasks();
            
            }else if(choice == 4){
                System.out.println("Enter ID to delete: ");
                int id = sc.nextInt();
                sc.nextLine();
                manager.deleteTask(id);
            
            }else if(choice == 5){
                System.out.println("Enter Title to search: ");
                String title = sc.nextLine();
                manager.searchTask(title);
            
            }else if(choice == 6){
                System.out.println("Enter TaskID to complete: ");
                int id = sc.nextInt();
                sc.nextLine();
            
            }else if(choice == 7){
                System.out.println("Exiting.....");
                break;
            
            }else{
                System.out.println("Invalid Input");
            }
        }
        sc.close();
    }
}