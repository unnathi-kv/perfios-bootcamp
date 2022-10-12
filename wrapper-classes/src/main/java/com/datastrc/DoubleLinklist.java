package com.datastrc;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) { data = d; }
}
public class DoubleLinklist {
        Node head = null;
        public void push(int new_data)
        {
            Node new_Node = new Node(new_data);
            new_Node.next = head;
            new_Node.prev = null;

            if (head != null)
                head.prev = new_Node;

            head = new_Node;
        }
}


