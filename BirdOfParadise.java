
public class BirdOfParadise {

    public static void main(String[] args) {

        // Parameter declaration
        double[] latitude = new double[4];
        double[] longtitude = new double[4];
        double[] altitude = new double[4];

        // flight data
        latitude[0] = -6.0375561;
        longtitude[0] = -64.574737;
        altitude[0] = 10.0;

        latitude[1] = -6.0469956;
        longtitude[1] = -64.5599605;
        altitude[1] = 50.0;

        latitude[2] = -6.0714487;
        longtitude[2] = -64.5320226;
        altitude[2] = 100.0;

        latitude[3] = -6.0789167;
        longtitude[3] = -64.5335032;
        altitude[3] = 150.0;

        // formatted output
        System.out.println("Path of Macaw in the Amazon");
        System.out.println("Lat, lon, alt (m)");

        // Printed flight path
        for (int i = 0; i < latitude.length; i++) {
            System.out.print(latitude[i] + ", ");
            System.out.print(longtitude[i] + ", ");
            System.out.print(altitude[i] + " " + "\n");

        }
    }
}
