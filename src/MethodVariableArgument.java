public class MethodVariableArgument {
    public static void main(String[] args) {
        //Program tanpa variable argument

        //Deklrasi dan inisiasi

        int[] nilai1 = {80,88,87,87,78};
        selamat("Asep Knalpot",nilai1);

        int[] nilai2 = {100,18,0,87,0};
        selamat("Asep Penyu",nilai2);

        //Dengan menggunakan variable argument
        selamatcuy("Asep Cumi",90,90,80,89,99);

        selamatcuy("Asep Tongkol",90,0,0,0,0);


    }

    //Method tanpa menggunakan variable argument
    static void selamat(String name,int[] values){
        int total =0;
        for (var value : values){
            total += value;
        }
        int finalValue = total/values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + " Anda" + " Lulus Mungkin");}
            else {
                System.out.println("Selamat " + name + " Anda" + " Tidak Lulus");
            }


    }

    //Method menggunakan variable argument
    static void selamatcuy(String name,int... values){
        int total =0;
        for (var value : values){
            total += value;
        }
        int finalValue = total/values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + " Anda" + " Lulus Mungkin");}
        else {
            System.out.println("Selamat " + name + " Anda" + " Tidak Lulus");
        }


    }

}
