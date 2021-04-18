package BHK;

public class OneBHK {
    double roomArea;
    double hallArea;
    double price;

    public OneBHK() {
    }

    public OneBHK(double roomArea, double hallArea, double price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    void show() {
        System.out.println("Room Area " + this.roomArea + "\nHall Area " + this.hallArea + "\nPrice " + this.price);
    }

}
