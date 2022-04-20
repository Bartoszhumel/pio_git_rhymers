package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = -1;
    public static final int INT1 = 12;
    public int total = INT;
    private final int[] numbers = new int[INT1];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INT;
    }

    public boolean isFull() {
        return total == INT1-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INT;
        return numbers[total--];
    }

}
