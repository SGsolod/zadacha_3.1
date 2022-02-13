public class BonusMilesService {
    public int calculate(int cost) {
        int ticketPrice = 10000;
        boolean bonus = ticketPrice > 20;
        if (bonus) {
            int x = ticketPrice / 20;
            System.out.println("Вам начислено" + " " + x + " " + "бонусных миль.");
        } else {
            System.out.println("Возьмите с собой друзей для начисления бонусных миль.");
        }
        System.out.println("Приятного путешествия!");
        return ;

    }
}
