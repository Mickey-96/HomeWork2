public class HomeWork2 {

    public static void main(String[] args) {
        //System.out.println(addNumbers(5, 5));
        //positiveOrNegative(0);
        //System.out.println(positiveOrNegative2(-5));
        //lineNum("Bekzod", 3);
        System.out.println(leapYear(2100));
    }



    public static boolean addNumbers(int a, int b){
        int sum=a+b;
        return sum>=10 && sum<=20;


    }
    public static void positiveOrNegative (int num){
        if (num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }
    }
    public static boolean positiveOrNegative2(int num){
        if (num<0){
            return true;
        }
        return false;

    }

    public static void lineNum(String name, int times){
        for (int i = 0; i <times ; i++) {
            System.out.println(name);

        }

    }
    public static boolean leapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
return false;
    }
}
