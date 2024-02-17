import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String text1 = scan.nextLine();
    String text2 = scan.nextLine();
    boolean result = endOther(text1, text2);
    System.out.println(result);
    }

    public static boolean endOther(String text1, String text2){
        boolean bool = true;
        char[] text22 = text2.toLowerCase().toCharArray();
        char[] text11 = text1.toLowerCase().toCharArray();
        if (text11.length > text22.length){
            int n = text22.length;
            int t = text11.length - text22.length;
            for (int i=n-1; i>=0; i--){
                if (text22[i]!=text11[i+t]){
                    bool = false;
                    break;
                }
            }
        } else if (text11.length < text22.length){
            int n = text11.length;
            int t = text22.length - text11.length;
            for (int i=n-1; i>=0; i--) {
                if (text22[i+t] != text11[i]) {
                    bool = false;
                    break;
                }
            }
        } else{
            int n = text11.length;
            for (int i=n-1; i>=0; i--) {
                if (text22[i] != text11[i]) {
                    bool = false;
                    break;
                }
            }
        }
        return bool;
    }
}
