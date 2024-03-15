// My solution for Task One
public class RewardValue {
    private double cashValue;
    private double milesValue = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        double result = getCashValue() * milesValue;
        return result;
    }
}