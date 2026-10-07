import java.util.Scanner;

public class StudiKasus126 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        int hargaPerCup = 17000;
        int JumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int Kembalian, Kurang;

        System.out.print("Masukkan Jumlah Cup : ");
        JumlahCup = rear.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = rear.nextInt();

        totalHarga = JumlahCup*hargaPerCup;
        diskon=0;

        if (totalHarga >= 90000) {
            diskon=totalHarga*7/100;
        } else {
            diskon=0;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("TOTAL HARGA         : "+totalHarga);
        System.out.println("DISKON              : "+diskon);
        System.out.println("TOTAL BAYAR         : "+totalBayar);

        if (uangBayar >= totalBayar) {
            Kembalian = uangBayar - totalBayar;
            System.out.println(Kembalian);
        } else {
            Kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup kurang Rp"+Kurang);
        }
    }
    
}
