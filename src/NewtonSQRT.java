public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(37));
    }
    static double sqrt(int n){

        //step 1 Initial Guess
        double x = n;

        double root;

        while(true){
            //step 2: Apply Newton Raphson Formula
            root = (x + (n / x)) / 2;
            //step 3 : check convergence
            if(Math.abs(root - x) < 0.5){
                break;
            }
            //step 4 : Update Guess
            x = root;
        }
        return root;
    }
}
