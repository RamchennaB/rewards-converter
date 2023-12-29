public class RewardValue {
    private double cashValue;
    private int milesValue;


    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=(int) (cashValue/0.0035);
    }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue=(double) (milesValue * 0.0035);
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return milesValue;
    }
    public int convertFromCashToMiles() {
        return (int) (cashValue * 100);
    }

    public double convertFromMilesToCash() {
        return milesValue / 100.0;
    }
}


