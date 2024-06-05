/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package belajarjava.todolistapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aryaa
 */
public class TodoListApp {

    public static void main(String[] args) {
        TodoList todolist = new TodoList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu Utama:");
            System.out.println("1. Tambah Todo");
            System.out.println("2. Lihat Todo");
            System.out.println("3. Hapus Todo");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // membersihkan newline character

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan todo: ");
                    String todo = scanner.nextLine();
                    todolist.tambahTodo(todo);
                    break;
                case 2:
                    todolist.lihatTodo();
                    break;
                case 3:
                    todolist.lihatTodo();
                    System.out.print("Masukkan nomor todo yang akan dihapus: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();  // membersihkan newline character

                    todolist.hapusTodo(index);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

}
