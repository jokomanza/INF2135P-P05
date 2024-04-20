package assignment;

/**
 * Dot class to represent a dot in 2D plane
 */
public class Dot {
    private long x;
    private long y;

    /**
     * Default constructor. Initialize x and y when creating a new dot
     *
     * @param x x coordinate
     * @param y y coordinate
     */
    public Dot(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    /**
     * Calculate distance between this dot and other dot
     *
     * @param otherDot the other dot
     * @return distance between two dots
     */
    double distanceTo(Dot otherDot) {
        long x1 = getX();
        long y1 = getY();

        long x2 = otherDot.getX();
        long y2 = otherDot.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
