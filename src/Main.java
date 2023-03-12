public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        System.out.println();
        System.out.println("1.87 / 98");
        System.out.println(service.calculate(1.87, 98));

        System.out.println();
        System.out.println("1.76 / 73");
        System.out.println(service.calculate(1.76, 73));


    }
}