package day26MapsExceptions;

import java.util.*;

public class Maps03 {
    //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
    //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız olsun)
    //example 1: Given a String, count the number of times each word is used in that String
    // write the code that displays.(Case insensitive)


    public static void main(String[] args) {
        String s = "Ali nasilsin Ali.";

        s = s.replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println(s);

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> myMap = new HashMap<>();

        for (String w : words){
            Integer isThere = myMap.get(w);//w String dir. Key verdik, value getirecek
            System.out.println(isThere);

            if (isThere ==null){
                myMap.put(w,1);
            }else {
                myMap.put(w,isThere+1);
            }
        }
        System.out.println(myMap);

        String s1 = "AlperenAlkan".toLowerCase();
        LinkedHashMap<Character,Integer> myMap1 = new LinkedHashMap<>();




        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);

            // Eğer harf daha önce eklenmişse sayısını artır
            if (myMap1.containsKey(a)) {
                myMap1.put(a, myMap1.get(a) + 1);
            } else {
                myMap1.put(a, 1); // İlk kez görüyorsak 1 ile başlat
            }
        }
        System.out.println(myMap1);






    //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
    //example 2: Write the code that shows how many times each letter in a given String is used in that String.
    //           "Hello" ==> h=1, e=1, l=2, o=1

        String str = "Hello12Java.123";

        str = str.replaceAll("[\\p{Punct}\\d]","").toLowerCase();
        System.out.println(str);

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr)); //[h, e, l, l, o, j, a, v, a]

        HashMap<String,Integer> myMap02 = new HashMap<>();
        System.out.println(myMap02); //{}

        System.out.println("----------------------------------");

        for (String w : arr){
            Integer isThere = myMap02.get(w);
            if (isThere == null){
                myMap02.put(w,1);
            }else {
                myMap02.put(w,isThere+1);
            }

        }
        System.out.println(myMap02); //{a=2, e=1, v=1, h=1, j=1, l=2, o=1}

        TreeMap<String,Integer> myMap03 = new TreeMap<>(myMap02);
        System.out.println(myMap03); //{a=2, e=1, h=1, j=1, l=2, o=1, v=1}

        System.out.println("----------------------------------");

        for (Map.Entry<String,Integer> w : myMap03.entrySet()){

            String keyValues = w.getKey();
            int values = w.getValue();

            System.out.println(keyValues+ " harfi bu kelimede "+ values+" tanedir");
        }


    }















}
