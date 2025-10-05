package by.homework.tasks.task6;

public class Task6 {
    public static void main(String[] args) {
//1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
// Замените каждый элемент с нечётным индексом на ноль.
// Выведите полученный массив в консоль через цикл for each
//int[] array = new int[10];
//for (int a = 0; a < array.length; a++) {
//    array [a] = a + 1;
//}
//System.out.println("Исходный массив: ");
//for (int b : array) {
//    System.out.print(b + " ");
//}
//   System.out.println();
//for (int a = 1; a < array.length; a += 2) {
//    array[a]=0;
//}
//    System.out.println("Измененный массив:");
//for (int b : array) {
//    System.out.print(b + " ");
//}
//    }
//}

//2. Создать массив из 5 чисел и заполните этот массив вручную.
// Создайте второй массив с размерностью больше на 1 чем первый массив.
// Необходимо скопировать первый массив со всеми значениями во второй массив.
// Последний элемент во втором массиве пусть будет 0.
// Выведите второй массив в консоль с помощью цикла for each.
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = new int[array1.length + 1];
//        for (int i = 0; i < array1.length; i++) {
//            array2[i] = array1[i];
//            array2[array2.length - 1] = 0;
//            System.out.println("Второй массив:");
//            for (int x : array2)
//                System.out.print(x + " ");
//        }
//    }
//}
//3. Создать массив вручную. Заменить максимальный и минимальный элемент массива.
// Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
//        int[] array = {2, 15, -7, 3, 32};
//        int a1 = 0;
//        int b1 = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > array[a1]) {
//                a1 = i;
//            }
//            if (array[i] < array[b1]) {
//               b1 = i;
//            }
//        }
//        array[a1] = 1000;
//        array[b1] = -1000;
//        for (int number : array) {
//            System.out.print(number + " ");
//        }
//    }
//}
//4.Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив.
// Выполнить с помощью цикла for
        int[] array = {5, 2, 3, 6, 3, 0};
        for (int x1 = 0; x1 < array.length - 1; x1++) {
            for (int y1 = 0; y1 < array.length - 1 - x1; y1++) {
                if (array[y1] > array[y1 + 1]) {
                    int c = array[y1];
                    array[y1] = array[y1 + 1];
                    array[y1 + 1] = c;
                }
            }
        }
        for (int x1 = 0; x1 < array.length; x1++) {
            System.out.print(array[x1] + " ");
        }
    }
}