package com.bdg.osahakyan.circlesimplified;

public class CircleSimplified {
        private double radius;

        public CircleSimplified(){
            radius = 1.0;
        }

        public CircleSimplified(double radius){
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea(){
            double area = Math.PI * Math.pow((double)this.radius, 2);
            return area;
        }

        public double getCircumference(){
            double area = 2 * Math.PI * this.radius;
            return area;
        }

        public String toString(){
            return "Circle [ radius = " + getRadius() + ", Area = " + getArea() + ", Circumference = " + getCircumference() + " ]";
        }
}
