package unit3_review_and_extenitons.more_frq;

public class Reservation {
    // private varible for String name and int roomnumber
    private String name;
    private int roomNumber;
    // constructor for a String name and an int room number
    public Reservation(String name, int roomNumber) {
        this.name = name;
        this.roomNumber = roomNumber;
    }
    // getter for room number
    public int getRoomNumber() {
        return roomNumber;
    }
    // getter for name
    public String getName() {
        return name;
    }
}
