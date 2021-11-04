package com.huseyinuslu.interestcalculater;

import java.util.*;

/**
 * @author Huseyin Uslu
 * @version 1.0
 * @since 3.11.2021
 * Pazar alisveris odevi */

public class Main {

   /* Armut : 2,14 TL
      Elma : 3,67 TL
      Domates : 1,11 TL
      Muz: 0,95 TL
      Patlıcan : 5,00 TL*/

    private static HashMap<String,Double> fiyatList = new HashMap<>();
    public static void main(String[] args){

        Random random = new Random();
        double total = 0.0;
        Scanner input = new Scanner(System.in);

        fiyatList.put("domates",1.11);
        fiyatList.put("elma",3.67);
        fiyatList.put("armut",2.14);
        fiyatList.put("muz",0.95);
        fiyatList.put("patlıcan",5.00);
        //digerlerini bilgisayar belirleyecek..

         String[] array = new String[]{
                 "yes",
                 "evet",
                         "var",
                         "1",
                         "kesinlikle",
                         "tabi",
                         "tabiki",
                         "tabi ki",
                         "neden olmasin?",
                         "az daha var",
                         "daha cok var",
                         "daha çok var"
         };

        List<String> onayMesajlari = new ArrayList<>(Arrays.asList(array));

        ArrayList<String> neAldim = new ArrayList<String>();
        ArrayList<Integer> kacKiloAldim = new ArrayList<>();

        boolean dahasiVarmi = true;

        print("Pazardan ne aldim uygulamasina hosgeldiniz. \n \n",true);

        while (dahasiVarmi){
            print("Pazardan ne aldım: ",false);
            neAldim.add(input.next());
            print("Kac kilo aldim: ",false);
            kacKiloAldim.add(input.nextInt());
            print("dahasi var midir?",false);
            if(!onayMesajlari.contains(input.next())){
             dahasiVarmi = false;
            }
        }
        for (int i = 0;i < neAldim.size();i++){
            String s = neAldim.get(i);
            if(fiyatList.containsKey(s)){
                total = total + (fiyatList.get(s) * kacKiloAldim.get(i));
            }else{
                double rnd = random.nextInt(10);
                fiyatList.put(s,rnd);
                total = total + (rnd * kacKiloAldim.get(i));
            }
        }

        print("fiyat listesi: ",true);
        Set<Map.Entry<String, Double>> set = fiyatList.entrySet();//Converting to Set so that we can traverse

        for (Map.Entry<String, Double> stringDoubleEntry : set) {
            //Converting to Map.Entry so that we can get key and value separately
            System.out.println(((Map.Entry) stringDoubleEntry).getKey() + " " + ((Map.Entry) stringDoubleEntry).getValue());
        }

        print("borcunuz: " + total,false);
    }

    private static void print(String str,boolean hasLine){
        if(hasLine){
            System.out.println(str);
        }else{
            System.out.print(str);
        }
    }

    }

