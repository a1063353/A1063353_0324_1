import java.util.Scanner;


public class A1063353_0324_1 {
    public static void main(String[] args) {
        // 產生所有物件實體並設定屬性值
        Animal a1 = new Animal("曉華", 180, 60, 105);
        Animal a2 = new Animal("阿安", 170, 50, 103);
        Animal a3 = new Animal("文文", 165, 52, 102);

        // 執行所有show方法
        a1.show();
        a2.show();
        a3.show();

        // 讓使用者針對每個成員輸入x，y（或只有x）並執行distance方法，且印出每個成員奔跑的距離
        Scanner scanner = new Scanner(System.in);

        System.out.print("曉華跑步所花時間: ");
        double x = scanner.nextDouble();
        System.out.print("曉華的加速度: ");
        double y = scanner.nextDouble();
        System.out.println("曉華奔跑距離: " + a1.distance(x, y));

        System.out.print("阿安跑步所花時間: ");
        x = scanner.nextDouble();
        System.out.print("阿安的加速度: ");
        y = scanner.nextDouble();
        System.out.println("阿安奔跑距離: " +  a2.distance(x, y));

        System.out.print("文文跑步所花時間: ");
        x = scanner.nextDouble();
        System.out.print("文文的加速度: ");
        y = scanner.nextDouble();
        System.out.println("文文奔跑距離: " + a3.distance(x, y));
    }
}
