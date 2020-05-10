package ch10;
/*有bug，位置关系判断不准确*/
public class TestMyRectangle2D {
    public static void main(String[] args){
        MyRectangle2D r1=new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("Area："+r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());
        System.out.println(r1.contains(3,3));
        MyRectangle2D r2=new MyRectangle2D(4,5,10.5,3.2);
        System.out.println(r1.contains(r2));
        MyRectangle2D r3=new MyRectangle2D(3,5,2.3,5.4);
        System.out.println(r1.overlaps(r3));
    }
}
