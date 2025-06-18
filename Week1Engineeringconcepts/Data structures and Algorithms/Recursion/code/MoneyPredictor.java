
public class MoneyPredictor {
    public static double predictMoney(double startMoney, double growthPercent, int years) {
        // Base case - no more years left
        if (years == 0) {
            return startMoney;
        }
        double nextYearMoney = startMoney * (1 + growthPercent / 100);

        return predictMoney(nextYearMoney, growthPercent, years - 1);
    }

    public static void main(String[] args) {
        double initialMoney = 1000; // $1000 starting
        double growth = 5; // 5% growth per year
        int years = 3; // For 3 years

        double futureMoney = predictMoney(initialMoney, growth, years);

        System.out.println("After " + years + " years, you'll have: rupees " +
                Math.round(futureMoney));
    }
}
/*
 * 1. Base Case: If no years left (`years == 0`), return current money
 * 2. Recursive Step:
 * Calculate next year's money (current + growth)
 * Repeat for remaining years
 * 3. Example: 1000 rupees growing at 5% for 3 years → 1158 rupees
 * what is being done here :
 * Each call handles one year's growth
 * The method calls itself with one less year each time
 * Simple math: 'money * (1 + growth/100)'
 * output :
 * After 3 years, you'll have: rupees 1158
 */
