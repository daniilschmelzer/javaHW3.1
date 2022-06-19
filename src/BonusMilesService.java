public class BonusMilesService {
    int priceDelimiter = 20;

    public int calculate(int price) {
        return price / priceDelimiter;
    }
}
