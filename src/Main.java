public class Main {
    //    Escape sequences
//    A character preceded by a backslash (\) is an escape sequence and has special meaning to the compiler. The following table shows the Java escape sequences. Note: Each escape sequence represents one character entity.
//
//    Escape Sequence	Description
//\t	Insert a tab in the text at this point.
//\b	Insert a backspace in the text at this point.
//\n	Insert a newline in the text at this point.
//\r	Insert a carriage return in the text at this point. Note: Windows uses \r\n for a new line.
//\f	Insert a formfeed in the text at this point.
//\'	Insert a single quote character in the text at this point.
//        \"	Insert a double quote character in the text at this point.
//        \	Insert a backslash character in the text at this point.
//    Write a Java program to print a box, an oval, or a diamond (choose one) using asterisks.
//            ********
//            *      *
//            *      *
//            *      *
//            *      *
//            ********
//
//            ***
//           *   *
//          *     *
//          *     *
//           *   *
//            ***
//
//            *
//           * *
//          *   *
//           * *
//            *
    public static void main(String[] args) {
        printBox();
        printOval();
        printDiamond();
    }


    public static void printBox() {
        System.out.println("Print Box\n ");
        System.out.println("********");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("********");
    }

    public static void printOval(){
        System.out.println("Print Oval\n");
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println(" *   *");
        System.out.println("  ***");
    }

    public static void printDiamond(){
        System.out.println("Print Diamond\n");
        System.out.println("   *");
        System.out.println(" *   *");
        System.out.println("*      *");
        System.out.println(" *   *");
        System.out.println("   *");
    }
}