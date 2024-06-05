/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import belajarjava.todolistapp.TodoList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aryaa
 */
public class TodoListAppTest {
    
    private TodoList todoListApp;

    @BeforeEach
    public void setUp() {
        todoListApp = new TodoList();
    }
    
    
    @Test
    public void testTambahTodo() {
        todoListApp.tambahTodo("Belajar Java");
        assertEquals(1, todoListApp.todoList.size());
        assertEquals("Belajar Java", todoListApp.todoList.get(0));
    }

    @Test
    public void testLihatTodo() {
        todoListApp.tambahTodo("Belajar Java");
        todoListApp.tambahTodo("Mengerjakan PR");
        assertEquals(2, todoListApp.todoList.size());
        assertEquals("Belajar Java", todoListApp.todoList.get(0));
        assertEquals("Mengerjakan PR", todoListApp.todoList.get(1));
    }

    @Test
    public void testHapusTodo() {
        todoListApp.tambahTodo("Belajar Java");
        todoListApp.tambahTodo("Mengerjakan PR");
        todoListApp.hapusTodo(1);
        assertEquals(1, todoListApp.todoList.size());
        assertEquals("Mengerjakan PR", todoListApp.todoList.get(0));
    }

    @Test
    public void testHapusTodoInvalidIndex() {
        todoListApp.tambahTodo("Belajar Java");
        todoListApp.hapusTodo(1000);
        assertEquals(1, todoListApp.todoList.size());
        assertEquals("Belajar Java", todoListApp.todoList.get(0));
    }
}
