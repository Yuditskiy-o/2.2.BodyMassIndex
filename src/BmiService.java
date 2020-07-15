public class BmiService {
    public int calculate(double weight, double growth) {
        double BodyMassIndexValueInDouble = (weight / (growth * growth)) * 10000;
        int BodyMassIndexValue = (int) BodyMassIndexValueInDouble;
        return BodyMassIndexValue;
    }
}
