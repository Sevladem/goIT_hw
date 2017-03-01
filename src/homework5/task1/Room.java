package homework5.task1;

import java.util.Date;

public class Room {

    private static final String INFO_ABOUT_ROOM = "Hotel name: %s; persons: %d; price: %d";
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Room){
            return (this.price == ((Room) obj).getPrice() && this.persons == ((Room) obj).getPersons() && this.cityName.equals(((Room) obj).getCityName()));
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return String.format(INFO_ABOUT_ROOM,this.hotelName,this.persons,this.price);
    }
}
