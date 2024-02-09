public class BreakandContinue {
    public static void main(String[] args) {
        //Penggunaan break
        //Deklrasi dan inisiasi variabel
        var counter = 1;
        //Perulangan tak henti dengan true selalu akan tetap berhenti dengan break
        while (true) {
            System.out.println("Perulangan ke - "+counter);
            counter++;

            if(counter >10){
                //Menghentikan perulangan
                break;
            }
            //Bukti perulangan berhenti
            System.out.println("Perulangan Berhenti");

        }

        //Penggunaan continue
        //Perulangan dengan menggunakan continue
        //Contoh program mencari ganjil dari 100
        for(var hitung = 1;hitung<=100;hitung++){
            //Cek kondisi apakah ganjil atau tidak
            if(hitung %2 == 0){
                //Akan melewati eksekusi program selanjutnya dan kembali ke perulangan
                continue;
            }
            //Tampilkan ke layar
            System.out.println("Perulangan ganjil ke - "+ hitung);
        }

        //Contoh program mencari genap dari 100
        for(var hitung = 1;hitung<=100;hitung++){
            //Cek kondisi apakah ganjil atau tidak
            if(hitung %2 == 1){
                //Akan melewati eksekusi program selanjutnya dan kembali ke perulangan
                continue;
            }
            //Tampilkan ke layar
            System.out.println("Perulangan genap ke - "+ hitung);
        }


    }
}
