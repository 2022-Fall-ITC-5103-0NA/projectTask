package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {

    /**
     * This is the main method which generates OldFriendReport and NewFriendReport.
     * @throws IOException 
     */
    public static void main(String args[]) throws IOException {

        String friendName, address, reportName;
        int yearOfMeeting;
       
        Scanner scInput = new Scanner(System.in);
        File file = new File(".//AllFriendsFile");
        Scanner scFile = new Scanner(file);

        //Reads the contact information
        while(scFile.hasNext()) {
            friendName = scFile.nextLine();
            System.out.println("Do you want to add "+friendName+" to your new Contact List?");
            String input = scInput.nextLine();

            String tempString = scFile.nextLine();
            yearOfMeeting = Integer.parseInt(tempString);

            if(input.equals("y"))
            {
                System.out.println("Enter the address of "+friendName);
                address = scInput.nextLine();

                //Creates contact objects with contact information
                Contact contact = new Contact(friendName,yearOfMeeting,address);
                    if(contact.getYearOfMeeting()<2000)
                        reportName="OldFriendReport";
                    else
                        reportName="NewFriendReport";

                    File report = new File(reportName+".txt");
                    //Writes the contact information into the corresponding file
                    FileWriter myWriter = new FileWriter(report,true);
                    myWriter.write(contact.print(friendName,yearOfMeeting,address));
                    myWriter.close();
                }
            else if (!input.equals("y"))
            {
            	System.out.println("Inappropriate Input");
            	continue;
            	
            }
            else
            {
                continue;
            }
        }
    }
}
