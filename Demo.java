import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int a = (int)Math.round(12 * Math.random()) + 5;
        System.out.println(a);


















//        int[] arr = new int[5];
//        int size = 0;
////        size = addElement(arr, 4, size);
////        showArray(arr, size);
////        size = addElement(arr, 10, size);
////        showArray(arr, size);
////        System.out.println(search(arr, 4));
//
//        size = addElement(arr, 4, size);
//        size = addElement(arr, 10, size);
//        size = addElement(arr, -8, size);
//        System.out.println(Arrays.toString(arr));
//        size = insert(arr, 6, 1, size);
//        System.out.println(Arrays.toString(arr));
//
////        size = delete(arr, size, 10);
//
//
//    }
//
//    public static int insert(int[] arr, int element, int position , int size) {
//        for (int i = size; i >= position; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[position] = element;
//        size++;
//        return size;
//    }
//
//    public static int delete(int[] arr, int size, int element) {
//        int index = search(arr, element);
//        for (int i = index; i < size; i++) {
//            arr[i] = arr[i + 1];
//        }
//        size--;
//        return size;
//    }
//
//
//    public static int addElement(int[] arr, int element, int size) {
//        arr[size] = element;
//        size = size + 1;
//        return size;
//    }
//
//    public static int search(int[] arr, int item) {
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == item) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void showArray(int[] arr, int size) {
//        String str = "[";
//        for (int i = 0; i < size; i++) {
//            str += i + " ";
//        }
//        str += "]";
//        System.out.println(str);
    }
}

//        int[] arr = {1, 3, 4, 5};
//        while (size < arr.length) {
//            System.out.println("Nhập phần tử thứ " + size);
//            int element = input.nextInt();
//            arr[size] = element;
//            size++;
//        }
//        System.out.println(Arrays.toString(arr));

