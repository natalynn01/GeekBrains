package ru.geekbrains.javacore.lesson1.homework;

public class Team {

    public String teamName;
    public Member[] members;

    public Team(String teamName, Member[] members) {
        this.teamName = teamName;
        this.members = members;
    }

    public void showResults(){
        for (int i = 0; i < members.length; i++) {
            Member member = members[i];
            if (member.isRun() & member.isJump()){
                System.out.println(member.name + " прошел дистанцию.");
            }
        }
    }

    public void showAllMembers(){
        System.out.println("Состав команды " + teamName + ":" + System.lineSeparator() + this);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Member member : members) {
            sb.append(member.toString());
        }
        return sb.toString();
    }
}
