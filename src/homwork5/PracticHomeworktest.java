package homwork5;

public class PracticHomeworktest {
    public static void main(String[] args) {
        PracticHomework practicHomework = new PracticHomework();
        int nextNumber = practicHomework.nextNumber(10);
        System.out.println(nextNumber);

        long convert = practicHomework.convert(15);
        System.out.println(convert * 60);

        int calcAge=practicHomework.calcAge(2);
        System.out.println(calcAge);

        boolean isSumeNum=practicHomework.isSameNum(7,8);
        System.out.println(isSumeNum);

        boolean lessThanOrEqualToZero=practicHomework.lessThanOrEqualToZero(3);
        System.out.println(lessThanOrEqualToZero);

       int [] array1={3,5,8,12,26,54,67,85,99};
       int[] array2={5,8,21,42,59,63,78,85,90};
        System.out.println(practicHomework.maxLength(array1, array2));


    }
}



