package com.example.message;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/03/31 10:54
 * @version: V1.0
 */
@Slf4j
public class MyLog {
    public void  info(String message){
        log.info("test{}",message);
    }

}
