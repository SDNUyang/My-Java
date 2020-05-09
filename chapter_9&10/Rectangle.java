package ch9;

public class Rectangle {
    private double width=1;
    private double height=1;

    /**构造方法 */
    public Rectangle(){
        System.out.println("无参构造方法被调用！");
    }
    public Rectangle(double w,double h){
        this.width=w;
        this.height=h;
    }

    /**普通方法*/
    public double getArea(){
        double area=this.height*this.width;
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*(this.width=this.height);
        return perimeter;
    }
}
