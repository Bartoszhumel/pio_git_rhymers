package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NEGATIVE = -1;
    private static final int SIZE = 12;
    private int total = NEGATIVE;
    private final int[] numbers = new int[SIZE];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE;
    }

    public boolean isFull() {
        return total == SIZE -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NEGATIVE;
        return numbers[total--];
    }

}
