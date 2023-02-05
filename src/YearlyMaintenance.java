public class YearlyMaintenance
{
    public static void main(String[] args)
    {

        double springMaintenance = 500;
        double summerMaintenance = 200;
        double fallMaintenance = 400;
        double winterMaintenance = 600;
        double totalMaintenance;

        totalMaintenance = springMaintenance + summerMaintenance + fallMaintenance + winterMaintenance;

        System.out.println("Your spring maintenance cost is " + springMaintenance + "Your summer maintenance cost is " + summerMaintenance + "Your fall maintenance cost is " + fallMaintenance + "Your winter maintenance cost is " + winterMaintenance);
        System.out.println("Your total yearly maintenance cost is " + totalMaintenance);

    }
}