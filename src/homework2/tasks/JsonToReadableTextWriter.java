package homework2.tasks;

public class JsonToReadableTextWriter {

    public static String[] convertJsonToStringArray (String jsonString) {
        String[] arrayOfStrings = new String[0];
        System.out.println("Разбили строку .json на массив строк-записей: ");
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
        for (StringBuilder personInfo : tempArray) {
            personInfo.replace(0,12, "Студент ");
            index = personInfo.indexOf("\"");
            personInfo.replace(index, index+2+"оценка".length()+4, " получил ");
            index = personInfo.indexOf("\"");
            personInfo.replace(index, index+2+"предмет".length()+4, " по предмету ");
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
