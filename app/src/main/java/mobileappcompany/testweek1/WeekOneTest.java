package mobileappcompany.testweek1;

/**
 * Created by fallaye on 12/1/17.
 */
public class WeekOneTest {

    public String encodeString(String str){
        String returnStr ="";
        char ch;
        char newCh;

        for(int i = 0; i < str.length(); i ++){
            ch = str.charAt(i);
            if(Character.isLetter(ch)){
                returnStr += getNewChar(ch);
            }
        }
        return returnStr;
    }

    public char getNewChar(char ch){
        char listCh[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p','q',
                'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z'};

        char returnChar;
        int index = 0;
        int tempIndex = 0;
        for(int i = 0; i < listCh.length ; i++){
            if(ch == listCh[i]){
                tempIndex = i;
                System.out.println("Temp Index: " + tempIndex);
            }
            index = ((tempIndex)  % 26 + 25) % 26;

        }
       // System.out.println("Temp Index: " + tempIndex);
        return listCh[index];
    }

    public static void main(String[] args) {
        WeekOneTest wot = new WeekOneTest();
        System.out.println(wot.encodeString("acp"));
    }

}
