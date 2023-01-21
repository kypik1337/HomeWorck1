import java.util.Scanner;

public class homeWorck {
    public static void main(String[] args) {
        ex4();
    }
    static void ex4(){
        //простой калькулятор + - / * 
        double res = 0;
        String umn = "*";
        String del = "/";
        String min = "-";
        String plu = "+";
        System.out.println("Введите первое число");
        int number1 =Integer.parseInt(scanner());
        System.out.println("Введите действие / * - +");
        String deistv = scanner();
        System.out.println("Введите второе число");
        int number2 =Integer.parseInt(scanner());
        System.out.println(deistv.equals(umn));
        if (true){
            res = number1 * number2;
            System.out.println(" ваш ответ равен:= " + res);
        }
        System.out.println(deistv.equals(del));
        if (true){
            res = number1 / number2;
            System.out.println(" ваш ответ равен:= " + res);
        }
        System.out.println(deistv.equals(min));
        if (true){
            res = number1 - number2;
            System.out.println(" ваш ответ равен:= " + res);
        }
        System.out.println(deistv.equals(plu));
        if (true){
            res = number1 + number2;
            System.out.println(" ваш ответ равен:= " + res);
        }
        
    }
    static String scanner(){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        return n;
    }
    static void ex3(){
        // вывести все простые числа от 1 до 1000
        for (int i = 2; i <= 100; i++) {
            Integer rez = i;
            for (int j = 2; j < i; j++) {
            if (i % j == 0) {
            rez = null;
            break;
            }
            }
            if (rez != null) {
            System.out.println(rez);
            }  
            } 
            }
        
    
    static void ex2(){
        // перемножить числа от 1 до n
        System.out.println("Введите число n:= ");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int i = Integer.parseInt(n);
        int summ = 1;
        for (int j = 1; j <= i; j++) {
            summ = summ * j;
        }
        System.out.println(summ);
    }
    static void ex1(){
        // сумма чисел от 1 до н
        System.out.println("Введите число n:= ");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int i = Integer.parseInt(n);
        int summ = 0;
        for (int j = 0; j <= i; j++) {
            summ = summ + j;
        }
        System.out.println(summ);
    }
}
