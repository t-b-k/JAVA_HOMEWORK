package homework7.laptopProject;

import static homework7.laptopProject.Brand.HP;
import static homework7.laptopProject.Colour.STEEL;

public class Laptop {
    private Brand brand;
    private Colour colour;

    public Laptop() {
        this.brand = HP;
        this.colour = STEEL;
    }
    public Laptop (Brand userBrand, Colour userColour) {
        this.brand = userBrand;
        this.colour = userColour;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setColour(Colour anyColour) {
        this.colour = anyColour;
    }
    public void setBrand (Brand anyBrand) {
        this.brand = anyBrand;
    }

    public Colour getColour() {
        return colour;
    }
    @Override
    public String toString() {
        return String.format("Ноутбук: бренд %5s, цвет %5s", brand, colour);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((colour == null) ? 0 : colour.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Laptop anyLaptop = (Laptop) obj;
        return anyLaptop.brand.equals(this.brand) && anyLaptop.colour == this.colour;

    }
}
