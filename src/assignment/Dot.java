package assignment;

/**
 * Dot class to represent a dot in 2D plane
 */
public class Dot {
    private long x;
    private long y;

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
}
