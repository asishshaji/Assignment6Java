package TileFloor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenOfSquareTile, length, width;

        System.out.println("Enter length of tile");
        lenOfSquareTile = scanner.nextDouble();

        Tile tile = new Tile(lenOfSquareTile);
        System.out.println("Enter length and width of floor");
        length = scanner.nextDouble();
        width = scanner.nextDouble();

        Floor floor = new Floor(length, width);
        floor.totalTiles(tile);
    }
}
