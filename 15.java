public class SwapVariables {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;

        System.out.println("Before swapping: first = " + first + ", second = " + second);

        int temporary = first;
        first = second;
        second = temporary;

        System.out.println("After swapping: first = " + first + ", second = " + second);
    }
}
