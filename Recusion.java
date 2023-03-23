/**
 * Recasion
 */
public class Recusion {

    public static int sumCalc(int n) {
        if(n==1){
            return 1;
        }
        int sum1=sumCalc(n-1);
        return n+ sum1;
        
    }

    public static void main(String[] args) {
        System.out.println(sumCalc(5));
    }
}