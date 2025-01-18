//Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.

public class HotelBooking {
    String guestName;
    String roomType;
    int night;

    //Default parameter 
    HotelBooking(){
        this.guestName = "Guest";
        this.roomType = "Double bed";
        this.night = 1;
    }

    //Parameterized constructor 
    HotelBooking(String guestName, String roomType, int night){
        this.guestName = guestName;
        this.roomType = roomType;
        this.night = night;
    } 

    //Copy constructor

    HotelBooking(HotelBooking previouHotelBooking){
        this.guestName = previouHotelBooking.guestName;
        this.roomType = previouHotelBooking.roomType;
        this.night = previouHotelBooking.night;
    }

    //display details
    public void display(){
        System.out.println("Guest Name: " + guestName + "\t" + "Room type:" + roomType + "\t" + "Night: " + night);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Abhishek Vishwakarma","Double bed",7);

        booking1.display();
        booking2.display();
    }
}
