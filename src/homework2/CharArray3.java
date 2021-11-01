package homework2;

public class CharArray3 {
    public static void main(String[] args) {
        char[] array1 ={'b','a','b','o','l','a'};
        boolean bob= false;
        for (int i = 0; i < array1.length-2; i++){
            if (array1[i]=='b'&& array1[i+2]=='b'){
                bob=true;
                break;
            }System.out.println(bob);

            }char[]array={'b','a','b','o','l','a'};
            boolean isBob =false;
            for (int i = 0; i< array.length ; i++) {
                if (array[i]=='b'&& array[i+2]=='b'){
                    isBob=true;
                    break;
                }System.out.println(isBob);

            }char[] text= {' ',' ','b','o','l','o', 'l','a',' ',' '};
            int startIndex =0;
            int endIndex= text.length-1;
            while (startIndex<endIndex && text[startIndex]==' '){
                startIndex++;
            }while (startIndex<endIndex && text[endIndex]==' '){
                endIndex--;
            }char[] result= new char[(endIndex-startIndex)+1];
            int index=0;
            for (int i = startIndex; i<=endIndex ; i++) {
                result[index++]=text[i];


                }
            for (int i = 0; i< result.length; i++) {
                System.out.println(result[i]);
                
            }
            
                
            }


            }




    
