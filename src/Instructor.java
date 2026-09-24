public class Instructor extends BSU_Member {

    String department;

    Instructor(){
        this.department = "CS";
        this.status = "Faculty";

    }

    //Task: Create a display method that will print the department name and status
    @Override
    public void display_informatrion(){
        System.out.println("Inside Instructor - Department "+ this.department + " Status "+ this.status);
    }
}
