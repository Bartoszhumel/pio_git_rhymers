package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NEGATIVE = -1;
    private static final int SIZE = 12;
    private int total = getNEGATIVE();
    private final int[] numbers = new int[getSIZE()];

    public static int getNEGATIVE() {
        return NEGATIVE;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean callCheck() {
        return total == getNEGATIVE();
    }

    public boolean isFull() {
        return total == getSIZE() -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return getNEGATIVE();
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return getNEGATIVE();
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
