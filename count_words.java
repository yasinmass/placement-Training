import java.util.*;
public class count_words {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        count+=1;
        System.out.println("count :"+ count);
        sc.close();
    }
}
