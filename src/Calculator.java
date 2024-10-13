// import scanner untruk membac inputan dari consol
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // memulai loop while yang akan berjalan terus hingga kondisi break
        while (true) {
            // Menampilkan Pilihan
            System.out.println("Pilihan Operasi \n1.Penjumlahan\n2.Pengurangan\n3.Perkalian\n4.Pembagian");

            // Membuat input untulk memilih operasi
            System.out.print("Masukan pilihan: ");
            // Membuat input dan menyimpannya dalam variabel pilihan
            int pilihan = input.nextInt();

            // Membuat kondisi apabila memasukan pilihan yang tidak valid akan mengulangi lagi
            if (pilihan <  1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid, Silakan coba lagi: ");
                input.nextLine();
                continue;
            }
            double num1, num2, hasil;
            System.out.print("Masukan angka ke-1: ");
            num1 = input.nextDouble();
            System.out.print("Masukan angka ke-2: ");
            num2 = input.nextDouble();
            hasil = 0;
            switch(pilihan){
                case 1:
                    hasil = num1 + num2;
                    break;
                case 2:
                    hasil = num1 - num2;
                    break;
                case 3:
                    hasil = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        hasil = num1 / num2;
                    } else {
                        System.out.println("Tidak bisa dibagi dengan angka 0");
                    }
                    break;
            }
            if (pilihan == 4 && pilihan != 0){
                System.out.println("Hasil = "+ hasil);
            }else if (pilihan != 4) System.out.println("Hasil = " + hasil);
            System.out.print("Apakah ingin melanjutkan? (y/n): ");
            input.nextLine();
            String jawwaban  = input.nextLine();
            if (jawwaban.equalsIgnoreCase("n")) {
                break;
            }
            }input.close();
        }
}
