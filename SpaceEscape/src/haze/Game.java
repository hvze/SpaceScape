package haze;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("SameParameterValue")
public class Game {

    private Point[][] gamePlot;
    private Cursor cursor;

    private Game() {
        final Pair<Cursor, Point[][]> data = createPlot(5);
        this.cursor = data.getKey();
        this.gamePlot = data.getValue();
    }

    public static List<Character> IMMOVABLE_POINTS() {
        List<Character> chars = Stream.of(Direction.values()).map(Direction::toChar).collect(Collectors.toList());
        chars.add('s');
        return chars;
    }

    public static void main(String... args) {
        System.out.println("To leave just politely ask to leave.");
        new Game().play();
    }

    private Pair<Cursor, Point[][]> createPlot(int boxSize) {
        final Point[][] def = new Point[boxSize][boxSize];
        final Random rand = new Random();
        final Pair<Integer, Integer> start = new Pair<>(rand.nextInt(boxSize), rand.nextInt(boxSize));
        final Pair<Integer, Integer> end = new Pair<>(rand.nextInt(boxSize), rand.nextInt(boxSize));
        for (int x = 0; x < boxSize; x++) {
            for (int y = 0; y < boxSize; y++) {
                def[x][y] = new Point(x, y, Optional.empty(), (end.getKey() == x && end.getValue() == y) ? (Optional.of('e')) : (start.getKey() == x && start.getValue() == y) ? Optional.of('s') : Optional.empty());
            }
        }
        return new Pair<>(new Cursor(start.getKey(), start.getValue()), def);
    }

    private String replicate(char ch, int times) {
        final StringBuilder xStr = new StringBuilder();
        for (int x = 0; x < times; x++) {
            xStr.append(ch);
        }
        return xStr.toString();
    }

    private boolean needsToEnd(String lastResponse) {
        final String[] end = new String[]{"q", "quit", "exit", "bye", "leave"};
        return Stream.of(end).anyMatch((String x) -> lastResponse.toLowerCase().contains(x));
    }

    private void play() {
        String lastResponse;
        final Scanner scanner = new Scanner(System.in);
        Boolean printedBoard = false;
        do {
            if (!printedBoard) {
                printBoard();
                printedBoard = true;
            }
            printOptions();
            System.out.print("Your choice: ");
            lastResponse = scanner.nextLine();
            if (validDirection(lastResponse)) {
                printedBoard = false;
                final Direction dir = parseDirection(lastResponse).get(); // validDirection already checks this...
                final Point destination = this.cursor.getPoint(this.gamePlot, dir).get();
                if (destination.getIdentifier().isPresent() && destination.getIdentifier().get().equals('e')) {
                    System.out.println("Congrats! You win!");
                    break;
                }
                this.cursor.move(gamePlot, dir);
            } else {
                System.out.println("Invalid direction!");
            }
        } while (!needsToEnd(lastResponse));
        System.out.println("Adios!");

    }

    private Optional<Direction> parseDirection(String lastResponse) {
        final Direction[] possible = cursor.possibleDirections(this.gamePlot);
        return Stream.of(possible).filter((Direction dir) ->
                lastResponse.equalsIgnoreCase(dir.getRepresentation())
                        || lastResponse.equalsIgnoreCase(dir.name())
                        || lastResponse.equalsIgnoreCase(String.valueOf(dir.gameMoveChar()))
                        || lastResponse.equalsIgnoreCase(String.valueOf(dir.name().charAt(0)))).findFirst();
    }

    private boolean validDirection(String lastResponse) {
        return parseDirection(lastResponse).isPresent();
    }

    private void printOptions() {
        final Direction[] possible = cursor.possibleDirections(this.gamePlot);
        final StringJoiner joiner = new StringJoiner(", ");
        Stream.of(possible).forEach((dir) -> joiner.add(dir.getRepresentation()));
        System.out.printf("Options: %s.\n", joiner.toString());
    }

    private void printBoard() {
        System.out.println(replicate('_', (this.gamePlot.length * 2) + 2));
        for (final Point[] column : this.gamePlot) {
            for (int y = 0; y < column.length; y++) {
                final Point point = column[y];
                final String leftWall = y == 0 ? "|" : "";
                final String rightWall = y == column.length - 1 ? "|" : "";
                final String bottom = (this.cursor.equals(point)) ? "* " : point.getIdentifier().isPresent() ? String.format("%s ", point.getIdentifier().get()) : "  ";
                final String newlineCheck = y == this.gamePlot.length - 1 ? "\n" : "";
                System.out.printf("%s%s%s%s", leftWall, bottom, rightWall, newlineCheck);
            }
        }
        System.out.println(replicate('‾', (this.gamePlot.length * 3) + 2));
    }

}
