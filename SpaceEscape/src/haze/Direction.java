package haze;

public enum Direction {
    UP, DOWN, LEFT, RIGHT;

    public String getRepresentation() {
        String chars = toString();
        return String.format("[%c] (%s)%s", gameMoveChar(), Character.toUpperCase(chars.charAt(0)), chars.substring(1).toLowerCase());
    }

    public char gameMoveChar() {
        switch (this) {
            case UP:
                return 'w';
            case DOWN:
                return 's';
            case LEFT:
                return 'a';
            case RIGHT:
                return 'd';
        }
        return '?';
    }

    public char toChar() {
        switch (this) {
            case UP:
                return '^';
            case DOWN:
                return 'v';
            case LEFT:
                return '<';
            case RIGHT:
                return '>';
        }
        return '?';
    }
}
