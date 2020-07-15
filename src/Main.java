public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BodyMassIndexValue = service.calculate(63, 170);
        System.out.println(BodyMassIndexValue);
    }
}
