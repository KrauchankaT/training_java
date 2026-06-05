public class HW6_1 {
    static void main() {
        /* Task1
        Дана строка:
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки. Для указанной строки ответ будет “ооооо” (или в столбик)*/

        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);

            if (b == 'о'){
                System.out.print(b);
            }
        }

        System.out.println();

        /* Task2. Дана строка:
        String s = “Перевыборы выбранного президента”; необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.*/

        String str = "Перевыборы выбранного президента";

        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch == 'е'){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
