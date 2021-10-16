public class Method {
    public static long factorial(int n) {
        //TODO: complete this method
        long factorial = 1;

        //for (int i = n; i > 0; i--) {
        for (int i=1;i<=n;i++){  
        factorial = factorial * i;
        }
        return factorial;
    }
}