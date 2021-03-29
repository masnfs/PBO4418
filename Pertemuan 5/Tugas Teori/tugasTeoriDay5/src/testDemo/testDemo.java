/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDemo;

import java.util.*;

/**
 *
 * @author Ncy
 */
public class testDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("[ArrayList]");
        Array new_array = new Array();
        new_array.append(0,1);
        new_array.append(3);
        new_array.append(1);
        new_array.show_all();
        System.out.println("-");
        new_array.append(0,4);
        new_array.append(8);
        new_array.show_all();
        System.out.println("-");
        new_array.pop();
        new_array.show_all();
        System.out.println("-");
        new_array.change_data(0, 10);
        new_array.show_all();
        System.out.println("-");
        
        System.out.println("[Stack]");
        StackList new_stack = new StackList();
        new_stack.append(5);
        new_stack.append(4);
        new_stack.append(1);
        new_stack.append(2);
        new_stack.show_all();
        System.out.println("-");
        new_stack.append(10);
        new_stack.show_all();
        System.out.println("-");
        new_stack.pop();
        new_stack.pop();
        new_stack.show_all();
        System.out.println("-");
        new_stack.change_data(2, 40);
        new_stack.show_all();
        System.out.println("-");
        
        System.out.println("[Queue]");
        QueueList new_queue = new  QueueList();
        new_queue.append(1);
        new_queue.append(2);
        new_queue.append(3);
        new_queue.append(4);
        new_queue.show_all();
        System.out.println("-");
        new_queue.pop();
        new_queue.show_all();
        System.out.println("-");
    }
    
}

class Node{
    int[] node = new int[4];
}

class QueueList extends Node{
    public void append(int data){
        try{
            for (int x = 0; x < node.length+1; x++){
                if (node[x] == 0){
                    node[x] = data;
                    break;
                }
                
                if (x == node.length+1){
                    throw new Exception("");
                }
            }
        } catch(Exception e){
            int len = node.length;
            int[] temp_node = new int[len+1];
            for (int i = 0; i < len; i++){
                temp_node[i] = node[i];
            }
            temp_node[len] = data;
            node = temp_node.clone();
        }
    }
    
    public void pop(){
        int len = node.length;
        int[] temp_node = new int[len-1];
        for (int i = 0; i < temp_node.length; i++){
            temp_node[i] = node[i+1];
        }
        node = temp_node.clone();
    }
    
    public void change_data(int index, int data){
        node[index] = data;
    }
    
    public void show_all(){
        for (int x = 0; x < node.length; x++){
            System.out.println(node[x]);
        }
    }
}

class StackList extends Node{
    public void append(int data){
        try{
            for (int x = 0; x < node.length+1; x++){
                if (node[x] == 0){
                    node[x] = data;
                    break;
                }
                
                if (x == node.length+1){
                    throw new Exception("");
                }
            }
        } catch(Exception e){
            int len = node.length;
            int[] temp_node = new int[len+1];
            for (int i = 0; i < len; i++){
                temp_node[i] = node[i];
            }
            temp_node[len] = data;
            node = temp_node.clone();
        }
    }
    
    public void pop(){
        int len = node.length;
        int[] temp_node = new int[len-1];
        for (int i = 0; i < temp_node.length; i++){
            temp_node[i] = node[i];
        }
        node = temp_node.clone();
    }
    
    public void change_data(int index, int data){
        node[index] = data;
    }
    
    public void show_all(){
        for (int x = 0; x < node.length; x++){
            System.out.println(node[x]);
        }
    }
}


class Array extends Node{
    public void append(int data){
        for (int x = 0; x < node.length; x++){
            if (node[x] == 0){
                node[x] = data;
                break;
            }
        }
    }
    
    public void append(int index, int data){
        node[index] = data;
    }
    
    public void pop(){
        for (int x = node.length-1; x > 0; x--){
            if (node[x] != 0){
                node[x] = 0;
                break;
            }
        }
    }
    
    public void pop(int index){
        node[index] = 0;
    }
    
    public void change_data(int index, int data){
        node[index] = data;
    }
    
    public void show_all(){
        for (int x = 0; x < node.length; x++){
            System.out.println(node[x]);
        }
    }
}