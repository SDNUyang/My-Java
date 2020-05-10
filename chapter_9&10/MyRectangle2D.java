package ch10;

import java.util.Random;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

/**构造方法*/
    public MyRectangle2D(){
        this.x=0;
        this.y=0;
        this.width=1;
        this.height=1;
    }
    public MyRectangle2D(double x,double y,double width,double height){
        if(width<=0||height<=0)
            System.out.println("创建失败!，请检查输入的矩形边长是否符合要求!");
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

/**get set 方法*/
    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }

/**面积周长*/
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    /**位置关系*/
    public boolean contains(double x,double y){
        double x1=this.x-1/2*this.width;
        double y1=this.y+1/2*this.height;
        double x2=this.x+1/2*this.width;
        double y2=this.y-1/2*this.height;
        if(x>x1&&x<x2&&y>y2&&y<y1)
            return true;
        //else return false;
        return false;
    }
    public boolean contains(MyRectangle2D r){
        double x1=this.x-1/2*this.width;
        double y1=this.y+1/2*this.height;
        double x2=this.x+1/2*this.width;
        double y2=this.y-1/2*this.height;
        boolean judgeSide=r.getWidth()<this.width&&r.getHeight()<this.height;
        boolean judgePoint=r.getX()>x1&&r.getX()<x2&&r.getY()>y2&&r.getY()<y1;
        boolean judgeOthers1=(x2-r.getX())>(1/2*r.getWidth())&&(r.getX()-x1)>(1/2*r.getWidth());
        boolean judgeOthers2=(y1-r.getY())>(1/2*r.getHeight())&&(r.getY()-y2)>(1/2*r.getHeight());
        if(judgeOthers1&&judgeOthers2&&judgePoint&&judgeSide)
            return true;
        else return false;
    }
    public boolean overlaps(MyRectangle2D r){
        int sum=0;
        for (int i=0;i<1000;i++){
            double randx=randomNumbers(r.getX()-1/2*r.getWidth(),r.getX()+1/2*r.getWidth());    //随机产生在所给举行范围内的点
            double randy=randomNumbers(r.getY()-1/2-r.getHeight(),r.getY()+1/2*r.getHeight());
            double x1=this.x-1/2*this.width;
            double y1=this.y+1/2*this.height;
            double x2=this.x+1/2*this.width;
            double y2=this.y-1/2*this.height;
            if(randx>x1&&randx<x2&&randy>y2&&randy<y1)
                sum++;
        }
        if(sum>10)
            return true;
        else return false;

    }


    public static double randomNumbers(double x1,double x2){
        double randNum=x1+Math.random()*((x2-x1)+1);
        return randNum;
    }
}
