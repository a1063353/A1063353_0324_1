
public class Animal {
    private String name;
    private double height;
    private double weight;
    private double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("姓名: " + name);
        System.out.println("身高(公分): " + height + " cm");
        System.out.println("體重(公斤): " + weight + " kg");
        System.out.println("速度: " + speed + " m/s");
    }

    public double distance(double x, double y) {
        return x * y * speed;
    }

    public double distance(double x) {
        return x * speed;
    }
}