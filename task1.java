import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class task1 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Холопов Б.Б.");
        nameBook.put(1, "Василий У.И.");
        nameBook.put(2, "Харитонов О.Х.");
        nameBook.put(3, "Максимов М.Л.");
        for (int i=0;i< nameBook.size();i++){
        if (phoneBook.get(i)==null){
            phoneBook.put(i, new ArrayList<String>()); 
            phoneBook.get(i).add("8-954-235-45-"+i+i+";"+"8-943-467-45-"+i+i);
        }
        System.out.println("Телефонные номера абонента"+" "+nameBook.get(i)+" :"+phoneBook.get(i));
        }
               
    }
}