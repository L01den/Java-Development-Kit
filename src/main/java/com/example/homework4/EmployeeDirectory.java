package com.example.homework4;

import java.util.ArrayList;
import java.util.List;

/**
 *  * Добавить метод, который ищет сотрудника по стажу (может быть список)
 *  * Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
 *  * Добавить метод, который ищет сотрудника по табельному номеру
 *  * Добавить метод добавление нового сотрудника в справочник сотрудников
 */

public class EmployeeDirectory {
    private List<Worker> workers = new ArrayList<>();

    public List<Worker> getWorkersExperience(int experience) {
        List<Worker> workersExperience = new ArrayList<>();
        for(Worker worker: workers){
            if(worker.getExperience() == experience){
                workersExperience.add(worker);
            }
        }
        return workersExperience;
    }

    public List<Worker> getWorkersNumberPhone(int name) {
        List<Worker> workersNumberPhone = new ArrayList<>();
        for(Worker worker: workers){
            if(worker.getNumberPhone() == name){
                workersNumberPhone.add(worker);
            }
        }
        return workersNumberPhone;
    }

    public List<Worker> getWorkersId(int id) {
        List<Worker> workersId = new ArrayList<>();
        for(Worker worker: workers){
            if(worker.getIdWorker() == id){
                workersId.add(worker);
            }
        }
        return workersId;
    }


    public void setWorker(Worker worker) {
        workers.add(worker);
    }
}
