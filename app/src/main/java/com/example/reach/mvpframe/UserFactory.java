package com.example.reach.mvpframe;

import com.example.reach.mvpframe.base.Init;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ZX on 2018/11/20
 */
//注解解析器
public class UserFactory {
    //recommend
    public static User createUser(){
        User user=new User();
        Method[] methods=user.getClass().getMethods();
        for (Method method:methods) {
            if(method.isAnnotationPresent(Init.class)){
                Init init=method.getAnnotation(Init.class);
                try {
                    method.invoke(user,init.value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return user;
    }
}
