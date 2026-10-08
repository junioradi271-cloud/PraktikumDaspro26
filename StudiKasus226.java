import java.util.Scanner;

public class StudiKasus226 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        System.out.print("Nama Mahasiswa : ");
        String nama = rear.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        String jenisKegiatan = rear.nextLine();
        System.out.print("Jumlah dokumen yang diupload (0-4) : ");
        int jumlahDokumen = rear.nextInt();

        int syaratDokumen;

       if (jumlahDokumen == 4){ 
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            int peringkat = rear.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                System.out.println("Status : Pendanaan diberikan dikarenakan memenuhi Syarat");
            } else {
                System.out.println("Status : Pendanaan tidak di berikan dikarenakan tidak juara");
            }
        } else {
            
        }
       } else {
        syaratDokumen = 4 - jumlahDokumen;
        System.out.println("maaf, jumlah dokumen kurang "+syaratDokumen);
       }
    }
    
}
