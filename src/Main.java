//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte camelCase = 21;
        short tigerCase = 23456;
        int crocodileCase = 2345674;
        long coube = 234567821;
        double digger = 3.75;
        float dark = 2.75f;

        System.out.println("Значение переменной camelCase с типом byte равно " + camelCase);
        System.out.println("Значение переменной tigerCase с типом byte равно " + tigerCase);
        System.out.println("Значение переменной crocodileCase с типом byte равно " + crocodileCase);
        System.out.println("Значение переменной coube с типом byte равно " + coube);
        System.out.println("Значение переменной digger с типом byte равно " + digger);
        System.out.println("Значение переменной dark с типом byte равно " + dark);

        // task 2


        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short f = -159;
        short g = 27897;
        byte h = 67;

        //task 3

        byte lyudmilaPavlovna = 23;
        byte annaSergeyevna = 27;
        byte ekaterinaAndreevna = 30;
        short students = (short) (lyudmilaPavlovna + annaSergeyevna + ekaterinaAndreevna);
        short sheets =(short) 480;
        short totalSheets= (short) (sheets / students);
        System.out.println("На каждого ученика рассчитано "+ totalSheets +" листов бумаги");

        //task 4

        byte bottelMashine2 = 16;
        byte bottelMashine1 = (byte) (bottelMashine2 / 2);
        short min20 =(short) (bottelMashine1 * 20);
        int day1 = bottelMashine1 * 1440;
        int day3 = bottelMashine1 * (1440*3);
        int month = bottelMashine1 * 43200;
        System.out.println("За 20 минут машина произвела "+ min20 +" штук бутылок");
        System.out.println("За день машина произвела "+ day1 +" штук бутылок");
        System.out.println("За 3 дня машина произвела "+ day3 +" штук бутылок");
        System.out.println("За Месяц машина произвела "+ month +" штук бутылок");

        //task 5

        short jar= 120;
        byte brown= 4;
        byte withe= 2;
        byte dye =(byte) (brown + withe);
        int totalPaint= jar/dye;
        int brownPaint = totalPaint * brown;
        int withePaint = totalPaint * withe;
        System.out.println("В школе, где "+ totalPaint +" классов, нужно "+ withePaint +" банок белой краски и "+ brownPaint +" банок коричневой краски");


        //task 6

        int banana = 80 * 5;
        int milk = 105 * 2;
        int iceCream =100 * 2;
        int eggs= 70 * 4;
        float breakfastGram = banana + milk + iceCream + eggs;
        float breakfastKilo = breakfastGram / 1000;

        System.out.println("Грамм: " + breakfastGram + " киллограм: " + breakfastKilo);

        //task 7

        short kg= 7 * 1000;
        int gram250= kg/250;
        int gram500 = kg/500;
        System.out.println("Если спортсмен будет сбрасывать по 250 грамм, он сбросит вес за " + gram250 + "дней");
        System.out.println("Если спортсмен будет сбрасывать по 500 грамм, он сбросит вес за " + gram500 + "дней");


        //task 8

        int masha= 67760;
        int denis= 83690;
        int kristina= 76230;
        int mashaIncrease = masha / 10 ;
        int denisIncrease = denis / 10 ;
        int kristinaIncrease= kristina / 10;
        int mashaIncome = masha + mashaIncrease;
        int denisIncome = denis + denisIncrease;
        int kristinaIncome = kristina + kristinaIncrease;
        System.out.println("Маша теперь получает " + mashaIncome + " рублей. Годовой доход вырос на " + mashaIncrease + " рублей");
        System.out.println("Денис теперь получает " + denisIncome + " рублей. Годовой доход вырос на " + denisIncrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinaIncome + " рублей. Годовой доход вырос на " +  kristinaIncrease + " рублей");




    }
}