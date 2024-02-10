public class MethodReturnValue {
    public static void main(String[] args) {

        //Deklarasi dan inisiasi
        var a = 100;
        var b = 200;
        //Memanggi; method dengan return value
        var c = sum(a,b);

        //Lebih sederhana
        var result = sum(200,200);
        //Tampilkan ke layar
        System.out.println(c);

        System.out.println(result);

        System.out.println("Kompleksto");
        //Memanggil method yang lebih kompleks menggunakan sout
        System.out.println(hitung(200,"+",300));
        System.out.println(hitung(200,"-",300));
        System.out.println(hitung(200,"&",300));

    }

    //Method dengan return value
    static int sum(int value1, int value2){
        var total = value1 + value2;
        //Harus memakai return
        return total;
    }

    //Method dengan return value untuk kasus lebih kompleks
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default :
                System.out.println("Cuman ada plus dan minus");
                return 0;

        }
    }
}
