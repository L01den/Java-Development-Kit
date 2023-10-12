package com.example.task3;

//Описать собственную коллекцию – список на основе массива.
//        Коллекция должна иметь
//        возможность хранить любые типы данных,
//        иметь методы добавления и удаления элементов.
public class NewCollection<T> {
    private T[] array;
    private  int index = 0;
    private int size;

    public NewCollection(T[] array) {
        this.array = array;
        this.size = array.length;
    }

    public void add(T item){
        if(index < size){
            array[index] = item;
            index++;
        } else throw new RuntimeException("Complete arrays");
    }

    public void delete(int index){
        array[index] = null;
    }

    public void print(){
        for(T t: array){
            System.out.printf(t + " ");
        }
    }

    public int getSize() {
        return size;
    }

    public T byIndex(int index){
        return array[index];
    }
}
