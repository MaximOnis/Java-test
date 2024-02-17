import java.util.Scanner;

import static java.lang.String.copyValueOf;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String strr = doubleChar(str);
        System.out.println(strr);
    }
    public static String doubleChar(String str){
        int n = str.length() * 2;
        char[] str1 = new char[n];
        for (int i=0, j=0; j < n - 1 && i < str.length(); i++, j+=2){
            str1[j]=str.charAt(i);
            str1[j+1]=str.charAt(i);
        }
        return copyValueOf(str1);
    }
}
