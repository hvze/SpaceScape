package haze;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Cursor {
    int x, y;

    Cursor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Cursor(%d, %d)", this.x, this.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass().isAssignableFrom(getClass())) return false;
        Cursor cursor = (Cursor) o;
        return x == cursor.x &&
                y == cursor.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Optional<Point> getPoint(Point[][] plot, Direction dir) {
        switch (dir) {
            case UP:
                return accessPoint(plot, x - 1, y);
            case DOWN:
                return accessPoint(plot, x + 1, y);
            case LEFT:
                return accessPoint(plot, x, y - 1);
            case RIGHT:
                return accessPoint(plot, x, y + 1);
        }
        return Optional.empty();

    }

    private Optional<Point> accessPoint(Point[][] plot, int x, int y) {
        if (x > plot.length - 1 || x < 0) {
            return Optional.empty();
        }
        if (y > plot[x].length - 1 || y < 0) {
            return Optional.empty();
        }
        return Optional.of(plot[x][y]);
    }

    private boolean isBlocked(Point[][] plot, Direction dir) {
        final Optional<Point> point = getPoint(plot, dir);
        return !point.isPresent() || isMovable(point.get());
    }

    public Cursor[] getAvaliablePoints(Point[][] plot) {
        return Stream.of(possibleDirections(plot)).map((d) -> getPoint(plot, d)).toArray(Cursor[]::new);
    }

    public Direction[] possibleDirections(Point[][] plot) {
        return Stream.of(Direction.values()).filter((d) -> !isBlocked(plot, d)).toArray(Direction[]::new);
    }

    private boolean isMovable(Point point) {
        return (point.getIdentifier().isPresent() && Game.IMMOVABLE_POINTS().contains(point.getIdentifier().get())) && point.getIdentifier().isPresent();
    }

    public void move(Point[][] plot, Direction dir) {
        final Cursor other = getPoint(plot, dir).get();
        final Point finPoint = plot[this.x][this.y];

        if (!finPoint.getIdentifier().isPresent() || isMovable(finPoint)) {
            plot[this.x][this.y].setIdentifier(Optional.of(dir.toChar()));
        }

        this.x = other.x;
        this.y = other.y;
    }
}
