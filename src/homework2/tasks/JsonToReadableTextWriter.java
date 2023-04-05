package homework2.tasks;

import static homework2.Main.*;

// Дана строка json:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
public class JsonToReadableTextWriter {

    public static String[] convertJsonToStringArray (String jsonString) {
        String[] arrayOfStrings = new String[0];
        System.out.println("Разбили строку .json на массив строк-записей по пробелу: ");
        arrayOfStrings = jsonString.split(" ");
        for (String item: arrayOfStrings) {
            System.out.println(item);
        }
        System.out.println("\n");
        int numOfElements =  arrayOfStrings.length;
        System.out.println("Число записей в массиве = " + numOfElements + "\n");
        StringBuilder[] tempArray = new StringBuilder[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            tempArray[i] = new StringBuilder();
            tempArray[i].append(arrayOfStrings[i]);
        }
        int index = 0;
        // Преобразуем строки в массиве StringBuilder'ов к требуемому виду:
        for (StringBuilder personInfo : tempArray) {
            personInfo.replace(0,"[{\"".length()+KEY1.length()+"\":\"".length()+1, "Студент ");
            index = personInfo.indexOf("\"");
            personInfo.replace(index, (index-1)+"\",\"".length()+KEY2.length()+"\":\"".length()+1, " получил ");
            index = personInfo.indexOf("\"");
            personInfo.replace(index, (index-1)+"\",\"".length()+KEY3.length()+"\":\"".length()+1, " по предмету ");
            index = personInfo.indexOf("\"");
            personInfo.delete(index, personInfo.length());
        }
//        for (StringBuilder personInfo: tempArray) {
//            System.out.println(personInfo);
//        }
        for (int i = 0; i < arrayOfStrings.length; i++) {
            arrayOfStrings[i] = tempArray[i].toString();
        }
        System.out.println("Преобразовали все записи к \"человеческому\" виду: ");
        return arrayOfStrings;
    }

}
