public class MethodParameter {
    public static void main(String[] args) {

        //Memanggil Method dengan Parameter
    sayHello("Muhammad","Adhyaksa","Fadillah");
        sayHello("Kitkat","Gojo","Satorou");
    }

    //Method dengan menggunakan parameter
    static void sayHello(String firstName,String middleName,String lastName){
        System.out.println("Nama saya" +" "+ firstName +" "+ middleName + " "+ lastName);
    }
}
