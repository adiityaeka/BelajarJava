import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {


        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));
        String currency = "Rp";

        double[] arrayGaji = {5000000, 6500000, 9500000};

        double[] arrayPersenLembur = {30, 32, 34, 36, 38};

        char golongan;
        int jamLembur;
        double gajiPokok = 0;
        double persenDiambil = 0;
        double gajiLembur = 0;
        double totalGaji;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pekerja Golongan (A/B/C) : ");
        golongan = scanner.next().toUpperCase().charAt(0);

        System.out.print("Jumlah Jam Lembur : ");
        jamLembur = scanner.nextInt();

        int indexGaji = -1;

        if (golongan == 'A') {
            indexGaji = 0;
        } else if (golongan == 'B') {
            indexGaji = 1;
        } else if (golongan == 'C') {
            indexGaji = 2;
        }

        if (indexGaji != -1) {
            gajiPokok = arrayGaji[indexGaji];

            if (jamLembur == 0) {
                persenDiambil = 0;
            } else if (jamLembur >= 5) {
                persenDiambil = arrayPersenLembur[4];
            } else {
                persenDiambil = arrayPersenLembur[jamLembur - 1];
            }

            gajiLembur = gajiPokok * (persenDiambil / 100);
            totalGaji = gajiPokok + gajiLembur;

            System.out.println("\nGaji Pokok = " + currency + " " + formatter.format(gajiPokok));
            System.out.println("Upah Lembur = " + currency + " " + formatter.format(gajiLembur));
            System.out.println("Total Penghasilan = " + currency + " " + formatter.format(totalGaji));

        } else {

        }

        scanner.close();
    }
}