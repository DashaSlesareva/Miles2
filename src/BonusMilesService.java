public class BonusMilesService {
    public int calculate(int cost) {
        int BonusmileAmount;
        int mileFor = 20;
        BonusmileAmount = cost / mileFor;
        return BonusmileAmount;
    }
}
