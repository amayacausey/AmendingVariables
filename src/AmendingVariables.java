public class AmendingVariables {
    public static void main(String [] args){
        int annualIncome = 62000;
        double rate = .10;
        int year = 5;
        int annualIncome2;
        double year5rate,year5income;

        annualIncome2=annualIncome*year;
        year5rate=rate*annualIncome2;
        year5income=year5rate+annualIncome;

        System.out.println("After 5 years your income will be : $" +year5income);




    }
}
