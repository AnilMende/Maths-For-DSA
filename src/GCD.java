public class GCD {
    public static void main(String[] args) {
        System.out.println("GCD is " + gcd(24,36));
        System.out.println(lcm(24,36));
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }

    //lcm(a,b) = a * b/gcd(a,b)
    //example : lcm(2,4) = 2 * 4 / gcd(2,4)
    //2 * 4 / 2 => 4
    static int lcm(int a,int b){
        return a * b / gcd(a,b);
    }
}
