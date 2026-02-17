import java.util.Scanner;

class LCM {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int re = Math.max(a, b);
        while (true) {
            if (re % a == 0 && re % b == 0) {
                break;
            }
            re++;
        }
        System.out.println(re);
    }
}
