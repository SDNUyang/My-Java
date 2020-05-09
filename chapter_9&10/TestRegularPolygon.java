package ch9;

public class TestRegularPolygon {
    public static void main(String[] args){
        /**创建三个RegularPolygon对象*/
        RegularPolygon regularPolygon1=new RegularPolygon();
        RegularPolygon regularPolygon2=new RegularPolygon(6,4);
        RegularPolygon regularPolygon3=new RegularPolygon(10,4,5.6,7.8);

        /**显示三个对象的周长和面积*/
        System.out.println("regularpolygon1:");
        System.out.println("    "+"Perimeter:"+regularPolygon1.getPerimeter());
        System.out.println("    "+"Area:"+regularPolygon1.getArea());
        System.out.println("regularpolygon2:");
        System.out.println("    "+"Perimeter:"+regularPolygon2.getPerimeter());
        System.out.println("    "+"Area:"+regularPolygon2.getArea());
        System.out.println("regularpolygon3:");
        System.out.println("    "+"Perimeter:"+regularPolygon3.getPerimeter());
        System.out.println("    "+"Area:"+regularPolygon3.getArea());
    }
}
