import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        boolean result = catDog(text);
        System.out.println(result);
    }
   public static boolean catDog(String text){
        char[] mas = text.toCharArray();
        int cat=0, dog=0;
        for (int i=0; i< mas.length-2; i++){
            if ( mas[i]=='c' && mas[i+1]=='a' && mas[i+2]=='t'){
                cat++;
            } else if (mas[i]=='d' && mas[i+1]=='o' && mas[i+2]=='g') {
                dog++;
            }
        }
        return dog==cat;
   }
}
