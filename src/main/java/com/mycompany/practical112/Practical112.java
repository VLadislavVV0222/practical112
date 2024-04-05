/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical112;

/**
 *
 * @author vladc
 */
import java.io.*;
import com.mirea.kt.example.Product;
import java.util.*;
public class Practical112 {

    public static void main(String[] args) {
        System.out.println("Вариант 5");
        System.out.println("ФИО: Чугунов Владислав Владимирович");
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the path to the file: C:"+"\\"+"\\");
        String filePath = "C:\\"+scanner.next(); // пользователь должен ввести путь к файлу

        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Product product = (Product) objectIn.readObject();

            System.out.println("Code: " + product.getCode());
            System.out.println("Name: " + product.getName());
            System.out.println("Type: " + product.getType());
            System.out.println("Discount: " + product.isDiscount());
            System.out.println("Ingredients: " + product.getIngredients());
            System.out.println("Price: " + product.getPrice());

            objectIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}