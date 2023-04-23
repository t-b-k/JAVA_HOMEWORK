package homework7.laptopProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import homework7.Main;

import static homework7.Main.scan;
import static homework7.laptopProject.LaptopService.laptopAssortment;
import static homework7.laptopProject.LaptopService.showLaptops;

public class View {
    private static final int NUMBER_OF_ATTEMPTS = 3;
    public static Brand inputBrand () {
//        Scanner scan = new Scanner(System.in);
        String userInput;
        System.out.println("Введите название интересующего вас бренда");
        System.out.print("В наличии имеются бренды: ");
        System.out.println(Arrays.toString(Brand.values()));
        System.out.print("===> ");
        int attemptsCounter;
        for (attemptsCounter = 0; attemptsCounter < NUMBER_OF_ATTEMPTS; attemptsCounter++) {
            userInput = scan.next();
            for (Brand nextBrand: Brand.values()) {
                if (userInput.compareToIgnoreCase(nextBrand.toString()) == 0) {
//                    scan.close();
                    return nextBrand;
                }
            }
            System.out.printf("Попробуйте еще раз. У вас осталось %s попытка(и)\n", NUMBER_OF_ATTEMPTS-1-attemptsCounter);
            System.out.print("===> ");
        }
        System.out.println("К сожалению, Вы не справились со вводом названия бренда.");
//        scan.close();
        return null;
    }
    public static Colour inputColour () {
//        Scanner scan = new Scanner(System.in);
        String userInput;
        System.out.println("Введите название интересующего вас цвета");
        System.out.print("В наличии имеются цвета: ");
        System.out.println(Arrays.toString(Colour.values()));
        System.out.print("===> ");
        int attemptsCounter;
        for (attemptsCounter = 0; attemptsCounter < NUMBER_OF_ATTEMPTS; attemptsCounter++) {
            userInput = scan.next();
            for (Colour nextColour: Colour.values()) {
                if (userInput.compareToIgnoreCase(nextColour.toString()) == 0) {
//                    scan.close();
                    return nextColour;
                }
            }
            System.out.printf("Попробуйте еще раз. У вас осталось %s попытка(и)\n", NUMBER_OF_ATTEMPTS-1-attemptsCounter);
            System.out.print("===> ");
        }
        System.out.println("К сожалению, Вы не справились со вводом названия цвета.");
//        scan.close();
        return null;
    }
    public static String inputAction () {
//        Scanner scan = new Scanner(System.in);
        String userInput;
        System.out.print("Введите действие - 0/1/2 ===> ");
        int attemptsCounter;
        for (attemptsCounter = 0; attemptsCounter < NUMBER_OF_ATTEMPTS; attemptsCounter++) {
            userInput = scan.next();
            if (userInput.equals("1") || userInput.equals("2") || userInput.equals("0")) {
//                scan.close();
                return userInput;
            } else {
                System.out.printf("Попробуйте еще раз. У вас осталось %s попытка(и)\n", NUMBER_OF_ATTEMPTS - 1 - attemptsCounter);
                System.out.print("===> ");
            }
        }
        System.out.println("К сожалению, Вы не смогли определиться. Программа завершает работу.");
//        scan.close();
        return "0";
    }
    public static void run () {
//        Scanner scan = new Scanner(System.in);
        HashMap<Parameters, String> userFilter;
        Boolean goOn = true;
        String userChoice;
        String filterOption;

        while (goOn) {
            System.out.println("Выберите действие: ");
            System.out.println("\t1 - показать ассортимент ноутбуков\n\t2 - настроить фильтр для выбора интересующих"+
                    " вас моделей и вывести результат, \n\t0 - завершить сеанс.");
            userChoice = inputAction ();
            switch (userChoice) {
                case "1":
                    showLaptops(laptopAssortment);
                    break;
                case "2":
                    Brand brandFilter = null;
                    Colour colourFilter = null;
                    System.out.println("Выберите действие: ");
                    System.out.println("\t1 - отфильтроваться по бренду\n\t2 - отфильтроваться по цвету"+
                            "\n\t0 - выбрать и бренд, и цвет");
                    filterOption = inputAction();
                    switch (filterOption) {
                        case "1":
                            brandFilter = inputBrand();
                            break;
                        case "2":
                            colourFilter = inputColour();
                            break;
                        case "0":
                            brandFilter = inputBrand();
                            colourFilter = inputColour();
                            break;
                        default:
                            break;
                    }
                    HashSet<Laptop> resultLaptops = new HashSet<>();
                    if (brandFilter != null) {
                        for (Laptop nextLap : laptopAssortment) {
                            if ((nextLap.getBrand().toString()).equals(brandFilter.toString())) {
                                resultLaptops.add(nextLap);
                            }
                        }
                        if (colourFilter != null) {
                            HashSet<Laptop> interResult = resultLaptops;
                            resultLaptops = new HashSet<>();
                            for (Laptop nextLap : interResult) {
                                if ((nextLap.getColour().toString()).equals(colourFilter.toString())) {
                                    resultLaptops.add(nextLap);
                                }
                            }
                        }
                    }
                    else {
                        if (colourFilter != null) {
                            for (Laptop nextLap : laptopAssortment) {
                                if ((nextLap.getColour().toString()).equals(colourFilter.toString())) {
                                    resultLaptops.add(nextLap);
                                }
                            }
                        }
                    }
                    if (brandFilter != null || colourFilter != null) {
                        System.out.println("По Вашему фильтру найдены следущие модели: ");
                        showLaptops(resultLaptops);
                    }
                    break;
                case "0":
                    goOn = false;
                    break;
                default:
                    System.out.println("Вы ввели недопустимое знаение. \nПрограмма завершает работу. ");
                    goOn = false;
                    break;
            }
        }
    }
}

