package ru.geekbrains.javacore.lesson1.homework;

public class Course {

    public Course(){

    }

    public void doIt(Team team){
        Member[] members = team.members;
        for (Member member : members) {
            run(member);
            jump(member);
        }
    }

    public void run(Member member) {
        System.out.println(member.name + " пробежал ");
        member.setRun(true);
    }

    public void jump(Member member) {
        System.out.println(member.name + " прыгнул");
        member.setJump(true);
    }
}
