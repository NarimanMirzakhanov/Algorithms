public class OddEven {
    public String oddEven(long number) {
        if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
            return "Undefined";
        } else if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
