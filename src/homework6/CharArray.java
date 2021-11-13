package homework6;

public class CharArray {
    public static void main(String[] args) {
        char[] charArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        int count = 0;
        int c = 'o';
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                count++;

            }
            System.out.println("count of" + c + "=" + count);
        }
        //Գտնել մեջտեղի սինվոլը
        char[] charArray1 = {'b', 'a', 'b', 'o', 'l', 'a'};
        System.out.println(charArray1[charArray1.length / 2]);
        System.out.println(charArray1[charArray1.length / 2 + 1]);
        // եթե վերջին էլեմենտը վերջանում է y-ով և նախավերջինը՝ l-ով, տպել true
        char[] charArray2 = {'b', 'a', 'b', 'o', 'l', 'a'};
        if (charArray2[charArray2.length - 1] == 'y' && charArray2[charArray2.length - 2] == 'l') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // Ունենք b որից 2 հատ հետո էլի b է տպել true
        char[] charArray3 = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean isBob = false;
        for (int i = 0; i < charArray3.length; i++) {
            if (charArray3[i] == 'b' && charArray3[i + 2] == 'b') {
                isBob = true;
                break;

            }
            System.out.println(isBob);


        }char[] test={' ',' ','h','e','l','l','o',' ',' '};


    }
}



