import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o = n;
        int re=0,r;
        while (n > 0) {
            r = n % 10;
            re = re * 10 + r;
            n /= 10;
        }
        if (o == re) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
