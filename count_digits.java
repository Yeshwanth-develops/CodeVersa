import java.util.Scanner;

class cd {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int r, re=0;
while (n != 0) {
r = n % 10;
re = re + r;
n = n / 10;
}
System.out.println(re);
sc.close();
}
}