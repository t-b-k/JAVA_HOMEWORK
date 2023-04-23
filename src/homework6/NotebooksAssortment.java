package homework6;

import java.util.HashSet;

public class NotebooksAssortment {
    HashSet<Notebook> notebooksSet;

    public NotebooksAssortment() {
        notebooksSet = new HashSet<>();
    }

    public NotebooksAssortment addNotebookToAssortment (Notebook newNote) {
        notebooksSet.add(newNote);
        return this;
    }
    public NotebooksAssortment removeNotebookFromAssortment (Notebook note) {
        notebooksSet.remove(note);
        return this;
    }
    public Notebook inAssortment (Notebook sample) {
        Notebook result = new Notebook();
        for (Notebook note: notebooksSet) {
            if (sample.getBrand().equals(note.getBrand()) && sample.getColor().equals(note.getColor())) {
                return new Notebook(note.getBrand(), note.getColor());
            }
        }
        return null;
    }
    public NotebooksAssortment filterByBrand (Brand brand) {
        NotebooksAssortment resultSet = new NotebooksAssortment();
        for (Notebook note: notebooksSet) {
            if (note.getBrand().equals(brand)) {
                resultSet.addNotebookToAssortment(note);
            }
        }
        return resultSet;
    }
    public NotebooksAssortment filterByColor (Color color) {
        NotebooksAssortment resultSet = new NotebooksAssortment();
        for (Notebook note: notebooksSet) {
            if (note.getColor().equals(color)) {
                resultSet.addNotebookToAssortment(note);
            }
        }
        return resultSet;
    }
    public void showNotebooks (){
        for (Notebook note: this.notebooksSet) {
            System.out.printf("Бренд - %s, цвет - %s\n", note.getBrand(), note.getColor());
        }
    };
}
