package haze;


import java.util.Optional;

public class Point extends Cursor {
    private Optional<Direction> originDirection;
    private Optional<Character> identifier;

    Point(int x, int y, Optional<Direction> originDirection, Optional<Character> identifier) {
        super(x, y);
        this.originDirection = originDirection;
        this.identifier = identifier;
    }

    public int getX() {
        return super.x;
    }

    public int getY() {
        return super.y;
    }

    public Optional<Direction> getOriginDirection() {
        return originDirection;
    }

    public Optional<Character> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Optional<Character> identifier) {
        this.identifier = identifier;
    }
}
