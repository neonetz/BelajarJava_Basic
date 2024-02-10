public class MethodOverloading {
    public static void main(String[] args) {

        //Memanggil method yang tidak ada parameter
        katakanHallo();
        //Memanggil method yang ada 1 parameter
        katakanHallo("Asep");
        //Memanggil method yang ada 2 parameter
        katakanHallo("Asep","Pelakor");

    }

    //Contoh Method Overloading

    //Method tidak ada parameter
    static void katakanHallo(){
        System.out.println("Hallo");

    }

    //Method dengan 1 parameter
    static void katakanHallo(String firstName){
        System.out.println("Hallo " + firstName);
    }

    //Method dengan 2 parameter
    static void katakanHallo(String firstName,String middleName){
        System.out.println("Hallo " + firstName + " " + middleName);
    }
}
