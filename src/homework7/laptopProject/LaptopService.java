package homework7.laptopProject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LaptopService {
    public static final HashSet<Laptop> laptopAssortment = new HashSet<>();

    public static void fillLaptopDatabase() {
        for (Brand i: Brand.values()) {
            for (Colour j: Colour.values()) {
                laptopAssortment.add(new Laptop(i, j));
            }
        }
    }

    public static void showLaptops (HashSet<Laptop> laptops) {
        for (Laptop item : laptops) {
            System.out.println(item);
        }
    }
}
