package Java.Operatory;

public class S96OperatoryPrzypisania {

    public static void main(String[] args){

        int a = 1;
        int b = 2;
        int c = 3;

        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        int d = 51 % 6; // 6 * 8 + 3 = 51 czyli reszty bedzie 3

        System.out.println("a = "   +a);
        System.out.println("b = "   +b);
        System.out.println("c = "   +c);
        System.out.println("51 % 6 = "  +d);




    }

}
