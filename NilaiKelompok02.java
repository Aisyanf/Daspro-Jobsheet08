import java.util.Scanner;

public class NilaiKelompok02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int j;
        int i;
        int nilai;
        float totalNilai;
        float rataNilai = 0;
        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

        i = 1;
        while (i <= 5) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j=1; j<=5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " +j + " = ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Kelompok " + i + " : nilai rata rata " + rataNilai);
            System.out.println();

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
           
            i++;
        }

        System.out.println("Kelompok dengan rata rata Nilai Tertinggi adalah Kelompok " + kelompokTertinggi + " dengan rata rata " + rataNilai);
    }
    
}
