public class OperasiMatematika {
    public static void main(String[] args) {

        //Operasi Matematika Sesuai judul
        //Deklrasi dan inisiasi variabel bertype integer
        int a = 100;
        int b = 10;
        int c = 9;

        //Tambah
        System.out.println(a + b);
        //Kurang
        System.out.println(a - b);
        //Kali
        System.out.println(a * b);
        //Bagi
        System.out.println(a / b);
        //Modulo
        System.out.println(a % c);

        //Augmented Assignment
        int d = 100;

        //Ubah nilai d dan tampilkan ke layar
        d += 10;
        System.out.println(d);

        d -= 10;
        System.out.println(d);

        d *= 10;
        System.out.println(d);

        //Unary Operation
        //Deklrasi dan inisiasi
        int e = 100;
         //Sama saja dengan e = e +1
        e++;
        System.out.println(e);
        //Sama saja dengan e = e -1
        e--;
        System.out.println(e);

        //!kebalikannya
        System.out.println(!true);
    }
}
