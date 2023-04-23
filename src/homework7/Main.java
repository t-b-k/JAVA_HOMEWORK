package homework7;

import homework7.laptopProject.Brand;
import homework7.laptopProject.Colour;

import java.util.Scanner;

import static homework7.laptopProject.LaptopService.*;
import static homework7.laptopProject.View.*;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        fillLaptopDatabase();
        System.out.println("В продаже имеется следующий ассортимент ноутбуков: ");
        showLaptops(laptopAssortment);
        run();
        scan.close();
    }
}
