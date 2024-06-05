/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarjava.todolistapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aryaa
 */
public class TodoList {
    public ArrayList<String> todoList = new ArrayList<>();

    public int getCountTodo() {
        return todoList.size();
    }
    
    public void tambahTodo(String todo) {
        todoList.add(todo);
        System.out.println("Todo berhasil ditambahkan!");
    }

    public void lihatTodo() {
        if (todoList.isEmpty()) {
            System.out.println("Todo list kosong.");
        } else {
            System.out.println("Daftar Todo:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    public void hapusTodo(int index) {
        if (index > 0 && index <= todoList.size()) {
                todoList.remove(index - 1);
                System.out.println("Todo berhasil dihapus!");
            } else {
                System.out.println("Nomor todo tidak valid.");
            }
        
    }
}
