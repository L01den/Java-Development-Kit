package com.example.task3;

public class WorkPlace <T extends Person>{
    private T[] community;

    public WorkPlace(T[] community) {
        this.community = community;
    }

    public void work(){
        for(T item: community){
            item.doWork();
        }
    }
}
