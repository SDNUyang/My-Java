package ch10;

public class Queue {
    private int[] element;
    private int size;
    public static final int DEFAULT_CAPACITY=8;

    public Queue(){
        element=new int[DEFAULT_CAPACITY];
    }
    public Queue(int value){
        element=new int[value];
    }
    public int getSize(){
        return size;
    }
    public boolean empty(){
        if (size==0)
            return true;
        else return false;
    }
    public void enqueue(int v){
        if(size>=element.length){
            int[] temp=new int[element.length*2];
            System.arraycopy(element,0,temp,0,element.length);
            element=temp;
        }
        element[size++]=v;
    }
    public int dequeue(){
        return element[--size];
    }
}
