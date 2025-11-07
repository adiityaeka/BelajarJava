import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;


public class Tugas2 {
    public static void main(String[] args){

        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));

        String currency = "Rp";
        double gaPokA = 5000000;
        double gaPokB = 6500000;
        double gaPokC = 9500000;
        char golongan;
        int jamLembur;
        double gajiPokok = 0;
        double persenLembur = 0 ;
        double gajiLembur;
        double totalGaji;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pekerja Golongan (A/B/C) : ");
        golongan = scanner .next() .toUpperCase().charAt(0);

        System.out.print("Jumlah Jam Lembur : ");
        jamLembur = scanner .nextInt();

        if(golongan == 'A'){
            gajiPokok = gaPokA;
        } else if (golongan == 'B') {
            gajiPokok = gaPokB;
        } else if (golongan == 'C') {
            gajiPokok = gaPokC;
        } else{

        }

        if(gajiPokok > 0){

            switch (jamLembur){
                case 0: persenLembur = 0; break;
                case 1: persenLembur = 0.30; break;
                case 2: persenLembur = 0.32; break;
                case 3: persenLembur = 0.34; break;
                case 4: persenLembur = 0.36; break;
                default:
                    if (jamLembur >= 5){
                        persenLembur = 0.38;
                    } else{

                    }
                    break;
            }
        gajiLembur = gajiPokok * persenLembur;
        totalGaji = gajiPokok + gajiLembur;

        System.out.println("\nGaji Pokok = " + currency + formatter .format(gajiPokok));
        System.out.println("Upah Lembur = " + currency + formatter .format(gajiLembur));
        System.out.println("Total Penghasilan : " + currency + formatter .format(totalGaji));
        } else {

        }

        scanner .close();
    }
}
