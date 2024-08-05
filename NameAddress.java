
public class NameAddress {

    public static void main(String[] args) {

        //Global Name and Address information
        String firstName = "Isaiah";
        String lastName = "Jackson";
        String streetAddress = "21 WereJammin Ave";
        String city = "Wilmington";
        String state = "DE";
        String zipCode = "19804";

        //newline 
        System.out.println(" ");

        //Print Statements 
        //Original Seperate Line 
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(streetAddress);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zipCode);

        //newline 
        System.out.println(" ");

        //Correction All data one line 
        System.out.println(firstName + " " + lastName + ". " + streetAddress + ", " + city + " " + state + ", " + zipCode);

        //newline 
        System.out.println(" ");

        //Correction All Data in a single  print w/ new line between element.  
        System.out.println(firstName + "\n" + lastName + "\n" + streetAddress + "\n" + city + "\n" + state + "\n" + zipCode);
    }
}
