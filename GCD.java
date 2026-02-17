import java.util.Scanner;

class GCD {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int re = Math.min(a,b);
        while (re > 0) {
            if (a % re == 0 && b % re == 0) {
                break;
            }
            re--;
        }
        System.out.println(re);
    }
}
