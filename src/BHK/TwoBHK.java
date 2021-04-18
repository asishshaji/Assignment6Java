package BHK;

public class TwoBHK extends OneBHK {

    double room2Area;

    public TwoBHK() {
    }

    public TwoBHK(double roomArea, double hallArea, double price) {
        super(roomArea, hallArea, price);
        this.room2Area = roomArea * hallArea; //What is room2Area
    }

    @Override
    void show() {
        super.show();
        System.out.println("Room2Area " + this.room2Area);
    }
}
