public class ForEach {
    public static void main(String[] args) {
        //Tanpa menggunakan for each dalam mengambil data array di perulangan
        System.out.println("Tanpa For Each");
        String[] array ={
                "Muhammad","Adhyaksa" , "Fadillah",
                "Iam","An","Atomic"
        };

        //Perulangan tanpa menggunakan for each
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }

        //Menggunakan for each dalam mengambil data array di perulangan
        System.out.println("For Each");
        for (var namanama:array)
            System.out.println(namanama);
    }
}
