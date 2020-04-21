import java.lang.Math;

public class Point3d extends Point2d {
    /* Координата Z */
    private double zCoord;
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    /* Конструктор по умолчанию */
    public Point3d() {
        this(0, 0, 0);
    }
    /* Возвращение координаты Z */
    public double getZ() {
        return zCoord;
    }
    /* Установка значения координаты Z */
    public void setZ(double val) {
        zCoord = val;
    }
    /* Метод для нахождения расстояния между двумя точками */
    public double distanceTo(Point3d o) {
        double dist =  Math.sqrt(
                Math.pow(this.getX() - o.getX(), 2) +
                Math.pow(this.getY() - o.getY(), 2) +
                Math.pow(this.getZ() - o.getZ(), 2));
        return Math.round(dist * 100) / 100;
    }
}
