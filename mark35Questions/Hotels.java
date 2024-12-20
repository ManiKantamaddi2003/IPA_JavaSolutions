package mark35Questions;


import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }
}

public class Hotels {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Hotel[] hotels = new Hotel[4];
        for (int i = 0; i < 4; i++) {
            int hotelId = scan.nextInt();
            scan.nextLine(); // Consume newline
            String hotelName = scan.nextLine();
            String dateOfBooking = scan.nextLine();
            int noOfRoomsBooked = scan.nextInt();
            scan.nextLine(); // Consume newline
            String wifiFacility = scan.nextLine();
            double totalBill = scan.nextDouble();
            scan.nextLine(); // Consume newline

            hotels[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);
        }

        String month = scan.nextLine();
        String wifiOption = scan.nextLine();

        int roomsBooked = noOfRoomsBookedInGivenMonth(hotels, month);
        if (roomsBooked > 0) {
            System.out.println(roomsBooked);
        } else {
            System.out.println("No rooms booked in the given month");
        }

        Hotel secondHighestBillHotel = searchHotelByWifiOption(hotels, wifiOption);
        if (secondHighestBillHotel != null) {
            System.out.println(secondHighestBillHotel.getHotelId());
        } else {
            System.out.println("No such option available");
        }

        scan.close();
    }

    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month) {
        int totalRooms = 0;
        for (Hotel hotel : hotels) {
            String[] dateParts = hotel.getDateOfBooking().split("-");
            String bookingMonth = dateParts[1];
            if (bookingMonth.equalsIgnoreCase(month)) {
                totalRooms += hotel.getNoOfRoomsBooked();
            }
        }
        return totalRooms > 0 ? totalRooms : 0;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] hotels, String wifiOption) {
        //List<Hotel> matchingHotels = new ArrayList<>();
        TreeSet<Hotel>matchingHotels=new TreeSet<>((f1,f2)->Double.compare(f1.getTotalBill(), f2.getTotalBill()));
        for (Hotel hotel : hotels) {
            if (hotel.getWifiFacility().equalsIgnoreCase(wifiOption)) {
                matchingHotels.add(hotel);
            }
        }

        if (matchingHotels.size() < 2) {
            return null;
        }
        
//        //matchingHotels.sort((h1, h2) -> Double.compare(h2.getTotalBill(), h1.getTotalBill()));
//        matchingHotels.sort(Comparator.comparingDouble(Hotel::getTotalBill));
//        return matchingHotels.get(1); // Second highest total bill
        matchingHotels.pollLast();
        Hotel res=matchingHotels.pollLast();
        return res;
        
    }
}
