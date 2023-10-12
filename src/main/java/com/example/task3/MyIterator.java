package com.example.task3;
//
//– Написать итератор по массиву. Итератор – это объект, осуществляющий движение по коллекциям любого типа, содержащим любые типы данных. Итераторы обычно имеют только
//        два метода – проверка на наличие следующего элемента и переход к следующему элементу. Но также, особенно в других языках программирования, возможно встретить итераторы, реализующие дополнительную логику.

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private final NewCollection<T> collection;
    private int index = 0;

    public MyIterator(NewCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getSize();
    }

    @Override
    public T next() {
        return collection.byIndex(index++);
    }
}
