//ТИПЫ ДАННЫХ

public class Main {
    public static void main(String[] args) {
        //Задача 1
        //*Объявите переменные типа int, byte, short, long, float, double.
        //
        //Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
        //
        //Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».*/
        byte b = -127;
        short s = 31394;
        long l = 3468784645545464121L;
        int i = 465431354;
        float f = 45.4658389f;
        double d = 8.155413543516d;

        char B = 'b';
        char S = 's';
        char L = 'l';
        char I = 'i';
        char F = 'f';
        char D = 'd';

        System.out.println("Значение переменной " + B + " с типом byte = " + b);
        System.out.println("Значение переменной " + S + " с типом short = " + s);
        System.out.println("Значение переменной " + L + " с типом long = " + l);
        System.out.println("Значение переменной " + I + " с типом int = " + i);
        System.out.println("Значение переменной " + F + " с типом float = " + f);
        System.out.println("Значение переменной " + D + " с типом double = " + d + "\n");

        //Задача 2
        //*Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        //
        //Значения:
        //
        //27.12
        //987 678 965 549
        //2,786
        //569
        //-159
        //27897
        //67*/
        long l2 = 987678965549L;
        byte b2 = 67;
        int i2 = 569;
        float f2 = 27.12f;
        double d2 = 2.786d;
        short s2 = 27897;
        short s2_1 = -159;

        //Задача 3
        //*Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //
        //У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        //
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        //
        //Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        //
        //Для объявления переменных не используйте тип var.*/
        byte LyudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short paper = 480;
        int sumStudents = LyudmilaPavlovna + EkaterinaAndreevna + AnnaSergeevna;

        int quantity = paper / sumStudents;
        System.out.println("На каждого ученика расчитано " + quantity + " листов бумаги\n");

        //Задача 4
        //*Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        //
        //за 20 минут,
        //в сутки,
        //за 3 дня,
        //за 1 месяц?
        //Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        //
        //Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        //
        //Для объявления переменных не используйте тип var.
        //
        // */
        byte speedTime = 16;
        short timeMin = 20;
        short timeDay = 24 * 60;
        short timeDay3 = 24 * 60 * 3;
        int timeMonth = 24 * 60 * 30;
        int speedMin = speedTime / 2;
        int speedEnd = speedMin * timeMin;
        System.out.println("За " + timeMin + " минут машина произвела " + speedEnd + " штук бутылок");
        speedEnd = speedMin * timeDay;
        System.out.println("За " + timeDay + " минут машина произвела " + speedEnd + " штук бутылок");
        speedEnd = speedMin * timeDay3;
        System.out.println("За " + timeDay3 + " минут машина произвела " + speedEnd + " штук бутылок");
        speedEnd = speedMin * timeMonth;
        System.out.println("За " + timeMonth + " минут машина произвела " + speedEnd + " штук бутылок\n");

        //Задача 5
        //*Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        //
        //Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        //
        // Бананы — 5 штук (1 банан — 80 грамм). 400
        // Молоко — 200 мл (100 мл = 105 грамм). 210
        // Мороженое-пломбир — 2 брикета по 100 грамм. 200
        // Яйца сырые – 4 яйца (1 яйцо — 70 грамм). 280
        //Смешать всё в блендере — и готово. 1090
        //
        //Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        //
        //Результат в граммах и килограммах напечатайте в консоль.*/
        byte bananas = 5;
        byte grammBananas = 80;
        short milk = 2;
        short grammMilk = 105;
        byte iceCream = 2;
        short grammIceCream = 100;
        byte eggs = 4;
        byte grammEggs = 70;

        int grammBreakfast = (bananas * grammBananas) + (iceCream * grammIceCream) + (milk * grammMilk) + (eggs * grammEggs);
        System.out.println("Вес завтрака составил " + grammBreakfast + " грамм");
        float kiloBreakfast = grammBreakfast * 0.001f;
        System.out.println("Вес завтрака составил " + kiloBreakfast + " кг\n");

        //Задача 6
        //*На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски.
        // Сколько банок каждой краски было куплено?
        //
        //Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        //
        //Для объявления переменных не используйте тип var.*/
        byte sumPail = 120;
        byte pailWhite = 2;
        byte pailBrown = 4;
        int sumPaiL = sumPail / (pailBrown + pailWhite);
        int sumPailWhite = sumPaiL * pailWhite;
        int sumPailBrown = sumPaiL * pailBrown;
        System.out.println("В школе, где " + sumPaiL + " классов, нужно " + sumPailWhite + " банок белой краски и " + sumPailBrown + " банок коричневой краски\n");

        //Задача 7
        //*Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
        // Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //
        //Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        // а сколько — если каждый день будет худеть на 500 грамм.
        //
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //
        //Результаты всех подсчетов выведите в консоль.*/

        short minWeight = 250;
        short maxWeight = 500;
        short sumGramm = 7 * 1000;

        int summMin = (short) sumGramm / minWeight;
        System.out.println("Eсли спортсмен будет терять по " + minWeight + " грамм в день, " + "то ему потребуется " + summMin + " дней на похудение");
        int summMax = (short) sumGramm / maxWeight;
        System.out.println("Eсли спортсмен будет терять по " + maxWeight + " грамм в день, " + "то ему потребуется " + summMax + " дней на похудение");

        int sumMid = (summMin + summMax) / 2;
        System.out.println("В среднем спортсмену потребуется " + sumMid + " дней на похудение\n");

        //Задача 8
        //*Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        // В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        // Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        // Каждый год повышение составляет 10% от текущей зарплаты.
        //
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать
        // разницу между годовым доходом с нынешней зарплатой и после повышения.
        //
        //Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //
        //Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».*/

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int sumMasha = (int) (masha * 0.1f) + masha;
        int sumDenis = (int) (denis * 0.1f) + denis;
        int sumKristina = (int) (kristina * 0.1f) + kristina;


        int lastMasha = (int) ((int) masha - (masha * 0.1f));
        int lastDenis = (int) ((int) denis - (denis * 0.1f));
        int lastKristina = (int) ((int) kristina - (kristina * 0.1f));


        int thisYearMasha = sumMasha * 12;
        int thisYearDenis = sumDenis * 12;
        int thisYearKristina = sumKristina * 12;
        int lastYearMasha = lastMasha * 12;
        int lastYearDenis = lastDenis * 12;
        int lastYearKristina = lastKristina * 12;

        System.out.println("В прошлом году Маша получала " + lastMasha + " рублей. Теперь Маша получает " + sumMasha + " рублей");
        System.out.println("Годовой доход Маши вырос на " + (thisYearMasha - lastYearMasha) + " рублей");
        System.out.println("В прошлом году Денис получал " + lastDenis + " рублей. Теперь Денис получает " + sumDenis + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + (thisYearDenis - lastYearDenis) + " рублей");
        System.out.println("В прошлом году Кристина получала " + lastKristina + " рублей. Теперь Кристина получает " + sumKristina + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + (thisYearKristina - lastYearKristina) + " рублей");
    }
}
