package com.codigo.api_rest_g7.ejercicio6.model;

public class TaskModel {
    private String nameTask;
    private int numTask;
    private boolean active;

    public TaskModel(String nameTask, int numTask, boolean active) {
        this.nameTask = nameTask;
        this.numTask = numTask;
        this.active = active;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public int getNumTask() {
        return numTask;
    }

    public void setNumTask(int numTask) {
        this.numTask = numTask;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

//    @Override
//    public String toString() {
//        return "TaskModel{" +
//                "nameTask='" + nameTask + '\'' +
//                ", numTask=" + numTask +
//                ", active=" + active +
//                '}';
//    }
}
