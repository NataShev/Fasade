import static java.lang.Integer.parseInt;

public class BinOps {
    public String sum(String a, String b) {
        int aDecimal = parseInt(a, 2);
        int bDecimal = parseInt(b, 2);
        int sumAb = aDecimal + bDecimal;
        String sum = Integer.toBinaryString(sumAb);
        return sum;
    }

    public String mult(String a, String b) {
        int aDecimal = parseInt(a, 2);
        int bDecimal = parseInt(b, 2);
        int multAb = aDecimal * bDecimal;
        String mult = Integer.toBinaryString(multAb);
        return mult;
    }
}
