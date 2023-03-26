import java.util.Scanner;

public class inputs {

    public static Scanner iScanner = new Scanner(System.in);

    // Формируем склад
    public static void getWarehouseInputToy(){
        Toys toy1 = new Toys(0, "Мишка", 25);
        Toys toy2 = new Toys(1, "Ракета", 40);
        Toys toy3 = new Toys(2, "Бомбочка", 3);
        Toys toy4 = new Toys(3, "Кукла", 65);
        Toys toy5 = new Toys(4, "Машинка", 25);
    }

    public static void getUserInputToy(){
        System.out.println("Вы находитесь в меню, ввод новой игрушки");
        System.out.println("Укажите имя: ");
        String name = iScanner.nextLine();
        System.out.println("Укажите SuccessRate: ");
        String successRate = iScanner.nextLine();

    }


}
