package com.example.homework4;

/**
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж

 */

public class Worker {
    private int idWorker;
    private int numberPhone;
    private int experience;
    private String name;

    public Worker(int idWorker, int numberPhone, String name) {
        this.idWorker = idWorker;
        this.numberPhone = numberPhone;
        this.name = name;
    }

    public int getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
