package unit3_review_and_extenitons.more_frq;

import java.util.ArrayList;

public class Hotal {
    // private varible for objects of class Reservation
    private Reservation[] rooms;
    // private ArrayList for waitlist
    private ArrayList<Reservation> waitlist;
    // requests for new rooms
    public Reservation requestRoom(String guestName){
        // traverse all of the rooms in rooms, if there is a room available, create a reservation and return it
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                Reservation reservation = new Reservation(guestName, i + 1);
                rooms[i] = reservation;
                return reservation;
            }
        }
        // if there is no room available, add the reservation to the waitlist
        waitlist.add(new Reservation(guestName, 0));
        return null;
    }
    // Method cancelAndReassign releases a previous reservation. 
    // If the reservation is on the waitlist, it is removed from the waitlist and reassigned to a room.
    // If the reservation is in a room, it is removed from the room and reassigned to the waitlist.
    public void cancelAndReassign(Reservation reservation) {
        // If the waiting list for the hotel contains any names, the vacated room is reassigned to the first person at the beginning of the list. That person is then removed from the waiting list and the newly created reservation is returned. 
        // If no one is waiting, the room is marked as empty and null is returned.
        if (waitlist.size() > 0) {
            // reassign the room to the first person in the waitlist
            Reservation newReservation = waitlist.get(0);
            // remove the first person from the waitlist
            waitlist.remove(0);
            // reassign the room to the new reservation
            rooms[newReservation.getRoomNumber() - 1] = newReservation;
        }
    }
}
