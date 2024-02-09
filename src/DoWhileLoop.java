public class DoWhileLoop {
    public static void main(String[] args) {
        //Deklrasi dan inisiasi
        var counter = 1;

        //Akan perulangan dulu kemudian di cek kondisinya jadi minimal ada 1 kali perulangan
        do {
            System.out.println("Perulangan ke " +counter);
            counter++;
            //Cek kondisi s=di akhir
        }while (counter <=10);

        //Deklrasi dan inisiasi
        var counter1 = 100;

        //Contohnya
        //Akan perulangan dulu kemudian di cek kondisinya jadi minimal ada 1 kali perulangan
        do {
            System.out.println("Perulangan ke " +counter1);
            counter1++;
            //Cek kondisi di akhir
        }while (counter1 <=10);
    }


}
