import java.util.Date;

public class ExpressionStatementdanblock {

    public static void main(String[] args) {

        //Contoh dari expresssion
        int value1;
        value1 = 10;

        //Contoh dari statement
        System.out.println(value1 = 100);

        //Jenis - jenis statement
        double aValue  = 8976.234;
        //increment statement
        aValue++;
        //Method innovation statement
        System.out.println("Hello World");
        //Object creation statement
        Date date = new Date();

        //Contoh dari block
        {   //Tampilkan ke layar
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
            {
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
                {
                    System.out.println("Hello World");
                    System.out.println("Hello World");
                    System.out.println("Hello World");
                }
            }
        }

    }
}
