//teacher class which is also servs as super class
class teacher {
    // member variables of teacher class
    String subject;
    String city;
    String name;
    int id;

    // functions to set valuse of subject ,city,name,age
    void setsubject(String subject) {
        this.subject = subject;
    }

    void setcity(String city) {
        this.city = city;
    }

    void setname(String name) {
        this.name = name;
    }

    void setid(int id) {
        this.id = id;
    }

    // functions to get values of subject,city,name,id
    String getsubject() {
        return subject;
    }

    String getcity() {
        return city;
    }

    String getname() {
        return name;
    }

    int getid() {
        return id;
    }
}// end of teacher class

// student class which inharits features of teacher class
class student extends teacher {
    // member variable of student class
    int marks;

    // function to set value of marks
    void setmarks(int marks) {
        this.marks = marks;
    }

    // function to get value of marks
    int getmarks() {
        return marks;
    }
}// end of student class
 // main class

public class inharitance {
    public static void main(String args[]) {
        // creating an object of student class
        student student1_1 = new student();
        // accessing setter functions of teacher and student class with the help of
        // object of student class
        student1_1.setname("nikhil");
        student1_1.setcity("hamirpur");
        student1_1.setid(47022);
        student1_1.setmarks(60);
        // accessing getter functions of teacher and student class with the help of
        // object of student class
        System.out.println("student name is = " + student1_1.getname());
        System.out.println("student city is = " + student1_1.getcity());
        System.out.println("student id is = " + student1_1.getid());
        System.out.println("student marks is = " + student1_1.getmarks());
    }
}
