package com.example.task3;

//
//Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K), конструктор,
// принимающий на вход параметры типа (T, V, K), методы
//        возвращающие значения трех переменных. Создать метод, выводящий на консоль имена
//        классов для трех переменных класса. Наложить ограничения на параметры типа:
//        T должен реализовать интерфейс Comparable (классы оболочки, String),
//        V должен реализовать интерфейс DataInput и расширять класс InputStream, K должен расширять класс Number.

import java.io.DataInput;
import java.io.InputStream;
import java.io.Serializable;

public class NewClass<T extends Comparable, V extends DataInput, K extends Number> {
    T comparableItem;
    V dataItem;
    K numberItem;

    public NewClass(T comparableItem, V dataInputItem, K inputStreamItem) {
        this.comparableItem = comparableItem;
        this.dataItem = dataInputItem;
        this.numberItem = inputStreamItem;
    }

    public void getComparableItem() {
        System.out.println(comparableItem.getClass().getName());
    }

    public void getDataInputItem() {
        System.out.println(dataItem.getClass().getName());
    }

    public void getInputStreamItem() {
        System.out.println(numberItem.getClass().getName());
    }
}
