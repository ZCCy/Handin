package testMyAnnotation;

import java.lang.reflect.Field;

public class TestAnnotation {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> myAnnotation = Anno.class;
        Field[] declaredFields = myAnnotation.getDeclaredFields();

        for (Field declaredField : declaredFields){
            System.out.println(declaredField.getAnnotation(MyAnnotation.class).name());
        }

    }
}

class Anno {

    @MyAnnotation( id = 3 ,name="这是注解")
    public int l;
}