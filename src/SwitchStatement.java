public class SwitchStatement {
    public static void main(String[] args) {
        //IF Statement
        //Deklrasi dan inisiasi variabel data bertype number
        var nilai = "0";
        var nilaiAbsen = 40;
        var nilaiUjian = 40;


        //Else-if statement
        if (nilaiAbsen >= 80 && nilaiUjian >= 80){
            nilai ="A";
            System.out.println("Nilai anda A");
        } else if (nilaiAbsen >= 70 && nilaiUjian >= 70){
            nilai ="B";
            System.out.println("Nilai anda B");
        }else if(nilaiAbsen >= 60 && nilaiUjian >= 60) {
            nilai ="C";
            System.out.println("Nilai anda C");
        }else if (nilaiAbsen >= 50 && nilaiUjian >= 50) {
            nilai ="D";
            System.out.println("Nilai anda D");
        }else {
            nilai ="E";
            System.out.println("Nilai anda E");
        }

        //Switch Statement
        switch (nilai){
            case "A":
                System.out.println("Nilai anda melebihi ekspetasi kampus");
                break;//Berhentiin switch statement
            case "B":
                System.out.println("Nilai anda biasa saja");
                break;
            case "C":
                System.out.println("Nilai anda jelek mending remed");
                break;
            case "D":
                System.out.println("Nilai anda kayaknya salah kampus");
                break;
            case "E":
                System.out.println("Nilai anda jadi gimana? mau mengundurkan diri atau di do?");
                break;
            default:
                System.out.println("Gak kenal sorry");

        }
        //Switch Lambda Java di java versi 14 keatas
        switch (nilai){
            case "A" -> System.out.println("Nilai anda cukup");
            case "B" -> System.out.println("Nilai anda jelek");
            case "C" -> System.out.println("Nilai anda sangat jelek");
            case "D" -> System.out.println("Nilai anda cukup untuk anda di keluarkan");
            case "E" -> System.out.println("Nilai anda cuman buat ngabisin tinta");
            default -> {
                System.out.println("Anda kayaknya salah planet");
            }
        }

        //Kata kunci yield java di java versi 14 keatas
        //Switch tanpa kata kunci yield
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Nilai anda cukup";
            case "B" -> ucapan= "Nilai anda jelek";
            case "C" -> ucapan = "Nilai anda sangat jelek";
            case "D" -> ucapan = "Nilai anda cukup untuk anda di keluarkan";
            case "E" -> ucapan = "Nilai anda cuman buat ngabisin tinta";
            default -> {
                ucapan = "Anda kayaknya salah planet";
            }
        }
        System.out.println(ucapan);

        //Switch dengan kata kunci yield
        String ucap =  switch (nilai){
            case "A":
                yield "Kocak banget";
            case "B":
                yield "Ngotak";
            case "C":
                yield "Kocak banget coqwo";
            case "D":
                yield "Kocak banget wow";
            case "E":
                yield "Kocak banget kan wkwkwk";
            default:
                yield "dahlah mending tidur";

        };
        System.out.println(ucap);



    }
}
