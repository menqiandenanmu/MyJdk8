package com.example.otherLearn;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 2020-06-24 16:41
 * @version: V1.0
 */
public class Student {
    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }
    public void read(){
        if(null!=listener){
            Event event=new Event();
            event.setStudent(this);
            listener.isRead(event);
        }
    }
}
