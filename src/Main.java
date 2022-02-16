public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String sum = bins.sum("1100101","1100110");
        String mult = bins.mult("11010010","110011010");
        System.out.println(sum);
        System.out.println(mult);
    }
}
