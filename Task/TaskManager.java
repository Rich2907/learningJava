import java.util.*;
public class TaskManager{
    ArrayList<Task> tasks = new ArrayList<>();

    void addTask(Task t)
    {
        tasks.add(t);
        System.out.println("Task added successfully");
    }
    void deleteTask(int id)
    {
            for(Task t: tasks)
            {
                if(t.id==id)
                {
                    tasks.remove(t);
                    System.out.println("Task deleted successfully");
                    return ;
                }
            }
            System.out.println("Task not found");

    }
  void updateTask(int id,String title, String description, String dueDate)
  {
        for(Task t:tasks )
        {
        if(t.id==id)
        {
            t.title=title;
            t.description=description;
            t.completed=false;
            t.dueDate=dueDate;
            System.out.println("Task updated successfully");
            return;
        }
        System.out.println("Task not found");
        }

         }
 void markTaskCompleted(int id)
 {
    for(Task t:tasks)
    {
        if(t.id==id)
        {
            t.completed=true;
            System.out.println("Successfully completed");
            return ;
        }}
        
        System.out.println("Task not found");
    
 }
 void listAllTask()
 {
    if(tasks.isEmpty())
    {
        System.out.println("No tasks available");
        return ;
    }
    for(Task t:tasks)
    {
        t.display();
    }
 }

}