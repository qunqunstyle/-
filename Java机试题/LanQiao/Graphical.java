package lanqiao;

public class Graphical {
    final static double PI = 3.1415926;// 创建静态常量π
    public static void main(String[] args) {
        double radius = 3.0;// 半径
        Circular yuan = new Circular(radius);
        Spherical qiu = new Spherical(radius);
    }
}
class Circular {
    double radius;// 半径
    double area;// 面积
    public Circular(double radius) {
        this.radius = radius;

         area = Graphical.PI * radius * radius;// 计算面积
        System.out.println("圆的半径是：" + radius + ",圆的面积是：" + area);
    }
}
class Spherical {
    double radius;// 半径
    double volume;// 体积
    public Spherical(double radius) {
        this.radius = radius;
         volume = 4 / 3 * Graphical.PI * radius * radius * radius;// 计算体积
        System.out.println("球的半径是：" + radius + ",球的体积是：" + volume);
    }
}

