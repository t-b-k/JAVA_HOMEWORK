package homework6;

public class Notebook {
    private Brand brand;
    private Color color;
    public Notebook (){
        this.brand = Brand.HP;
        this.color = Color.STEEL;
    }
    public Notebook (Brand brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Ноутбук %s, цвет %s", brand, color);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
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
        Notebook note = (Notebook) obj;
        return note.brand.equals(this.brand) && note.color == this.color;

    }
}
