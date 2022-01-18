package com.ljw.queue;

import java.util.Queue;

/**
 * @auther HP
 * @Date 2022/1/17 18:24
 */
public class ArrayQueueDemo {
    private int front;
    private int maxSize;
    private int rear;
    private int[] arr;

    public ArrayQueueDemo(int maxSize) {
        this.front = -1;
        this.maxSize = maxSize;
        this.rear = -1;
        this.arr = new int[maxSize];
    }

    //判断是否空
    public boolean isEmpty(){
        return front == rear;
    }

    //判断是否满
    public boolean isFull(){
        return rear == maxSize-1;
    }

    public void addQueue(int n){
        if (isFull()){
            System.out.println("manle");
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("duiliekong");
        }
        front++;
        return arr[front];
    }



}
