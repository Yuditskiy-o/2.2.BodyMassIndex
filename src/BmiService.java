public class BmiService {
    public int calculate(double weight, double growth) {
        double bodyMassIndexValueInDouble = (weight / (growth * growth)) * 10000;
        int bodyMassIndexValue = (int) bodyMassIndexValueInDouble;
        return bodyMassIndexValue;
    }
}
