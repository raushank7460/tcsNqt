package strings;

import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string :");
        String str=sc.nextLine();
       StringBuilder s=new StringBuilder(str);
      System.out.print(s.reverse());
       
    }
    
    
}
