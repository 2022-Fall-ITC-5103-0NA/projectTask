package assignment2;


/**
 * This is the model class for contact information.
 */

public class Contact {

    private String name;

    private int yearOfMeeting;

    private String city;

    public Contact(String name, int yearOfMeeting, String city) {
        this.name = name;
        this.yearOfMeeting = yearOfMeeting;
        this.city = city;
    }

    public int getYearOfMeeting() {
        return yearOfMeeting;
    }

    public void setYearOfMeeting(int yearOfMeeting) {
        this.yearOfMeeting = yearOfMeeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //Print function to return a string containing the contact information.
    public String print(String friendName,int yearOfMeeting,String address)
    {
        return "The friend name is "+friendName+" I met him/her in "+yearOfMeeting+". He/She now in "+address+"\n";
    }
}
