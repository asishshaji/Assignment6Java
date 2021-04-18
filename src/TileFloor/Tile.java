package TileFloor;

public class Tile {
    double edgeLengthOfSquareTile;


    public Tile(double edgeLengthOfSquareTile) {
        this.edgeLengthOfSquareTile = edgeLengthOfSquareTile;
    }

    double getArea() {
        return Math.pow(this.edgeLengthOfSquareTile, 2);
    }
}
