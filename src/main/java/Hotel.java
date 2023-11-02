import java.util.ArrayList;

public class Hotel {
    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<BedRoom> bedRooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedRooms = bedRooms;
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addBedRoom(BedRoom bedRoom) {
        this.bedRooms.add(bedRoom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }
}
