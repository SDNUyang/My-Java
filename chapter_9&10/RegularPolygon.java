package ch9;

public class RegularPolygon {
    private int n=3;
    private double side=1;
    private double x=0;
    private double y=0;

    /**构造方法*/
    public RegularPolygon(){
        System.out.println("无参构造方法被调用");
    }
    public RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
    }
    public RegularPolygon(int n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }

    /**接口*/
    public int getN(){
        return n;
    }
    public void changeN(int n){
        this.n=n;
    }
    public double getSide(){
        return side;
    }
    public void changeSide(double side){
        this.side=side;
    }
    public double getX(){
        return x;
    }
    public void changeX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void changeY(double y){
        this.y=y;
    }

    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        double s;
        double molecule;
        double deno;
        molecule=n*side*side;
        deno=4*Math.tan(Math.PI/n);
        s=molecule/deno;
        return s;
    }

}
