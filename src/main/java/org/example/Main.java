package org.example;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
       System.out.println("1. Пользователь вводит 10 чисел, сохраните их в массив.");
        int[] number = new int[11];
        for (int i = 0; i < number.length; i++) {
            Scanner sc = new Scanner(System.in);
            // number[i] = sc.nextInt();
            Random random = new Random();
            number[i] = random.nextInt(15, 32);
        }
        for (int i = 1; i < number.length; i++) {
            System.out.println("[" + i + ":" + number[i] + "] ");
        }

        System.out.println("\n2. Сохраните 10 чисел в массив, выведите их с конца.");

        int[] reversArray = new int[11];
        for (int i = 0; i < reversArray.length; i++) {
            Random r = new Random();
            reversArray[i] = r.nextInt(23, 78);
        }
        System.out.println("В обычном порядке");
        for (int y = 1; y < reversArray.length; y++) {
            System.out.print("[" + y + ":" + reversArray[y] + "] ");
        }
        System.out.println("\n В обратном порядке");
        for (int y = reversArray.length - 1; y > 0; y--) {
            System.out.print("[" + y + ":" + reversArray[y] + "] ");
        }

        System.out.println("\n 3. Сохраните 10 строк в массив, выведите с конца каждую вторую.");
        int[] reversArray2 = new int[11];
        for (int i = 0; i < reversArray2.length; i++) {
            Random r = new Random();
            reversArray2[i] = r.nextInt(23, 78);
        }
        System.out.println("В обычном порядке");
        for (int y = 1; y < reversArray2.length; y++) {
            System.out.print("[" + y + ":" + reversArray2[y] + "] ");
        }
        System.out.println("\n В обратном порядке, с конца каждую вторую");
        for (int y = reversArray2.length - 1; y > 0; y -= 2) {
            System.out.print("[" + y + ":" + reversArray2[y] + "] ");
        }

        System.out.println("\n \n 4. В файле 10 дробных чисел. Считайте в массив, выведите те, что больше\n" +
                "        числа пи.");

        double[] reversArray1 = new double[11];
        for (int i = 0; i < reversArray1.length; i++) {
            Random r = new Random();
            reversArray1[i] = r.nextDouble(-2.7, 7.8);
        }
        System.out.println("В обычном порядке");
        for (int y = 1; y < reversArray1.length; y++) {
            System.out.println("[" + y + ":" + reversArray1[y] + "] ");
        }
        System.out.println("Больше Пи");
        for (int y = 1; y < reversArray1.length; y++) {
            if (reversArray1[y] > Math.PI) {
                System.out.println("[" + y + ":" + reversArray1[y] + "] ");
            }
        }


        System.out.println("\n 5. Пользователь вводит буквы. Пока не введёт букву ‘u’, сохраняйте буквы в\n" +
                "        массив char(пусть в нем будет 100 элементов максимум). Потом создайте\n" +
                "        новый массив char размером столько, сколько букв ввел пользователь.\n" +
                "        Скопируйте в него буквы из первого массива.");
        //Наполнение массива
        Scanner sc = new Scanner(System.in);
        char[] inWaitingU = new char[100];
        for (int i = 0; i < inWaitingU.length; i++) {
            inWaitingU[i] = sc.next().charAt(0);
            if (inWaitingU[i] == 'u') {
                break;
            }
        }
        //Подсчет количества элементов в массиве
        int count = 0;
        for (int i = 0; i < inWaitingU.length; i++) {
            if (inWaitingU[i] != 0) {
                count++;
            }
        }
        // создаем новый массив нужного размера
        char[] newInWaitingU = new char[count];
        int i;
        for (i = 0; i < newInWaitingU.length; i++) {
            newInWaitingU[i] = inWaitingU[i];
        }
        System.out.println(newInWaitingU);


        System.out.println("6. Есть 2 файла по 5 строк в каждом. Сохраните их в 2 массива. Создайте\n" +
                "        третий массив из 10 строк, скопируйте в него строки из первых двух\n" +
                "        массивов.");

        // Получаем первый стих и помещаем в первый массив
        BufferedReader abc_uno = new BufferedReader(new FileReader("E:\\Sinergy\\DZ_2_5Arrays\\src\\main\\java\\org\\example\\uno.txt"));
        String[] data_uno;
        data_uno = new String[4];
        for (int y = 0; y < data_uno.length; y++) {
            data_uno[y] = abc_uno.readLine();
            System.out.println(data_uno[y]);
        }
        abc_uno.close();
        System.out.println("\n И вторая часть стиха \n");

        // Получаем второй стих и помещаем во второй массив
        BufferedReader abc_dos = new BufferedReader(new FileReader("E:\\Sinergy\\DZ_2_5Arrays\\src\\main\\java\\org\\example\\dos.txt"));
        String[] data_dos;
        data_dos = new String[4];
        for (int y = 0; y < data_dos.length; y++) {
            data_dos[y] = abc_dos.readLine();
            System.out.println(data_dos[y]);
        }
        System.out.println("\n");
        abc_dos.close();

        // Создаем общий и помещаем в него первый массив
        int count1 = 0;
        String[] allData = new String[data_uno.length + data_dos.length];
        for (int y = 0; y < data_uno.length; y++) {
            allData[y] = data_uno[y];
            count1++;
        }

        // В общий массив помещаем второй массив
        for (int y = 0; y < data_dos.length; y++) {
            allData[count1++] = data_dos[y];
        }
        // Проверяем!
        for (int y = 0; y < allData.length; y++) {
            System.out.println("Элемент массива  " + y + " : " + allData[y]);
        }


        System.out.println(" \n 7. Поле чудес. Игрок один пишет слово. Выводится: ##### (по количеству\n" +
                "        букв) Игрок два пытается угадать буквы. Если угадал, буква открывается:\n" +
                "        #а#а#, ба#а#, … банан.");

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Игрок UNO Введите слово из 5 букв: ");
        String strUno = input.nextLine();
        String secretWord[] = new String[5];
        String answerWord[] = new String[5];
        // Заполняем массив ##
        for (int i5 = 0; i5 < answerWord.length; i5++) {
            answerWord[i5] = "#";
        }
        // записываем слово в массив
        for (int i5 = 0; i5 < 5; i5++) {
            secretWord[i5] = String.valueOf(strUno.charAt(i5)); // Заполняем массив элементами, введёнными с клавиатуры
        }
        // Выводим для демонстрации
        System.out.print("Вы ввели :");
        for (int i5 = 0; i5 < secretWord.length; i5++) {
            if (answerWord[i5] != null) {
                System.out.print(" " + answerWord[i5]);
            }
        }
        System.out.println("\n Угадайте слово по одной букве \n");
        // Угадываем слово
        String letter;
        do {
            letter = input.nextLine();
            for (int i6 = 0; i6 < answerWord.length; i6++) {
                if (secretWord[i6].contains(letter)) {
                    answerWord[i6] = letter;
                }
                System.out.print(" " + answerWord[i6]);
            }
        } while (!Arrays.equals(secretWord, answerWord));
        System.out.println(" \n Вы угадали слово");




        System.out.println("8. Поле чудес с соревнованием. Генерируете 1000 случайных слов на сайте\u0002генераторе " +
                "(пример: https://sanstv.ru/randomWord, но в поисковике есть \n" +
                "        много подобных). " +
                "        Сохраняете их в файл. Из файла считываете случайное, и\n" +
                "        выводите ####… игроки по очереди отгадывают букву. Гласная - 1 балл,\n" +
                "        согласная - 2 балла, если буква встречается несколько раз - больше. Можно\n" +
                "        угадать слово целиком - за каждую угаданную букву тогда начислять\n" +
                "        баллы(гласные 1, согласные 2). Если не угадал- минус 3 балла.\n");

        // Считываем файл и выводим весь список слов
        BufferedReader br = new BufferedReader(
                new FileReader("E:\\Sinergy\\DZ_2_5Arrays\\src\\main\\java\\org\\example\\words.txt"));
        int size = 192;
        String[] strUno1 = new String[size];
        for (int i7 = 0; i7 < strUno1.length; i7++) {
            strUno1[i7] = br.readLine();
            System.out.print(strUno1[i7] + ", ");
        }
        System.out.println("\n");

        //получаем случайную строку
        Random rand = new Random();
        int iRand = rand.nextInt(strUno1.length);
        String randomWord = strUno1[iRand];


        // Заполняем массив случайным словом
        String[] questionWord = new String[randomWord.length()];
        for (int i7 = 0; i7 < randomWord.length(); i7++) {
            questionWord[i7] = String.valueOf(randomWord.charAt(i7));
            System.out.print(questionWord[i7]);
        }
        // Заполняем массив ##### по размеру случайного слова
        String[] answerWord1 = new String[randomWord.length()];
        for (int i7 = 0; i7 < randomWord.length(); i7++) {
            answerWord1[i7] = "#";
            System.out.print(answerWord1[i7]);
        }
        System.out.println("\n Угадайте слово по одной букве \n");
        // Угадываем слово
        Scanner scan = new Scanner(System.in);
        String letter2;
        int i8;
        do {
            letter2 = scan.nextLine();
            for (i8 = 0; i8 < answerWord1.length; i8++) {
                if (questionWord[i8].contains(letter2)) {
                    answerWord1[i8] = letter2;
                }
                System.out.print(" " + answerWord1[i8]);
            }
            System.out.println("");
           // сравниваем массивы и выходим из игры
        } while (!Arrays.equals(questionWord, answerWord1));
        System.out.println("Вы угадали слово и выиграли Автомобиль!!! (Жигули)");
    }
}

