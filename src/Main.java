public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightkg = 98;
        double heightm = 1.87;
        int bmi = service.calculate(weightkg, heightm);
        System.out.println(bmi);
    }
}