package Lessons_08;

public class Pyramid {
    private int lendth;
    private int n = 3;
    private int heidth;
    public Pyramid(int lendth, int heidth){
        this.lendth= lendth;
        this.heidth = heidth;
    }
    public int getHeidth() {
        return heidth;
    }

    public int getLendth() {
        return lendth;
    }

    public void setLendth(int lendth) {
        this.lendth = lendth;
    }

    public void setHeidth(int heidth) {
        this.heidth = heidth;
    }


    public double getVolume(){
        return Math.sqrt(3)*3/4*lendth*lendth*heidth;
    }
    public String toString(){
        return "Piramid [ koxmeri tiv="+ n+ "," + "length" + lendth + ","+ "heidth"+ heidth + "]";
    }
    public static void main(String []args){
        Pyramid p = new Pyramid(4,5);
        System.out.println(p.toString());
        System.out.println("Caval@ "+p.getVolume());
    }

}
