import java.util.*;

class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i=1;i*i<=n;i++) {
            if (n % i == 0) {
                ar.add(i);

                if (i != n/i) {
                    ar.add(n/i);
                }
            }
        }
        Collections.sort(ar);
        System.err.println(ar);
        sc.close();
    }
}