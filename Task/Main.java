import java.util.*;
public class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter your choice");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Update Task"); 
        System.out.println("4. Delete Task");
        System.out.println("5. Mark Complete");
        int choice=sc.nextInt();
        TaskManager manager = new TaskManager();
        if(choice == 6)
            break;
        switch (choice) {
            case 1:
                System.out.println("Enter id");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter title");
                String title=sc.nextLine();
                System.out.println("Enter Description");
                String description=sc.nextLine();
                System.out.println("Enter Due Date");
                String dueDate=sc.nextLine();
                Task task=new Task(id,title,description,dueDate);
                manager.addTask(task);
                break;
            case 2:
                manager.listAllTask();
                break;
            case 3:
                System.out.println("Enter id");
                 id=sc.nextInt();
                 sc.nextLine();
                System.out.println("Enter title");
                 title=sc.nextLine();
                System.out.println("Enter Description");
                 description=sc.nextLine();
                System.out.println("Enter Due Date");
                 dueDate=sc.nextLine();
                manager.updateTask(id,title,description,dueDate);
                break;
            case 4:
                System.out.println("Enter the id that has to be deleted");
             id=sc.nextInt();
             sc.nextLine();
                manager.deleteTask(id);
                break;
            case 5:
                System.out.println("Enter the id of the task that need to be marked completed");
                 id=sc.nextInt();
                 sc.nextLine();
                manager.markTaskCompleted(id);
                break;
    
            default:System.out.println("Wrong option selected");
                break;
        }
    }
    }

}