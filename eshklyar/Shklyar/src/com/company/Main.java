package com.company;
import java.util.Scanner; // сканер для того чтобы принять строку с калвиатуры
public class Main {


    public static void main(String[] args) {
        int open=0,close=0; // переменные для подсчета скобок
        System.out.println("Введите строку с скобками: ");
        Scanner scan = new Scanner(System.in);// Берём данные с клавиатуры и заноси их в переменную str
        String str = scan.nextLine();
        for (int i=0; i< str.length(); i++){
            if(str.charAt(i)=='('){ // str.charatAt(i) возвращает символ расположенный по индексу если он равен нашему символу то
                open = ++open; // инкримент (увеличиваем на один)
            }
            if(str.charAt(i)==')'){
                close= ++close;
            }
        }
        if(open==close){ // если равны то вывоодим что одинаково
            System.out.println("Число открывающихся и закрывающихся скобок одинаково");
        }
        else // иначе выводим что разные
        {
            System.out.println("Число открывающихся и закрывающихся скобок разное");
        }
    }
}