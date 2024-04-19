public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total=0;
        int i=0;
        while (total<2_459_000)
        {
        i=i+1;
        total=total+salary;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей" );
        }
        int g=0;

        while(g<10)
        {
            g=g+1;
            System.out.print( " "+g+" " );
        }
        for (int t=10;t>0;t--){
            System.out.print(" "+t+" ");
        }
        int y =12_000_000;
        int people =12_000_000/1000;
        int born=17;
        int dead=8;

        for(int t=1;t<=10;t++)
        {
            y=y+(people*(born -dead));
            System.out.println("год "+t+" численность населения состовляет "+y);
        }
        double total1 = 0;
        double salary1 = 15000;
        int d = 0;

        for (; total1 < 12_000_000; d++) {
            salary1 = salary1 * 1.07;
            total1 = total1 * 1.07;
            total1 = total1 + salary1;
            System.out.println(d + " " + total1);
        }

        double total2=0;
        double salary2=15000;
        int d2=0;
        for(;total2<12_000_000;d2++)
        {
            salary2 = salary2 * 1.07;
            total2 = total2 * 1.07;
            total2 = total2 + salary2;
            if(d2%6==0)
                System.out.println(d2+" "+total2);
        }

        double total3=0;
        double salary3=15000;
        int mounth=0;
        int YearMounth=12*9;

        for (;mounth<YearMounth;mounth++)
        {
            for (; total3 < 12_000_000; mounth++) {
                salary3 = salary3 * 1.07;
                total3 = total3 * 1.07;
                total3 = total3 + salary3;
                if (mounth % 6 == 0) {
                    System.out.println(mounth + " " + total3);}
            }
        }
        int friday=3;

        for(;friday<=31;friday+=7)
        {
            System.out.println("Сегодня пятница,"+friday+"-е число. Необходимо подготовить отчет");}
        int currentYear = 2024;
        int previousCycleYear = currentYear - (currentYear % 79);
        int year1 = previousCycleYear - 79;
        int year2 = currentYear + 100;

        while (year1 % 79 != 0) {
            year1++;
        }

        for (int comet = year1; comet < year2; comet += 79) {
            System.out.println(comet);
        }



    }
}