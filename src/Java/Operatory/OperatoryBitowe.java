package Java.Operatory;

public class OperatoryBitowe {
    public static void main(String[]    args){

        String binary[] = {
                "0000", //0
                "0001", //1     2^0 = 1
                "0010", //2     2^1 = 2
                "0011", //3     2^1 + 2^0 = 3
                "0100", //4     2^2 = 4
                "0101", //5     2^2 + 2^0 = 5
                "0110", //6     2^2 + 2^1 = 6
                "0111", //7     2^2 + 2^1 + 2^0 = 7
                "1000", //8     2^3 = 8
                "1001", //9     2^3 + 2^0 = 9
                "1010", //10    2^3 + 2^1 = 10
                "1011", //11    2^3 + 2^1 + 2^0 = 11
                "1100", //12    2^3 + 2^2 = 12
                "1101", //13    2^3 + 2^2 + 2^0 = 13
                "1110", //14    2^3 + 2^2 + 2^1 = 14
                "1111", //15    2^3 + 2^2 + 2^1 + 2^0 = 15
        };

/**
 * OPERATORY BITOWE W JEZYKU JAVA
 * OPERATOR     DZIALANIE
 * ---------    ----------------------------------------------------------
 *      ~       Negacja bitowa
 *      &       Iloczyn bitowy
 *      |       Suma bitowa
 *      ^       Bitowa roznica symetryczna
 *      >>      Przesuniecie w prawo
 *      >>>     Przesuniecie w prawo z wypelnieniem zerami
 *      <<      Przesuniecie w lewo
 *      &=      Iloczyn bitowy z przypisaniem
 *      |=      Suma bitowa z przypisaniem
 *      ^=      Suma bitowa modulo 2 z przypisaniem
 *      >>=     Przesuniecie w prawo z przypisaniem
 *      >>>=    Przesuniecie w prawo z wypelnieniem zerami i przypisaniem
 *      <<=     Przesuniecie w lewo z przypisaniem
 */

        int a, b, c, d, e, f, g;


        a = 3;
        b = 6;


        System.out.println("a dziesietnie = "  +a  +   "    a binarnie = "  +binary[a]);
        System.out.println("b dziesietnie = "  +b  +   "    b binarnie = "  +binary[b]);


        c = a | b;
        d = a & b;
        e = a ^ b;
        f = (~a & b) | (a & ~b);
        g = ~a & 0x0f;
        System.out.println("Suma bitowa         c = a | b   dziesietnie: "  +c  +   "   binarnie: "    +binary[c]);
        System.out.println("Iloczyn bitowy      d = a & b   dziesietnie: "  +d  +   "   binarnie: "    +binary[d]);
        System.out.println("Bitowa roznica symetryczna      e = a ^ b   dziesietnie: "  +e  +   "   binarnie: "    +binary[e]);
        System.out.println("                                f = (~a & b) | (a & ~b)   dziesietnie: "  +f  +   "   binarnie: "    +binary[f]);
        System.out.println("Negacja bitowa      g = ~a   dziesietnie: "  +g  +   "   binarnie: "    +binary[g]);

        int h = 0x0f;
        System.out.println(binary[h]);
    }
}
