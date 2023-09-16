package OOP_Homework1.points;

public class Point3D extends Point2D {

  private double z;

  public Point3D(double x, double y, double z) {
    super(x, y);
    this.z = z;
  }

  public Point3D(Point2D point, double z) {
    super();
    this.z = z;
  }


  public double getZ() {
    return z;
  }

  public void setZ(double z) {
    this.z = z;
  }

  @Override
  public String toString() {
    return "Point3D{" +
        "x=" + getX() +
        ", y=" + getY() +
        ", z=" + getZ() +
        '}';
  }

  public double deltaZ(double z2) {
    return Math.abs(z2 - this.getZ());
  }

  public Point3D getMidPoint3D(Point3D point2) {

    return new Point3D(super.getMidPoint2D((Point2D) point2),
        this.deltaZ(point2.getZ()) + this.getZ());
  }

  public double getDistance3D(Point3D point2) {
    double distance = Math.abs(
        Math.pow(this.getDistance2D(point2), 2) + Math.pow(point2.getZ() - this.getZ(), 2));
    return distance;
  }


  public boolean isOnTheLine3D(Point3D point1, Point3D point2) {
    if (super.isOnTheLine(point1, point2) && (point2.z - point1.z > this.z - point1.z)) {
      return true;
    } else {
      return false;
    }
  }
}
