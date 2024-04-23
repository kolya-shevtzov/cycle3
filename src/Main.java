public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total=0;
        int month=0;
        int ruble=2_459_000;
        while (total<ruble)
        {
            month=month+1;
        total=total+salary;
            System.out.println("Месяц "+month+" сумма накоплений равна "+total+" рублей" );
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
        int born=17;
        int dead=8;
        for( int year=1;year<=10;year++)
        {
            y=y+(y*(born -dead));
            System.out.println("год "+year+" численность населения состовляет "+y);
        }
        double total1=0;
        double salary1=15000;
        int be=12_000_000;
        int mounth=0;
        double procent=1.07;
        for ( mounth=0; total1 < be; mounth++)
        {
            total1 = total1 * procent;
            total1 = total1 + salary1;
            System.out.println(mounth + " " + total1);
        }
        for ( mounth=0; total1 < be; mounth++)
        {
            total1 = total1 * procent;
            total1 = total1 + salary;
            if(mounth%6==0)
                System.out.println(mounth+" "+total);
        }

        int yearMounth=12*9;

        for (mounth=0;mounth<yearMounth;mounth++)
        {
                total1 = total1 * procent;
                total1 = total1 + salary1;
                if (mounth % 6 == 0) {
                    System.out.println(mounth + " " + total1);}
            }

        int friday=3;

        for(;friday<=31;friday+=7)
        {
            System.out.println("Сегодня пятница,"+friday+"-е число. Необходимо подготовить отчет");}


        int currentYear = 2000;
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