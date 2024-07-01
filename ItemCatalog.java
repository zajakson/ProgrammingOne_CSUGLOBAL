
import java.util.ArrayList;

public class ItemCatalog {

    public static void main(String[] args) {

        //Item ID - Numerical or Alphanumerical - text
        ArrayList<String> itemId = new ArrayList<String>();

        //Item Description - Text 
        ArrayList<String> itemDescription = new ArrayList<String>();

        //UOM -  text (lbs)
        ArrayList<String> unitOfMeasure = new ArrayList<String>();

        //Cost - Numerical - dollar -(000.00)
        ArrayList<Double> cost = new ArrayList<Double>();

        //Expiration Date - text (dd/mm/yyyy)
        ArrayList<String> expirationDate = new ArrayList<String>();

        //Imported - Boolean
        ArrayList<Boolean> imported = new ArrayList<Boolean>();

        //Country of Orgin - text
        ArrayList<String> countryOfOrigin = new ArrayList<String>();


        //Assigning data
        itemId.add("123ABC");
        itemDescription.add("Sparkling Water");
        unitOfMeasure.add("11 fl-oz");
        cost.add(2.49);
        expirationDate.add("09/25/2025");
        imported.add(true);
        countryOfOrigin.add("Canada");

        //print data
        System.out.println(itemId);
        System.out.println(itemDescription);
        System.out.println(unitOfMeasure);
        System.out.println(cost);
        System.out.println(expirationDate);
        System.out.println(imported);
        System.out.println(countryOfOrigin);
    }
}
