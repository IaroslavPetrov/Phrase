package com.company;

public class Main {

    public static void main(String[] args) {
	String [] worldListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взамный", "обоюдный выигрыш", "фронтенд", "на основе веб технологий", "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};
    String [] worldListTwo = {"уполномоченный", "трудный", "чистый продук", "орентированный", "центральный", "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционнированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совмесный", "ускоренный"};
    String [] worldListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структур", "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};
    int oneLength = worldListOne.length;
    int twoLength = worldListTwo.length;
    int threeLength = worldListThree.length;
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);
    String phrase = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];
    System.out.println("Все, что нам нужно, это - " + phrase);

    }
}
