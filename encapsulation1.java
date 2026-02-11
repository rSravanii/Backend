// Student class in Java
//Create a Java program for the Student class which comes like student name student number studentgrade and student course etc.
class studentDetails {
    String studentName;
    int studentNumber;
    String studentCourse;
    String studentBranch;

    private studentDetails(String name, int rollno, String course, String branch) {
        this.studentName = name;
        this.studentNumber = rollno;
        this.studentCourse = course;
        this.studentBranch = branch;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentNumber(int rollno) {
        this.studentNumber = rollno;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentCourse(String course) {
        this.studentCourse = course;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentBranch(String branch) {
        this.studentBranch = branch;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public static void main(String[] args) {
        studentDetails st1 = new studentDetails("Sravani Ravula ", 12345, "b.tech", "csm");
        studentDetails st2 = new studentDetails("sravan reddy", 12346, "b.tech", "cse");
        System.out.println("Student Name: " + st1.getStudentName());
        System.out.println("Student Number: " + st1.getStudentNumber());
        System.out.println("Student Course: " + st1.getStudentCourse());
        System.out.println("Student Branch: " + st1.getStudentBranch());
        System.out.println(("================================"));
        System.out.println("Student Name: " + st2.getStudentName());
        System.out.println("Student Number: " + st2.getStudentNumber());
        System.out.println("Student Course: " + st2.getStudentCourse());
        System.out.println("Student Branch: " + st2.getStudentBranch());
    }
}
