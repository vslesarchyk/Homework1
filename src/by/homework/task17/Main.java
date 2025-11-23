package by.homework.task17;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        writeRelative();
        writeAbsolute();
        readAbsolute();
        readRelative();
        serializeCar();
        deserializeCar();
    }

//1.1 Записать его в файл,  прописав относительный путь. Реализуйте соответствующий метод в классе Main.

    public static void writeRelative() {
        File file = new File("Test1.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
    public static void writeAbsolute() throws IOException {
        FileWriter fileWriter = null;
        String str = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him. ";
        try {
            fileWriter = new FileWriter("C:\\Users\\VeroNiKA\\Desktop\\Test.txt");
            for (int i = 0; i < str.length(); i++) {
                fileWriter.write(str.charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.close();
        }
        System.out.println("Текст записан");

    }

//1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main

    public static void readRelative() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Test1.txt");
            int temp;
            while ((temp = fileReader.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileReader.close();
        }

    }

//1.4 Вычитать текст из второго файла Реализуйте соответствующий метод в классе Main

    public static void readAbsolute() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\VeroNiKA\\Desktop\\Test.txt");
            int temp;
            while ((temp = fileReader.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileReader.close();
        }

    }

//2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства). Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи). В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main

    public static void serializeCar() {
        Car car = new Car("BMW", 220, "Germany");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("car.bin"))) {
            objectOutputStream.writeObject(car);
            System.out.println("Автомобиль сериализован");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main
    public static void deserializeCar() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("car.bin"))) {

            Car car = (Car) objectInputStream.readObject();
            System.out.println("Десериализованный автомобиль");
            System.out.println(car);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

