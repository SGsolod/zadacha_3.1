public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 565;
        int miles = service.calculate(price);
        System.out.println(miles + " бонусных миль!");

    }
}



