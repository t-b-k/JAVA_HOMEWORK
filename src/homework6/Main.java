package homework6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {
    public NotebooksAssortment notebookAssortment = new NotebooksAssortment();
    public static Map<Integer, Object> searchCriteria = new HashMap<>();
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        System.out.println(notebook);
        System.out.println(UserInterface.scanUserBrand());
    }
}
