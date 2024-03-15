public class RewardValue {
    private double cashValue;
    public static final double CASH_TO_MILES_CONVERSION = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / CASH_TO_MILES_CONVERSION);
    }
    private static double convertToCash(int milesValue) {
        return milesValue * CASH_TO_MILES_CONVERSION;
    }
}