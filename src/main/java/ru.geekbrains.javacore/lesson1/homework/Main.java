package ru.geekbrains.javacore.lesson1.homework;

public class Main {

    public static void main(String[] args) {
        Member human = new Member("Human");
        Member robot = new Member("Robot");
        Member cat = new Member("Cat");
        Member dog = new Member("Dog");
        Member[] members = {human, robot, cat, dog};

        Course c = new Course();
        Team team = new Team("Java Champions",members);

        team.showAllMembers();
        c.doIt(team);
        team.showResults();
    }
}
