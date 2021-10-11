public class AscendingSequence {
    public int[] ascendingSequence(int a, int b, int n) {
        if ((b - a) <= 0) {
            int[] ascendingSequence = {-1};
            return ascendingSequence;
        } else {
            int[] ascendingSequence = new int[(b - a) / n + 1];
            ascendingSequence[0] = a;
            int newNumber = a;
            for (int i = 1; i < ascendingSequence.length; i++) {
                newNumber += n;
                ascendingSequence[i] = newNumber;
            }
            return ascendingSequence;
        }
    }
}
