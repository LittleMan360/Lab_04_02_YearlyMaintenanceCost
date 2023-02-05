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

        System.out.printf("Your spring maintenance cost is $%,.2f", + springMaintenance);
        System.out.printf(" Your summer maintenance cost is $%,.2f", + summerMaintenance);
        System.out.printf(" Your fall maintenance cost is $%,.2f", + fallMaintenance);
        System.out.printf(" Your winter maintenance cost is $%,.2f", + winterMaintenance);
        System.out.printf(" Your total yearly maintenance cost is $%,.2f", + totalMaintenance);


    }
}