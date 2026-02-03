
//reverseString.java
//Reverse without built in reverse
import java.util.Scanner;

class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the string");
        String s1 = sc.nextLine();
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
    }// output:eneter the string
     // sravani
     // inavars
}

// PalindromeString.java
// check polindrone

class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the string");
        String s1 = sc.nextLine();
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }// output:eneter the string
     // sravani
     // Not palindrome
}

// countvovelsconsonants.java
// count vowels ,consonants ,spaces
class countvovelsconsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the string");
        String s1 = sc.nextLine();
        int vcount = 0, ccount = 0, spacecount = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vcount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                ccount++;
            } else if (ch == ' ') {
                spacecount++;
            }
        }
        System.out.println("Vowels: " + vcount);
        System.out.println("Consonants: " + ccount);
        System.out.println("Spaces: " + spacecount);
    }// output:eneter the string
     // Hello World
     // Vowels: 3
     // Consonants: 7
     // Spaces: 1
}

// Stringcomparision.java
// usin == equals() new string
class stringcomparision {
    public static void main(String[] args) {
        String list1 = "hello";
        String list2 = "hello";
        String list3 = new String("hello");
        System.out.println(list1 == list2); // true
        System.out.println((list1 == list3)); // false
        System.out.println((list1.equals(list3))); // true
        System.out.println((list2.equals(list3))); // true

    }
}

// length od last word

class lengthoflastword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s1 = sc.nextLine();
        String[] s2 = s1.split(" ");
        System.out.println(s2[s2.length - 1].length());
    }
    // output:enter the string
    // this is java language
    // 8
}
