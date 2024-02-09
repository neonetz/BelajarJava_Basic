public class ForLoop {
    public static void main(String[] args) {

        //Contoh program perulangan tanpa henti
        /*for(;;){
            //Tampilkan ke layar
            System.out.println("Perulangan Tanpa Henti");
        }
*/
        //Perulangan sesuai kondisi
        //Deklrasi dan inisiasi
        var counter = 1;
        //Perulangan sampai kondisi memenuhi 10 number
        for(;counter <=10;){
            System.out.println("Perulangan ke - " + counter);
            //Variabel counter akan ditambah dengan 1
            counter++;
        }
        //Counter akan menjadi 11 karena for loop
        System.out.println(counter);

        //Perulangan dengan init statement
        for(var hitung = 1 ; hitung <=10;){
            System.out.println("Perulangan dengan init statement ke - "+ hitung);
            hitung++;
        }

        //Perulangan dengan post statement
        for(var hitung = 1 ; hitung <=10;hitung++){
            System.out.println("Perulangan dengan post statement ke - "+ hitung);
        }
    }
}
