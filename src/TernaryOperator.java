public class TernaryOperator {
    public static void main(String[] args) {
        //Tanpa menggunakan ternary operator
        //Deklrasai dan inisiasi variabel bertype number
        var nilai = 80;
        String ucapan;

        //Kondisi tanpa ternary operator
        if (nilai >= 75){
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Selamat anda di dropout";
        }
        //Tampilkan ke layar
        System.out.println(ucapan);

        //Dengan ternary operator
        //Deklarai dan inisiasi variabel bertype number
        var nilai1 = 75;
        //Kondisi dengan ternary operator
        ucapan = nilai1 >= 75 ? "Selamat Datang" : "Selamat Jalan";
        //Tampilkan ke layar
        System.out.println(ucapan);


    }


}
