public class Course {

    String name;

    int course_number;

    int credit;

    private String classroom;

    //Students
    //Intructor

    Course(){
        name = "";
        course_number = 0;
        credit = 0;
    }
    // Setters and getters are similar to methods
    // Methods signature: Access_modifier Return_type Method_name (Param_type Param_name){}
    // Return types: void, int, String, boolean, char, array of objects

    Course(int course_number, int credit, String name) {
        this.course_number= course_number;
        this.credit = credit;
        this.name= name;
    }


    public void Set_Classroom(String classroom){
       this.classroom = classroom;
    }

    public String get_Classroom (){
        return this.classroom;
    }

    public void display_course_information (){
        System.out.println("Course name: " + this.name + " Course number" + this.course_number);
    }
}

1