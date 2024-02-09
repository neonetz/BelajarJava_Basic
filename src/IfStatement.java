public class IfStatement {
    public static void main(String[] args) {
        //IF Statement
        //Deklrasi dan inisiasi variabel data bertype number
        var nilaiAbsen = 40;
        var nilaiUjian = 40;

        //Cek kondisi apakah true atau false kalau true akan mengeksukusi program if kalau false tidak akan di eksekusi
        if (nilaiAbsen >= 75 && nilaiUjian >= 75){
            System.out.println("Selamat anda lulus");
        }
        if (nilaiAbsen < 75 || nilaiUjian < 75){
            System.out.println("Selamat anda tidak lulus");
        }
        //Else statement
        if (nilaiAbsen >= 75 && nilaiUjian >= 75){
            System.out.println("Selamat anda lulus");
        }else System.out.println("Selamat anda sangat tidak lulus");

        //Else-if statement
        if (nilaiAbsen >= 80 && nilaiUjian >= 80){
            System.out.println("Nilai anda A");
        } else if (nilaiAbsen >= 70 && nilaiUjian >= 70){
            System.out.println("Nilai anda B");
        }else if(nilaiAbsen >= 60 && nilaiUjian >= 60) {
            System.out.println("Nilai anda C");
        }else if (nilaiAbsen >= 50 && nilaiUjian >= 50) {
            System.out.println("Nilai anda D");
        }else {
            System.out.println("Nilai anda E");
        }


    }
}
