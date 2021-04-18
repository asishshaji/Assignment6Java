package TileFloor;

public class Floor {
    double length;
    double width;
    int totalTiles;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void totalTiles(Tile tile) {
        this.totalTiles = (int) (this.length * this.width / tile.getArea());
        System.out.println("Total tiles " + this.totalTiles);
    }
}
