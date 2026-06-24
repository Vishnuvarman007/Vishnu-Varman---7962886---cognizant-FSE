public class Main {

    public static void main(String[] args) {

        FinancialForecast forecast = new FinancialForecast();

        double CurValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        forecast.displayForecast(CurValue,growthRate,years);
    }
}