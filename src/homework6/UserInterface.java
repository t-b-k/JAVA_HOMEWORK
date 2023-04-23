//package homework6;
//
//import homework6.Main;
//
//import java.util.*;
//
//public class UserInterface {
//    private static int NUMBER_OF_ATTEMPTS = 3;
//    private HashMap<Integer, ArrayList<Object>> userFilter;
//    private NotebooksAssortment resultNotebooksSet;
//
////    public NotebooksAssortment getNotebooksByFilter (NotebooksAssortment assortment, HashMap<Integer, ArrayList<Object>> userFilter) {
////        NotebooksAssortment result = new NotebooksAssortment();
////        Object entry;
////        for (Notebook note: assortment.notebooksSet) {
////            for (int i: userFilter.keySet()) {
////                for (Object param : userFilter.get(i)) {
////                    Notebook newInstance = new Notebook(i, param);
////                    if (inAssortment )
////                }
////            }
////        }
////        }
////    }
//    public static Brand scanUserBrand() {
//        Scanner scan = new Scanner(System.in);
//        String userInput;
//        System.out.println("Введите название интересующего вас бренда");
//        System.out.print("Допустимые значения: ");
//        System.out.println(Brand.values());
//        int i;
//        for (i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
//            userInput = scan.nextLine();
//            for (Brand brand: Brand.values()) {
//                if (brand.equals(userInput.toUpperCase())) {
//                    return brand;
//                }
//            }
//            System.out.printf("Попробуйте еще раз. Осталось %s попыток => ", NUMBER_OF_ATTEMPTS-1-i);
//        }
//        if (i == NUMBER_OF_ATTEMPTS) {
//            System.out.println("Вы не справились со вводом названия бренда.");
//            return Brand.NONE;
//        }
//    }
//    public static Color scanUserColor() {
//        Scanner scan = new Scanner(System.in);
//        String userInput;
//        System.out.println("Введите название интересующего вас цвета");
//        System.out.print("Допустимые значения: ");
//        System.out.println(Color.values());
//        int i;
//        for (i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
//            userInput = scan.nextLine();
//            for (Color color: Color.values()) {
//                if (color.equals(userInput.toUpperCase())) {
//                    return color;
//                }
//            }
//            System.out.printf("Попробуйте еще раз. Осталось %s попыток => ", NUMBER_OF_ATTEMPTS-1-i);
//        }
//        if (i == NUMBER_OF_ATTEMPTS) {
//            System.out.println("Вы не справились со вводом названия бренда.");
//            return Color.NONE;
//        }
//    }
//    public void interactWithUser (NotebooksAssortment assortment){
//        Scanner scan = new Scanner(System.in);
//        HashMap<Integer, ArrayList<Object>> userFilter;
//        Boolean goOn = true;
//        int userChoice = 0;
//
//        while (goOn) {
//            System.out.println("Введите цифру для выбора: ");
//            System.out.println("\t1 - показать ассортимент ноутбуков\n\t2 - настроить фильтр для выбора интересующих"+
//                    " вас моделей и показать результат, \n\t0 - выйти из программы.");
//            int i;
//            for (i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
//                if (scan.hasNextInt()) {
//                    userChoice = scan.nextInt();
//                    break;
//                } else {
//                        System.out.println("Вы ввели недопустимое значение. Попробуйте снова.");
//                }
//            }
//            if (i == NUMBER_OF_ATTEMPTS) userChoice = -1;
//
//            switch (userChoice) {
//                case 1:
//                    assortment.showNotebooks();
//                    break;
//                case 2:
//                    userFilter = getUserFilter();
//                    resultNotebooksSet = getNotebooksByFilter(userFilter);
//                    System.out.println("По вашему запросу найдены модели: ");
//                    resultNotebooksSet.showNotebooks();
//                    break;
//                case 0:
//                    System.out.println("Программа завершает свою работу");
//                    goOn = false;
//                    scan.close();
//                    break;
//                default:
//                    System.out.println("Вы не знаете, чего хотите. \nДО СВИДАНИЯ!");
//                    goOn = false;
//                    scan.close();
//                    break;
//            }
//        }
//    }
//    public HashMap<Integer, ArrayList<Object>> getUserFilter () {
//        HashMap<Integer, ArrayList<Object>> userFilter = new HashMap<>();
//        Scanner scan = new Scanner(System.in);
//        Boolean goOn = true;
//        int userChoice = 0;
//        ArrayList<Brand> brandFilter = new ArrayList<>();
//        ArrayList<Color> colorFilter = new ArrayList<>();
//
//
//        while (goOn) {
//            System.out.println("Введите цифру для выбора: ");
//            System.out.println("\t1 - выбрать бренд\n\t2 - выбрать цвет\n\t0 - завершить создание фильтра");
//            int i;
//            for (i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
//                if (scan.hasNextInt()) {
//                    userChoice = scan.nextInt();
//                    break;
//                } else {
//                    System.out.println("Вы ввели недопустимое значение. Попробуйте снова.");
//                }
//            }
//            if (i == NUMBER_OF_ATTEMPTS) userChoice = -1;
//
//            switch (userChoice) {
//                case 1:
//                    brandFilter.add(scanUserBrand());
//                    break;
//                case 2:
//                    colorFilter.add(scanUserColor());
//                    break;
//                case 0:
//                    goOn = false;
//                    scan.close();
//                    break;
//                default:
//                    System.out.println("Вы не знаете, чего хотите. \nДО СВИДАНИЯ!");
//                    goOn = false;
//                    scan.close();
//                    break;
//            }
//
//        }
//        userFilter.put(1, brandFilter);
//        userFilter.put(2, colorFilter);
//        return userFilter;
//    }
//}
