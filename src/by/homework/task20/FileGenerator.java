package by.homework.task20;


import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;


//1. Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками -> засыпает произвольно на 1-3 секунды, результат выполнения –коллекция имен файлов. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.

public class FileGenerator  implements Callable<List<String>> {

    private int taskId;
        private final Random random = new Random(); //генератор случайных чисел

    public FileGenerator(int taskId) {
        this.taskId = taskId;
    }

    @Override
        public List<String> call() throws Exception {
            String thread = Thread.currentThread().getName();
            System.out.println("Task " + taskId + " started on " + thread); //какая задача запустилась  и в каком потоке

            List<String> files = new ArrayList<>(); //список, который будет хранить имена созданных файлов

        //создание 10 файлов
            for (int i = 0; i < 10; i++) {
                String fileName = "file_task" + taskId + "_" + i + ".txt";
                files.add(fileName);

                FileWriter fw = new FileWriter(fileName); //запись 10 строк
                for (int j = 0; j < 10; j++) {
                    fw.write("line " + j + "\n");
                }
                fw.close();

                System.out.println("Task " + taskId + " created " + fileName + thread);
            }

            int sleep = random.nextInt(3) + 1; //засыпает произвольно на 1-3 секунды
            System.out.println("Task " + taskId + "sleeping" + sleep + " sec (thread)");
            Thread.sleep(sleep * 1000); //текущий поток спит

            System.out.println("Task " + taskId + " finished on " + thread); //задача закончила работу
            return files;
        }
    }