package homework8.task3;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CompareWithTen{
    int Ten() default 10;
}
