import java.util.Scanner;

public class MenuArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm phần tử");
            System.out.println("2. Sửa phần tử");
            System.out.println("3. Xoá phần tử");
            System.out.println("4. Gộp mảng");
            System.out.println("5. Tìm giá trị lớn nhất trong 2 mảng");
            System.out.println("6. Tìm giá trị nhỏ nhất trong mảng");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                // Thêm phần tử
                System.out.println("Nhập X là số cần chèn: ");
                int X = sc.nextInt();
                System.out.println("Nhập vào vị trí index cần chèn X vào trong mảng: ");
                int index = sc.nextInt();
                if (index <= -1 || index >= array.length - 1) {
                    System.out.println("Không chèn được phần tử vào mảng");
                } else {
                    for (int i = array.length - 1; i > index; i--) {
                        array[i] = array[i - 1];
                    }
                    array[index] = X;
                    System.out.println("Mảng sau khi chèn phần tử " + X + " là: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                }
            } else if (choice == 2) {
                // Sửa phần tử
                System.out.println("Nhập X là số cần sửa: ");
                int X = sc.nextInt();
                System.out.println("Nhập Y là số mới: ");
                int Y = sc.nextInt();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == X) {
                        array[i] = Y;
                        break;
                    }
                }
                System.out.println("Mảng sau khi sửa phần tử " + X + " thành " + Y + " là: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            } else if (choice == 3) {
                // Xoá phần tử
                System.out.println("Nhập X là phần tử cần xoá: ");
                int X = sc.nextInt();
                int index_del = -1;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == X) {
                        index_del = i;
                        break;
                    }
                }
                if (index_del == -1) {
                    System.out.println("Không tìm thấy phần tử " + X + " trong mảng");
                } else {
                    for (int i = index_del; i < array.length - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    System.out.println("Mảng sau khi xoá phần tử " + X + " là: ");
                    for (int i = 0; i < array.length - 1; i++) {
                        System.out.print(array[i] + " ");
                    }
                }
            } else if (choice == 4) {
                // Gộp mảng
                System.out.print("Nhập số lượng phần tử của mảng cần gộp: ");
                int n2 = sc.nextInt();
                int[] array2 = new int[n2];
                for (int i = 0; i < n2; i++) {
                    System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                    array2[i] = sc.nextInt();
                }
                int[] result = new int[array.length + array2.length];
                for (int i = 0; i < array.length; i++) {
                    result[i] = array[i];
                }
                for (int i = 0; i < array2.length; i++) {
                    result[array.length + i] = array2[i];
                }
                System.out.println("Mảng sau khi gộp là: ");
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i] + " ");
                }
            } else if (choice == 5) {
                // Tìm giá trị lớn nhất trong 2 mảng
                System.out.println("Nhập số lượng số lượng của phần tử cần so sánh: ");
                int n2 = sc.nextInt();
                int[] array2 = new int[n2];
                for (int i = 0; i < n2; i++) {
                    System.out.println("Nhập số phần tử thứ " + (i + 1) + ": ");
                    array2[i] = sc.nextInt();
                }
                int max1 = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max1) {
                        max1 = array[i];
                    }
                }
                int max2 = array2[0];
                for (int i = 1; i < array2.length; i++) {
                    if (array2[i] > max2) {
                        max2 = array2[i];
                    }
                }
                int max = max1 > max2 ? max1 : max2;
                System.out.println("Giá trị lớn nhất trong 2 mảng là: " + max);
            } else if (choice == 6) {
                // Tìm giá trị nhỏ nhất trong mảng
                int min = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
            } else if (choice == 7) {
                // Thoát
                break;
            } else {
                // Lựa chọn không hợp lệ
                System.out.println("Lựa chọn không hợp lệ!");
            }

            // Thêm phần cho phép người dùng nhập "Enter" để tiếp tục
            System.out.print("Nhấn Enter để tiếp tục...");
            sc.nextLine();
            sc.nextLine();


        }
    }
}


