package com.tasks3.linkedlist;

import java.util.*;

/**
 * Created by Ulyana on 05-Mar-17.
 */
public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {
    }

    public void add(Integer data) {
        Node node = new Node(data);
        if (this.last != null) {
            this.last.setNext(node);
            this.last = node;
        } else {
            this.first = this.last = node;
        }
    }

    public Integer get(int index) {
        if (this.first != null) {
            int count = 0;
            Node node = this.first;
            while (node != null) {
                if (count == index) {
                    return node.getData();
                }
                count++;
                node = node.getNext();
            }
        }
        return null;
    }

    public boolean delete(int index) {
        Node previous = null;
        if (this.first != null) {
            int count = 0;
            Node node = this.first;
            while (node != null) {
                if (count == index) {
                    if (previous != null) {
                        previous.setNext(node.getNext());
                        if (node == this.last) {
                            this.last = previous;
                        }
                        return true;
                    } else {
                        if (this.first == this.last) {
                            this.last = this.first = node.getNext();
                        } else {
                            this.first = node.getNext();
                        }
                        return true;
                    }
                } else {
                    count++;
                    previous = node;
                    node = node.getNext();
                }
            }
        }
        return false;
    }

    public int size() {
        Node n = this.first;
        int count = 0;
        while (n != null) {
            count++;
            n = n.getNext();
        }
        return count;
    }

    private class Node {
        private Node next;
        private Integer data;

        public Node() {
        }

        public Node(Integer data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }
    }

}
