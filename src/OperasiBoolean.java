public class OperasiBoolean {
    public static void main(String[] args) {

        //Deklrasi dan inisiasi variabel bertype number
        var nilaiETS = 75;
        var nilaiEAS = 75;


        //Operasi boolean
        boolean lulusETS = nilaiETS >= 75;
        boolean lulusEAS = nilaiEAS >= 75;

        //Cek apakah lulus atau tidak menggunakan boolean
        var lulus = lulusETS && lulusEAS;
        //Tampilkan ke layar
        System.out.println(lulus);

        //Mengganti nilai ETS dan EAS
        nilaiETS = 40;
        nilaiEAS = 40;

        //Operasi boolean
        lulusETS = nilaiETS >= 75;
        lulusEAS = nilaiEAS >= 75;

        //Cek apakah lulus atau tidak menggunakan boolean
        lulus = lulusETS && lulusEAS;
        //Tampilkan ke layar
        System.out.println(lulus);

    }
}
