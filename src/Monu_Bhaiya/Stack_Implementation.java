package Monu_Bhaiya;

public class Stack_Implementation {
    private int[] arr;
    private int idx=-1;

    public Stack_Implementation(){
        this(5);
    }

    public Stack_Implementation(int n){
        arr = new int [n];
    }

    //O(1)
    public boolean isEmpty() {
        return idx ==-1;
    }

    //O(1)
    public boolean isfull() {
        return size()==arr.length;
    }

    //O(1)
    public void push(int x) throws Exception {
        if(isfull()){
            throw new Exception("full ho gya");
        }
        arr[++idx]=x;
    }

    //O(1)
    public int size(){
        return idx+1;
    }

    //O(1)
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("stack empty h");
        }
        return arr[idx-1];
    }

    //O(1)
    public int peek(){
        return arr[idx];
    }

    //O(1)
    public void Display(){
        for(int i=0;i<=idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}