import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "Yazılım kodlama Kodlama kodlama yazılım patika kodluyoruz yazılım kodlama java java Yazılım ";

        String[] strArr = str.split(" ");

        HashMap<String,Integer> repeatWord = new HashMap<String, Integer>();

        for(String elem : strArr){
            elem = elem.toLowerCase(); // tüm harfleri küçük harf olarak tanımlıyoruz.
            if (repeatWord.containsKey(elem)) {
                Integer count = repeatWord.get(elem);
                repeatWord.put(elem, count + 1);
            } else {
                // Eğer kelime HashMap'te yoksa, kelimeyi ekleyip count'u 1 olarak belirle
                repeatWord.put(elem, 1);
            }
        }

        for (String i : repeatWord.keySet()) {
            System.out.println("key : " + i + " value " + repeatWord.get(i));
        }
        String mostFrequentWord = null;
        Integer maxCount = 0;

        for(Map.Entry<String,Integer> entry: repeatWord.entrySet()){
            String word = entry.getKey();
            Integer count = entry.getValue();

            if(count > maxCount){
                mostFrequentWord = word;
                maxCount = count;
            }
        }

        System.out.println("En çok geçen kelime: " + mostFrequentWord);
        System.out.println("Count değeri: " + maxCount);

    }
}