public class RecursiveMethod {
    public static void main(String[] args) {

        //Mencoba membandingkan program faktorial

        //Dengan menggunakan looping
        System.out.println("Looping");
        System.out.println(factorialLoop(5));

        //Dengan menggunakan factorial recursive
        System.out.println("Recursive");
        System.out.println(factorialRecursive(5));

        //Akan tetapi harus berhati hati dengan recursive method karena jika terlalu banyak maka akan terhadi error
        //Kode stack overflow

        //Contoh kasus seperti berikut
        //Lepas segel
        //Program khusus menyebabkan error tergantung spec laptop
        loopError(10000);



    }

    //Faktorial Looping
    static int factorialLoop(int value){
        var result = 1;
        for(var i = 1; i <= value; i++){
            result *= i;
        }
        return result;
    }

    //Faktorial Recursive
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;

        } else {
            return value * factorialRecursive(value - 1);
        }


    }
    //Program otw error
    static void loopError(int value){
        if (value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop" + value);
            loopError(value -1);
        }

    }

}
