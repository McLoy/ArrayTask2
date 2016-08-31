import java.util.*;

public class ArrayTask2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Укажите размерность массива: ");
        int size = in.nextInt();

        int[] arr = new int[size];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*size);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        //Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("");
        System.out.println("Необходимо указать диапазон цифр для которых нужно найти индексы от 0 до " + size);
        System.out.print("Начальная цифра: ");
        int first = in.nextInt();

        System.out.print("Последняя цифра: ");
        int last = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = first; j <= last ; j++) {
                if (arr[i] == j){
                    System.out.println("У числа " + arr[i] + " в массиве '" + (i+1) + "' индекс");
                }
            }
        }

    }
}
