package com.lizq.design.behavioral.memento;

/**
 * @author lizq
 * @date 2019/01/23 22:26
 */
public class Application {

    public static void main(String[] args) throws Exception {

        System.out.println("单快照保存");
        //定义出发起人
        Originator originator = new Originator();
        originator.setState("1");
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        System.out.println(originator.toString());
        originator.setState("2");
        System.out.println(originator.toString());
        //恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.toString());

        System.out.println("多快照保存");
        MultipartCaretaker multipartCaretaker = new MultipartCaretaker();
        multipartCaretaker.setMemento("1",originator.createMemento());
        System.out.println(originator.toString());
        originator.setState("2");
        System.out.println(originator.toString());
        multipartCaretaker.setMemento("2",originator.createMemento());
        originator.restoreMemento(multipartCaretaker.getMemento("1"));
        System.out.println(originator.toString());
        originator.restoreMemento(multipartCaretaker.getMemento("2"));
        System.out.println(originator.toString());
    }

}
