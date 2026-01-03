public class Prime {
    public static void main(String[] args) {
        int n = 20;
        for(int i=1;i <= n;i++){
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        //to minimize the unnecessary checks we are using val * val <= n
        //because there is no need for checking 9 * 4 if we already checked 4 * 9
        int val = 2;
        while(val * val <= n){
            if(n % val == 0){
                return false;
            }
            val++;
        }
        return true;
    }
}
