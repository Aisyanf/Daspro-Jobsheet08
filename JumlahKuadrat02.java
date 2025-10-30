import java.util.Scanner;

public class JumlahKuadrat02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahKuadrat = 0;
        int N;
        System.out.print("Masukkan nilai N : ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("n = " + i + " = jumlah kuadrat = ");

            for (int j = 1; j <= i; j++) {
                jumlahKuadrat += j * j;
                System.out.print(j * j);
                if (j < i) System.out.print(" + ");
            }

            System.out.println(" = " + jumlahKuadrat);
        }

        sc.close();
    }
}
