public class BukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 89;

        Integer iniInteger2 = iniInt;

        int age = 17;

        Integer ageObject = age;

        int ageAgain =  ageObject;

        short shortage =  ageObject.shortValue();
        byte byteage = ageObject.byteValue();






    }
}
