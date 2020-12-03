package com.example.otherLearn;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 2020-06-24 16:48
 * @version: V1.0
 */
public class ListenerTest {
    public static void main(String[] args) {
        ReadListener readListener = new ReadListener();
        Student student = new Student();
        student.setListener(readListener);
        // 当执行这个方法时，会自动调用ReadListener.isReading()方法
        student.read();

    }
}
