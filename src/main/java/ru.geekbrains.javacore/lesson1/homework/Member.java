package ru.geekbrains.javacore.lesson1.homework;

public class Member{

    public String name;

    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    public boolean isJump() {
        return isJump;
    }

    public void setJump(boolean jump) {
        isJump = jump;
    }

    private boolean isRun;
    private boolean isJump;

    public Member() {
    }

    public Member(String name) {
        this.name = name;
        this.isRun = false;
        this.isJump = false;
    }



    @Override
    public String toString(){
        return "Участник по имени " + name + System.lineSeparator();
    }
}
