import java.util.*;
class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int o =n;
        int re=0,r;
        while (n != 0) {
            r = n % 10;
            re += Math.pow(r, 3);
            n /= 10;
        } 
       if (re == o) {
        System.out.println("Armstrong Number");
       } else {
        System.out.println("Not an Armstrong Number");
       }
    }
}
