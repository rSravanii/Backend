
import java.util.Scanner;

public class advancedString {
    public static void main(String[] args) {
        String str = " Hello Java ";

        // Manipulation
        System.out.println(str.substring(1,6));   // "Hello"
        System.out.println(str.replace("Java","World")); // " Hello World "
        System.out.println(str.split(" ")[2]);   // "Java"

        // Checking
        System.out.println(str.contains("Java")); // true
        System.out.println(str.startsWith(" "));  // true
        System.out.println(str.endsWith(" "));    // true
        System.out.println(str.isEmpty());        // false

        // Formatting
        System.out.println(str.trim());           // "Hello Java"
        System.out.println(str.toLowerCase());    // " hello java "
        System.out.println(str.toUpperCase());    // " HELLO JAVA "

        // StringBuilder example
        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" Sravani");
        System.out.println(sb); // "Hi Sravani"
    }
}

//WORDCOUNT.JAVA
//input sentence and count the number of words in it

class wordCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("enter the String:");
        String word = sc.nextLine();
        sb.append(word);
        System.out.println("the entered String is: "+ word);
        String[] words = word.split(" ");
        System.out.println("the no of words (wordsCount) in the given String is :" + words.length);
        
    }
    /*output:
enter the String:
hello world java programming
the entered String is: hello world java programming
the no of words (wordsCount) in the given String is :4*/

}
//remove extra spaces from the given String
class removeExtraSpaces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("enter the String:");
        String str = sc.nextLine();
        sb.append(str);
        System.out.println("the entered String is: "+ str);
        String result = sb.toString().replaceAll("\\s+", " ").trim();// the reason we use replaceAll("\\s+", " ").trim() is because trim() alone cannot handle multiple spaces inside the string.

        System.out.println("the String after removing extra spaces is: " + result);
    }
    /*output:
enter the String:
   hello    world   java programming
the entered String is:    hello    world   java programming
the String after removing extra spaces is: hello world java programming*/
}

