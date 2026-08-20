import java.util.*;
public class palindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = sc.nextLine();
        String palindrome = "";
        String org = str;
        for (int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            palindrome = palindrome + ch;
        }
        if (org.equals(palindrome)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
        System.out.println(palindrome);
        sc.close();
    }
    
}
