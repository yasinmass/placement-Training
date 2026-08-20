import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word ");
        String str = sc.nextLine();
        String reverse = "";
        for (int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println("revrese :" + reverse);
        sc.close();
    }
}
