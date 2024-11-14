public class dataTypes {
    public static void main(String[] args) {
        int number = 17092001;
        System.out.println(number);
        byte tinyNumber = 127;
        System.out.println(tinyNumber);
        long longNumber = 1234567891011L; // debemos agregar una L al final
        float min_number = Float.MIN_VALUE;
        float max_number = Float.MAX_VALUE;
        System.out.println(min_number);
        System.out.println(max_number);
        System.out.println("----");
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println(minDouble);
        System.out.println(maxDouble);

        char c = 'C';
        System.out.println(Character.SIZE);

        // con la palabra reservada 'var' Java puede inferir el tipo de dato
        var variable = 'd';
        var variable2 = 2123123123123123L;
        var variable3 = "saadkmasdm";
        var variable4 = true;


    }
}
