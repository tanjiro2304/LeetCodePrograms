package programs;

import java.util.*;

public class RomanNumbers {
    static Map<String,Integer> romanValues;
    static List<String> romanOrder;
    public static void loadValues(){
        romanValues = new HashMap<String,Integer>();
        romanOrder = new ArrayList<>();
        romanValues.put("I",1);
        romanValues.put("V",5);
        romanValues.put("X",10);
        romanValues.put("L",50);
        romanValues.put("C",100);
        romanValues.put("D",500);
        romanValues.put("M",1000);

        romanOrder.add("I");
        romanOrder.add("V");
        romanOrder.add("X");
        romanOrder.add("L");
        romanOrder.add("C");
        romanOrder.add("D");
        romanOrder.add("M");
    }

    public static Integer romanToInt(String s){
        loadValues();
        int result = 0;
        for(int i = s.length()-1; i >= 0; i--){

            if(i == s.length()-1){
                result = result + romanValues.get(String.valueOf(s.charAt(i))
                        .toUpperCase());
            }
            else{
                String currentValue = String.valueOf(s.charAt(i));
                String previousValue = String.valueOf(s.charAt(i + 1));
                if (romanOrder.indexOf(previousValue) > romanOrder.indexOf(currentValue)){
                    result = result - romanValues.get(currentValue.toUpperCase());
                }
                else{
                    result = result + romanValues.get(currentValue.toUpperCase());
                }
            }



        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

}