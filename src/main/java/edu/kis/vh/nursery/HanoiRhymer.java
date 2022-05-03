package edu.kis.vh.nursery;

/**
 *
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * @return getTotalRejected
     */
    public int reportRejected() {
        return getTotalRejected();
    }

    /**
     * @param in
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    /**
     * @return totalRejected
     */
    public int getTotalRejected() {
        return totalRejected;
    }

    /**
     * @param totalRejected
     * set totalRejected
     */
    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
//wiersze 5,7,11-16
// alt+ strzałki zmiana karty