package ch10;

public class TestQueue {
    public static void main(String[] args){
        Queue Q=new Queue();
        for (int i=0;i<20;i++){
            Q.enqueue(i);
        }
        System.out.println(Q.getSize());
        while(!Q.empty())
            System.out.print(Q.dequeue()+" ");
    }
}
