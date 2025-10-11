package by.homework.tasks.task8;

public class StringProcessor {
//  1.1.Напишите метод, который будет возвращать String и принимать в качестве 1-ого параметра и 2-ого параметра объекты типа String.

        public static String processStrings(String str1, String str2) {
            if (str1.endsWith(str2)) {
                // Найден индекс начала подстроки str2 в str1 с конца
                int index = str1.lastIndexOf(str2);
                // Вырезается часть до str2 (не включая str2)
                return str1.substring(0, index).trim();  // trim — убираем пробелы справа, если есть
            } else {
                          return str1.toUpperCase();
            }
        }

//1.2 В этом методе необходимо выполнить следующую логику. Если строка в 1-ом параметре заканчивается строкой
    // из второго параметра, то необходимо вырезать из строки 1-ого параметра значение строки не включающей
    // строку из второго параметра.
    // Иначе вернуть строку из 1-ого параметра приведённую к верхнему регистру.
    //Пример. Есть 1-ая строка «Я люблю java» и 2-ая строка «java». Так как первая строка
    // оканчивается такой же строкой что и 2-ая строка (java), то метод должен вернуть «Я люблю» иначе
    // метод должен вернуть «Я ЛЮБЛЮ».В этом методе нужно использовать методы для работы со строками:
    // endWith(), indexOf(), substring(), toUpperCase();


//1.3 В методе main вызовите этот метод, передайте любые строки, в качестве аргументов и выведите результат в консоль.
        public static void main(String[] args) {
            String s1 = "Я люблю java";
            String s2 = "java";

            System.out.println(processStrings(s1, s2));

            String s3 = "Я люблю осень";
            System.out.println(processStrings(s3, s2));
        }
    }


