public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();
    }
    public static void task1(){
        System.out.println("Задание 1");
        byte a = Byte.MIN_VALUE;
        short b = Short.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        long d = Long.MIN_VALUE;
        float e = Float.MIN_VALUE;
        double f = Double.MIN_VALUE;

        System.out.printf("The value of the variable '%s' with the type %s is equal to %d%n", "a", "byte", a);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %d%n", "b", "short", b);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %d%n", "c", "int", c);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %d%n", "d", "long", d);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %e%n", "e", "float", e);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %e%n%n", "f", "double", f);
    }

    public static void task2() {
        System.out.println("Задание 2");
        float e = 27.12f;
        long d = 987_678_965_549L;
        double f = 2.786;
        int c = 569;
        short b = -159;
        short b_ = 27897;
        byte a = 67;

        System.out.printf("The value of the variable '%s' with the type %s is equal to %f%n", "e", "float", e);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %d%n", "d", "long", d);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %f%n", "f", "double", f);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %d%n", "c", "int", c);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %d%n", "b", "short", b);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %d%n", "b_", "short", b_);
        System.out.printf("The value of the variable '%s' with the type %s is equal to %d%n%n", "a", "byte", a);
    }

    public static void task3() {
        System.out.println("Задание 3");
        int puplePavlovna = 23;
        int pupleSergeevna = 27;
        int pupleAndreevna = 30;
        int totalSheet = 480;

        int calculation = totalSheet /(puplePavlovna + pupleAndreevna + pupleSergeevna);

        System.out.printf("Each student will get %d sheets%n%n", calculation);
    }

    public static void task4() {
        System.out.println("Задание 4");
        int bottleMaking = 16/2;
        int twentyMinutes = 20;
        int day = 24*60;
        int month = 30*day;

        int calculation1 = bottleMaking * twentyMinutes;
        int calculation2 = bottleMaking * day;
        int calculation3 = bottleMaking * month;

        System.out.printf("For 20 min the machine produced %d pieces of bottles%n", calculation1);
        System.out.printf("For day the machine produced %d pieces of bottles%n", calculation2);
        System.out.printf("For month the machine produced %d pieces of bottles%n%n", calculation3);
    }
    public static void task5() {
        System.out.println("Задание 5");
        int totalPaintCans = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int oneClass = whitePaint * brownPaint;

        int classes = totalPaintCans/oneClass;
        int needWhite = classes * whitePaint;
        int needBrown = classes * brownPaint;

        System.out.printf("In a school where %d classes need %d cans of white paint and %d cans of brown paint.%n%n", classes, needWhite, needBrown);
    }
    public static void task6() {
        System.out.println("Задание 6");
        int bananas = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int eggs = 4*70;

        int totalWeightG = (bananas + milk + iceCream + eggs);
        float totalWeightKg = (float) totalWeightG/1000;

        System.out.printf("Athlete's breakfast is %d grams or %.2f kilograms.%n%n", totalWeightG, totalWeightKg);
    }
    public static void task7() {
        System.out.println("Задание 7");
        int totalLossWeightInGrams = 7000;
        int lossWeight250gByDay = 250;
        int lossWeight500gByDay = 500;

        int totalDaysIf250gByDay = totalLossWeightInGrams/lossWeight250gByDay;
        int totalDaysIf500gByDay = totalLossWeightInGrams/lossWeight500gByDay;

        System.out.printf("An athlete will need %d days to lose weight with a loss of 250 grams per day or %d days with a loss of 500 grams per day.%n%n", totalDaysIf250gByDay, totalDaysIf500gByDay);
    }

    public static void task8() {
        System.out.println("Задание 8");
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int christineSalary = 76_230;
        int annualIncreaseInPercent = 10;
        int year = 12;

        int mashaSalaryAfterIncrease = (mashaSalary*annualIncreaseInPercent/100) + mashaSalary;
        int denisSalaryAfterIncrease = (denisSalary*annualIncreaseInPercent/100) + denisSalary;
        int christineSalaryAfterIncrease = (christineSalary*annualIncreaseInPercent/100) + christineSalary;

        int mashaSalaryDifference = (mashaSalaryAfterIncrease*year) - (mashaSalary*year);
        int denisSalaryDifference = (denisSalaryAfterIncrease*year) - (denisSalary*year);
        int christineSalaryDifference = (christineSalaryAfterIncrease*year) - (christineSalary*year);


        System.out.printf("Masha now gets %d rubles'. Annual revenue increased by %d rubles.%n", mashaSalaryAfterIncrease, mashaSalaryDifference);
        System.out.printf("Denis now gets %d rubles'. Annual revenue increased by %d rubles.%n", denisSalaryAfterIncrease, denisSalaryDifference);
        System.out.printf("Christine now gets %d rubles'. Annual revenue increased by %d rubles.%n%n", christineSalaryAfterIncrease, christineSalaryDifference);
    }
}