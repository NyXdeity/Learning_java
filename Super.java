
//class Super{
//    public static void main(String[]args){
//        char singleQuoted ='A';
//        String doubleQuoted ="A";
//        System.out.println(singleQuoted+doubleQuoted);
//    }
//}
//public class Super {
//    public static void main(String[] args) {
//        int exmpl = 1_000_000;
//        String line = "A";
//        System.out.println('A');
//        System.out.println(line);
//        System.out.println(exmpl);
//    }
//}
//public class Super {
//    public static void main(String[] args) {

//        int numberExample = 123;
//
//        char characterExample = 'J';
//        String stringExample = "Java Beginner";
//
//        System.out.println("Number: " + numberExample);
//        System.out.println("Character: " + characterExample);
//        System.out.println("String: " + stringExample);
//        String ab = "this is ";
//        System.out.println(ab.charAt(0));//access any character of a string
//    }
//
//}
//public class Super {
//    public static void main(String[] args) {
//
//       String haystack = "supercalifragilisticexpialidocious";
//
//        int haystackLength = 34;
//
//        String pattern = "cali";
//
//        int patternLength = 4;
//
//        boolean next;
//        for (int i = 0; i < haystackLength - patternLength + 1; i++) {
//            next = false;
//            for (int j = 0; j < patternLength; j++) {
//                if (haystack.charAt(i + j) != pattern.charAt(j)) {
//                    next = true;
//                    break;
//                }
//            }
//            if (!next) {
//                System.out.println("Pattern " + pattern + " found in " + haystack);
//                break;
//            }
//        }
//    }
//}

public class Super{
    public static void main(String[] args) {

       byte a = 10;

        double b = 20.0;

        char  c = 'A';

        boolean d = true;
        long e = 123456789L;
        float f = 1.23f;
        byte g = 127;
        short h = 1000;
        String result = "Integer: " + a + ", Double: " + b + ", Char: " + c +
                ", Boolean: " + d + ", Long: " + e +
                ", Float: " + f + ", Byte: " + g +
                ", Short: " + h;
        System.out.println(result);
    }
}