package circlecylinder;

import circlecylinder.Circle;

public class Cylinder extends Circle {
    private double heigth =1.0;


  public Cylinder(){

  }

  public Cylinder(double radius){
     this.radius=radius;
  }
  public Cylinder(double radius, double heigth){
      super.radius = radius;
      this.heigth = heigth;
  }
  public Cylinder (double radius, double heigth, String color){
      this.radius = radius;
      this.heigth = heigth;
      this.color = color;
  }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getVolume(){
      return getArea()*heigth;
    }
}
