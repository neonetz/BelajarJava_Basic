import java.util.StringJoiner;

public class Scope {
    public static void main(String[] args) {

        /*Di java variable hanya bisa diakses di dalam area yang dimana mereka dibuat
        Hal ini di sebut scope
         */

        sayHello("Asep");
        sayHello("");
    }

    static void sayHello(String name){
        String hello = "Hello " + name;
        if (!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello); //Masih bisa berjalan di karenakan masih terdapat di jangkauan scope
        // System.out.println(hi); //Error nih
    }
}
