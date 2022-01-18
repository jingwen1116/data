package com.ljw.queue;

/**
 * @auther HP
 * @Date 2022/1/17 18:24
 */
public class CircleArrayQueueDemo {
    private int front;
    private int maxSize;
    private int rear;
    private int[] arr;

    public CircleArrayQueueDemo(int maxSize) {
        this.front = 0;
        this.maxSize = maxSize;
        this.rear = 0;
        this.arr = new int[maxSize];
    }

    //判断是否空
    public boolean isEmpty(){
        return front == rear;
    }

    //判断是否满
    public boolean isFull(){
        return (rear+1)%maxSize ==front;
    }

    public void addQueue(int n){
        if (isFull()){
            System.out.println("manle");
        }
        arr[rear] = n;
        rear = (rear+1)%maxSize;
    }

    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("duiliekong");
        }
        int value = arr[front];
        front = (front+1)%maxSize;
        return value;
    }



}
