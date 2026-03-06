public class Task2 {
    public static void main(String[] args) {
        // автоматическая инициализация нулями
        byte defByte;       // 0
        short defShort;     // 0
        int defInt;         // 0
        long defLong;       // 0L
        float defFloat;     // 0.0f
        double defDouble;   // 0.0d
        char defChar;       // '\u0000' (пустой символ)
        boolean defBoolean; // false
        
        byte a = 120;
        short b = 1000;
        int i = 100000;
        long l = 1000000000L;
        float f = 2.71f;
        double d = 3.14;
        char c = 'H';

        // имя в Unicode
        System.out.println(" Имя: \u0410\u043b\u0435\u043a\u0441\u0430\u043d\u0434\u0440");


        // примеры перегруженного оператора + для String
        System.out.println("abc" + 3f);
        System.out.println("300" + 0);
        System.out.println("sadsv" + " dfsfs");
        boolean tr = true;
        System.out.println("Bool " + tr);


        // примеры автоматического преобразования типов
        System.out.println(100 + 3.14); // выводит 103.14 так как int привёлся к double;
        byte g = 100;
        System.out.println(g + 10L); // byte привёлся к long, так как складывался с числом типа long


        // пример сужающего преобразования типов
        int z = 10;
        byte r = (byte)z;

        double db = 3.14;
        float ds = (float)3.14;


        // пример с var
        var hello = "Hello World!"; // String
        var doub = 4.4234; // double
        var integ = 52; // int 
    }
}
