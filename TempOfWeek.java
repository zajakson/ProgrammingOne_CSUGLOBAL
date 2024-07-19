
import java.util.ArrayList;
import java.util.Scanner;

public class TempOfWeek {

//function WeeklyAvg //https://www.geeksforgeeks.org/java-program-to-compute-the-sum-of-numbers-in-a-list-using-recursion/
    public static int weeklyAvg(ArrayList<Integer> averageTempArrayList) {
        int total = 0;
        for (int i : averageTempArrayList) {
            total += i;
        }
        int avg = total / averageTempArrayList.size();
        return avg;
    }

//function performAvg
    public static int performAvg(int[] tempDataArray, ArrayList<Integer> performAvgArrayList) {
        int sampleLen = 8;
        int[] tempArray = tempDataArray;
        //ArrayList<Integer> tempPerformArrayList = new ArrayList<>();
        int total = 0;
        int avg = 0;

        //avg data - sample range 0-7
        for (int i = 0; i < 8; i++) {
            total += tempArray[i];
        }
        avg = total / sampleLen;
        performAvgArrayList.add(avg);

        //reset total for next use
        total = 0;

        //avg data - sample range 8-15
        for (int i = 8; i < 16; i++) {
            total += tempArray[i];
        }

        avg = total / sampleLen;
        performAvgArrayList.add(avg);

        //reset total for next use
        total = 0;

        //avg data - sample range 16-23
        for (int i = 16; i < 24; i++) {
            total += tempArray[i];
        }

        avg = total / sampleLen;
        performAvgArrayList.add(avg);
        //reset total for next use
        total = 0;

        //avg data - sample range 24-31
        for (int i = 24; i < 32; i++) {
            total += tempArray[i];
        }

        avg = total / sampleLen;
        performAvgArrayList.add(avg);
        //reset total for next use
        total = 0;

        //avg data - sample range 32-39
        for (int i = 32; i < 40; i++) {
            total += tempArray[i];
        }

        avg = total / sampleLen;
        performAvgArrayList.add(avg);
        //reset total for next use
        total = 0;

        //avg data - sample range 40-47
        for (int i = 40; i < 48; i++) {
            total += tempArray[i];
        }

        avg = total / sampleLen;
        performAvgArrayList.add(avg);
        //reset total for next use
        total = 0;

        //avg data - sample range 48-55
        for (int i = 48; i < 56; i++) {
            total += tempArray[i];
        }

        avg = total / sampleLen;
        performAvgArrayList.add(avg);
        //reset total for next use

        return total;
    }

//function textFormat
    //NOT NEEDED

//function exitMessage
    //NOT NEEDED
//function selection Menu
    public static String selectionMenu() {
        String completeExit
                = " \n"
                + "THE WEATHER APP\n"
                + "-------------------------------------------------------\n"
                + "Please select make a number selection.\n"
                + "\n"
                + "1 - Monday \n"
                + "2 - Tuesday \n"
                + "3 - Wednesday \n"
                + "4 - Thursday \n"
                + "5 - Friday \n"
                + "6 - Saturday \n"
                + "7 - Sunday \n"
                + "8 - Weekly Average \n"
                + "9 - Exit \n";

        return completeExit;
    }

    public static void main(String[] args) {

//Temperature data based on (8) temperature samples per day (every 3hrs)
        int[] tempData = {85, 88, 90, 92, 93, 89, 87, 91, 95, 96, 94, 90, 88, 89, 91, 93, 92, 91, 88, 89, 90, 92, 93, 95, 97, 96, 95, 94, 92, 91, 89, 90, 88, 87, 89, 91, 92, 93, 94, 95, 96, 95, 94, 92, 91, 90, 88, 87, 89, 90, 91, 92, 93, 94, 95, 96};

//Average weekly temperature ArrayList Data. 
        ArrayList<Integer> averageTempData = new ArrayList<>();

//case variable
        int caseNum = 0;

        //Takes 8 samples per day from  
        performAvg(tempData, averageTempData);

        //Menu
        String makeSelection = selectionMenu();
        System.out.println(makeSelection);

        //Scanner
        Scanner scanner = new Scanner(System.in);

        //Program loop - will allow use
        while (caseNum != 9) {

            System.out.print("Make a selection: ");
            caseNum = scanner.nextInt();

            switch (caseNum) {
                case 1:
                    System.out.print("Monday's Average Daily: ");
                    System.out.print(averageTempData.get(0));
                    System.out.println("F \n");
                    break;
                case 2:

                    System.out.print("Tuesday's Average Daily: ");
                    System.out.print(averageTempData.get(1));
                    System.out.println("F \n");
                    break;
                case 3:
                    System.out.print("Wednesday's Average Daily: ");
                    System.out.print(averageTempData.get(2));
                    System.out.println("F \n");
                    break;
                case 4:
                    System.out.print("Thursday's Average Daily: ");
                    System.out.print(averageTempData.get(3));
                    System.out.println("F \n");
                    break;
                case 5:
                    System.out.print("Friday's Average Daily: ");
                    System.out.print(averageTempData.get(4));
                    System.out.println("F \n");
                    break;
                case 6:
                    System.out.print("Saturday's Average Daily: ");
                    System.out.print(averageTempData.get(5));
                    System.out.println("F \n");
                    break;
                case 7:
                    System.out.print("Sunday's Average Daily: ");
                    System.out.print(averageTempData.get(6));
                    System.out.println("F \n");
                    break;
                case 8:
                    System.out.print("All Daily Averages \n");
                    System.out.print("------------------ \n");

                    //setup full week
                    System.out.print("Monday's Average Daily: ");
                    System.out.print(averageTempData.get(0));
                    System.out.print("F \n");

                    System.out.print("Tuesday's Average Daily: ");
                    System.out.print(averageTempData.get(1));
                    System.out.print("F \n");

                    System.out.print("Wednesday's Average Daily: ");
                    System.out.print(averageTempData.get(2));
                    System.out.print("F \n");

                    System.out.print("Thursday's Average Daily: ");
                    System.out.print(averageTempData.get(3));
                    System.out.print("F \n");

                    System.out.print("Friday's Average Daily: ");
                    System.out.print(averageTempData.get(4));
                    System.out.print("F \n");

                    System.out.print("Saturday's Average Daily: ");
                    System.out.print(averageTempData.get(5));
                    System.out.print("F \n");

                    System.out.print("Sunday's Average Daily: ");
                    System.out.print(averageTempData.get(6));
                    System.out.print("F \n");

                    //weekly avg
                    System.out.print("------------------------- \n");
                    System.out.print("Weekly Average: ");
                    System.out.print(weeklyAvg(averageTempData));
                    System.out.print("F \n\n");
                    break;
                case 9:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Error, enter a number 1 - 9");
                    break;
            }
        }
    }
}
