/*A multiple interface problem
interface 1 = logger wants to login , interface 2 = authenticator  
this  both is used in one main class 
*/
import java.util.Scanner;

interface Login{
    void logger();

}
interface authenticate{
    void authenticator();
}
class webServer implements Login , authenticate{
    private String EmailID;
    private String PassWord;
    private Scanner sc = new Scanner(System.in);
    /*public webServer (String email , String password) {
        this.EmailID = email;
        this.PassWord = password;*/
    @Override
    public void logger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the email ID: ");
        String email = sc.nextLine();
        System.out.println("enter your age : ");
        int age = sc.nextInt();
        System.out.println(" enter next for your authentication verification ->> ");

    }

    @Override
    public void authenticator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter your secret password ");
        String password = sc.nextLine();
        System.out.println("confrim your password : ");
        String password2 = sc.nextLine();
        if (password.equals(password2)){
            System.out.println("the password is saved");
            System.out.println("you can exit the screen now");
        }
        else{
            System.out.println("re enter the password ");
        }
    }

}
public class backendserviceInterface{
    public static void main(String[] args) {
        webServer wb = new webServer();
        boolean check = false;
        if (check){
            wb.logger();
        }else{
            wb.authenticator();

        }
    }
}