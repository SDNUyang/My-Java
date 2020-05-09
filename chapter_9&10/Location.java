package ch9;

public class Location {
    private int row;
    private int colum;
    private double maxValue;

    public Location(){
        System.out.println("无参构造函数被调用！");
    }
    public int getRow(){
        return row;
    }
    public void changeRow(int a){
        this.row=a;
    }
    public int getColum(){
        return row;
    }
    public void changeColum(int b){
        this.colum=b;
    }
    public double getMaxValue(){
        return maxValue;
    }
    public void changeMaxValue(double m){
        this.maxValue=m;
    }
}
