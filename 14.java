public class AmericanFlagDisplay {
    public static void main(String[] args) {
        String stars = "* * * * * * ";
        String starsShort = " * * * * * ";
        String stripes = "==============================================";

        for (int i = 0; i < 9; i++) {
            System.out.println(i % 2 == 0 ? stars + stripes : starsShort + stripes);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(stripes);
        }
    }
}
