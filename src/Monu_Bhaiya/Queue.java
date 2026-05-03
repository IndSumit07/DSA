package Monu_Bhaiya;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;

    public Queue(int n){
        arr = new int[n];
    }

    public boolean isEmpty(){
        return front==rear;
    }
}
