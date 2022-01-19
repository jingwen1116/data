package com.ljw.linkedlist;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.ws.soap.Addressing;

public class SingleLinkedListDemo {

    public static void main(String[] args) {
        SingleLinkedList single = new SingleLinkedList();
        single.add(new Node(1,"ZHANG","LISI"));
        single.add(new Node(2,"ZHANG2","LISI"));
        single.list();
    }
}

class SingleLinkedList{

    private Node head = new Node(0,"","");

    public void add(Node node){
        Node tmp = head;
        while (true){
            //判断链表是否到空
            if (tmp.next == null){
                break;
            }
            tmp = tmp.next;
        }
        //将数据添加到链表
        tmp.next = node;
    }

    public  void list(){
        Node tmp = head;
        if (tmp.next == null){
            System.out.println("链表为空");
            return;
        }

        while (tmp.next !=null){
            System.out.println(tmp.next);
            tmp = tmp.next;
        }
    }

    public void addByOrder(Node node){
        
    }

}



class Node{
    public int no;
    public String name;
    public String nickname;
    public Node next;

    public Node(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
