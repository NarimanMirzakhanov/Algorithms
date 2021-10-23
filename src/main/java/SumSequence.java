public class SumSequence {

    public int getSumSequence(int number) {
        int sum = 0;
        if (number > 1) {
            for (int i = 0; i <= number; i++) {
                sum += i;
            }
        } else {
                for (int i = number; i <= 0; i++) {
                    sum -= i;
                }
            }
        return sum;
    }

}
