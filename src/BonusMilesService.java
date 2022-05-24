public class BonusMilesService {
    public int calculate(int cost) {
        int bonusmileAmount;
        int mileFor = 20;
        bonusmileAmount = cost / mileFor;
        return bonusmileAmount;
    }
}
