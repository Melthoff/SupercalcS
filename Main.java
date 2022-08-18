package Supercalc;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    System.out.println("""
                Клалькулятор целых чисел
                Доступен ввод чисел от 1 до 10 и от I до X
                Математичесике операции: + - * /""");
    Scanner in = new Scanner(System.in);
    try{
        System.out.println( Calculator.calc(in.nextLine()) );
    }catch (InputException e){
        System.err.println(e.getMessage());
    }
}
}
