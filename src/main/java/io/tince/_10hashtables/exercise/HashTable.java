package io.tince._10hashtables.exercise;

import java.util.Objects;

public class HashTable {
    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE//
    //                                                         //
    //                                                         //
    //                                                         //
    //                                                         //
    /////////////////////////////////////////////////////////////
    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public Node[] getDataMap() {
        return dataMap;
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if(dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    ///  WRITE SET METHOD HERE  ///
    //                           //
    //                           //
    //                           //
    //                           //
    ///////////////////////////////
    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            if (Objects.equals(temp.key, key)) {
                temp.value += value;
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
                if (Objects.equals(temp.key, key)) {
                    temp.value += value;
                    return;
                }
            }
            temp.next = newNode;
        }
    }

    ///  WRITE GET METHOD HERE  ///
    //                           //
    //                           //
    //                           //
    //                           //
    ///////////////////////////////
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (Objects.equals(temp.key, key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }
}
