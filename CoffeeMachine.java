/* 
Был создан класс CoffeeMachine, который инкапсулирует данные о состоянии кофемашины (включена/выключена) и количестве кофейных зерен. 
Были созданы методы для включения и выключения кофемашины, добавления кофейных зерен и приготовления кофе. 
Так же был добавлен метод getCoffeeBeans, чтобы можно было получить количество кофейных зерен.
В данном примере с кофемашиной, инкапсуляция помогает сделать код более безопасным, поддерживаемым и гибким для изменений в будущем.
*/

package org.example;
public class CoffeeMachine {
    private boolean powerOn;
    private int coffeeBeans;

    public CoffeeMachine() {
        powerOn = false; // Начальное состояние: кофемашина выключена
        coffeeBeans = 0; // В начале нет кофейных зерен
    }

    // Метод для включения кофемашины
    public void turnOn() {
        powerOn = true;
        System.out.println("Кофемашина включена.");
    }

    // Метод для выключения кофемашины
    public void turnOff() {
        powerOn = false;
        System.out.println("Кофемашина выключена.");
    }

    // Метод для добавления кофейных зерен
    public void addCoffeeBeans(int beansToAdd) {
        if (beansToAdd > 0) {
            coffeeBeans += beansToAdd;
            System.out.println("Добавлено " + beansToAdd + " кофейных зерен.");
        } else {
            System.out.println("Пожалуйста, введите корректное количество кофейных зерен.");
        }
    }

    // Метод для приготовления кофе
    public void makeCoffee() {
        if (powerOn && coffeeBeans >= 10) {
            coffeeBeans -= 10;
            System.out.println("Кофе готов!");
        } else if (!powerOn) {
            System.out.println("Сначала включите кофемашину.");
        } else {
            System.out.println("Недостаточно кофейных зерен для приготовления кофе.");
        }
    }

    // Метод для получения количества кофейных зерен
    public int getCoffeeBeans() {
        return coffeeBeans;
    }
}
