public class SquareRootofNumber {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(FindSquare(n,p));
    }
    static double FindSquare(int n, int p){
        int start = 0;
        int end = n;

        double root = 0.0;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid == n){
                return mid;
            }

            if(mid * mid > n){
                end = mid - 1;
            }
            else{
                //root holds the largest integer value which satisfies
                // mid * mid <= n
                root = mid;
                start = mid + 1;
            }
        }
        //if the particular number is not perfect square we will get -1
        //to avoid this we are adding the decimal values to the nearest number that is
        //num * num <= n by adding 0.1 to the num
        //to find the acurate answer we decrement the incr to next decimal place
        double incr = 0.1;
        for(int i=0;i < p;i++){
            while(root * root <= n){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
