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

            }char[]array1={'b','a','b','o','l','a'};
            boolean isBob =false;
            for (int j = 0; j < array1.length ; j++) {
                if (array1[i]=='b'&& array1[i+2]=='b'){
                    isBob=true;
                    break;
                }System.out.println(isBob);

            }char[] text= {' ',' ','b','o','l','o','a',' ',' '};
            int startIndex =0;
            int endIndex= text.length-1;
            while (startIndex<endIndex && text[startIndex]==' '){
                startIndex++;
            }while (startIndex<endIndex && text[endIndex]==' '){
                endIndex--;
            }char[] result= new char[(endIndex-startIndex)+1];
            int index=0;
            for (int j = startIndex; j <=endIndex ; j++) {
                result[index++]=text[i];


                }System.out.println(result[i]);
            for (int j = 0; j < result.length; j++) {
                System.out.println(result[i]);
                
            }
            
                
            }


            }



        }
    
