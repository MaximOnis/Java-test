import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String base = scan.nextLine();
        String remove = scan.nextLine();
        String res = removeStr(base, remove);
        System.out.println(res);
    }
    public static String removeStr(String base, String remove){
        return base.replaceAll(remove, "");
    }
}