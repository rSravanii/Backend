/*An interface in Java is a special type of reference 
that defines a contract of methods a class must implement. 
It’s one of the core ways Java achieves abstraction
 */
// interface is a entity where as all fields are public static final and 
//all methods are public abstract bu default methods are also allowed in interface
// Interface suppose multiple inheritance

interface person{
    void talk();
}
class student implements person{
    public void talk(){
        System.out.println("student is talking");
    }
}
class teacher implements person{
    public void talk(){
        System.out.println("teacher is talking");
    }
}
public class interfaceEx {
    public static void main(String[] args) {
        student s = new student();
        teacher t = new teacher();
        s.talk();
        t.talk();
    }
}/*
  * output:student is talking
  * teacher is talking
  */