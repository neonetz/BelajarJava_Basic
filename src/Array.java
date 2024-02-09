import java.net.SocketOption;

public class Array {

    public static void main(String[] args) {

        String[] stringArray;
        //Membuat array dengan panjang 3
        stringArray = new String[3];

        //Menambahkan data ke array 1
        stringArray[0] = "Muhammad";

        //Menambahkan data ke array 2
        stringArray[1] = "Adhyaksa";

        //Menambahkan data ke array 3
        stringArray[2] = "Fadillah";

        //Tampilkan array ke layar
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //Mengubah array caranya seperti ini:
        stringArray[0] = "Wakatta";
        //Tampilkan ke layar
        System.out.println(stringArray[0]);


        //Ada beberapa cara membuat array
        //Cara yang pertama
        String[] stringArray2 = new String[3];

        //Cara yang kedua
        String[] NamaWaifu = {
                "Sakayanagi Arisu" , "Horikita is the goat" , "Ichinose" , "Nama sakura pasti beban"
        };

        //Cara yang ketiga
        int[] arrayint = new int[] {
                1,2,3,4,5,6,7,8,9,10
        };

        //Cara yang keempat
        long[] arraypanjang = {
                12,3,42,4,2,42,11111
        };

        //Coba coba fungsi array
        int[] arrayinteger = {
                1,2,3,4,5,6,7,8,9,10
        };

        //Mengambil panjang data array
        System.out.println(arrayint.length);

        //Cara membuat array dalam array
        String[][] Members = {
                {"Sakayanagi" ,"Arisu"},
                {"Ichinouse"  ,"Barangkali"},
                {"Some"},
                {"Somedude","In Basketball"}
        };

        //Tampilkan array dalam array ke layar
        System.out.println(Members[0][1]);
        System.out.println(Members[1][1]);
        System.out.println(Members[2][0]);
        System.out.println(Members[3][1]);


    }
}
