public class BSU_Member {
    int id;

    String name;

    char gender;

    int age;

    String status;

    //Lab work: Create default constructor and overloaded constructor, setter and getters
    // Default Constructor
    public BSU_Member() {
        this.id = 0;
        this.name = "";
        this.gender = ' ';
        this.age = 0;
        this.status = "";
    }

    // Overloaded Constructor
    public BSU_Member(int id, String name, char gender, int age, String status) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public void display_information() {
        System.out.println("Status: " + status);
    }
}
