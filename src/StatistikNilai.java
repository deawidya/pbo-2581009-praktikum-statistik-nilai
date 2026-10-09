
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StatistikNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> daftar = new ArrayList<>();

        System.out.println("Ketik -1 untuk selesai. Nilai valid: 0-100.");

        while (true) {
            System.out.print("Nilai ke-" + (daftar.size() + 1) + ": ");
            int nilai = input.nextInt();

            if (nilai == -1) {
                break;
            }

            daftar.add(nilai);
        }

        while (true) {
            System.out.print("Nilai ke-" + (daftar.size() + 1) + ": ");
            int nilai = input.nextInt();

            if (nilai == -1) {
                break;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("Ditolak, nilai harus 0-100.");
                continue;
            }

            daftar.add(nilai);
        }

        input.close();
    }
}