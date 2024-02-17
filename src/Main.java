/*public class Main {
    public static void main(String[] args) {
        String text = "fdxxxxsghjxxxjkdxxsdfx";
        int res = count(text);
        System.out.println(res);
    }
    public static int count(String text){
        int res=0;
        String g ="xx";
        for (int i=0; i<text.length()-1; i++){
            if (text.substring(i, i+2).equalsIgnoreCase(g)){
                res++;
            }
        }
        return res;
    }
}*/
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        double x =0.6;
        double res = count(x);
        System.out.println(res);
    }
    public static double count(double x){
        double res = 0;
        for (int k=1; k<=5; k++){
            if (k==3){
                res+=0;
            }else {
                res+=(Math.pow(-1, k+1)*Math.pow(x+k, 2*k))/(fact(2*k));
            }
        }
        return res;
    }
    public static int fact(int i){
        int res = 1;
        for (int j=2; j<=i; j++){
            res*=j;
        }
        return res;
    }
}