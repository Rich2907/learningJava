public class Task{
 int id;
 String title;
 String description;
 boolean completed;
 String dueDate;

 public Task(int id,String title, String description,String dueDate){
this.id=id;
this.title=title;
this.description=description;
this.completed=false;
this.dueDate=dueDate;
}
public void display()
{
    System.out.println("ID: "+id);
    System.out.println("Title: "+title);
    System.out.println("Description: "+description);
    System.out.println("Completed: "+completed);
    System.out.println("Due Date: "+dueDate);
    System.out.println("-----------------------------------------------");
}


}