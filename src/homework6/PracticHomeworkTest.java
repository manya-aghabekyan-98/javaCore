package homework6;

public class PracticHomeworkTest {
    public static void main(String[] args) {
        PracticHomework practicHomework=new PracticHomework();
        long convert=practicHomework.convert(2);
        System.out.println(convert);
        int calcAge=practicHomework.calcAge(4);
        System.out.println(calcAge);
        int nextNumber=practicHomework.nextNumber(41);
        System.out.println(nextNumber);
        boolean isSameNume=practicHomework.isSameNum(8,8);
        System.out.println(isSameNume);
        boolean lessThanOrEqualToZero=practicHomework.lessThanOrEqualToZero(-2);
        System.out.println(lessThanOrEqualToZero);
        int[]array1={4,7,13,43,65,64,71};
        int[]array2={5,16,21,54,87,95,98};
        System.out.println(practicHomework.maxLength(array1, array2));

        }
    }

