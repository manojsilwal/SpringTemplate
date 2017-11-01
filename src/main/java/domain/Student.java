package domain;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by manoj on 10/31/2017.
 */
@Data
@AllArgsConstructor
public class Student {
    private String name;
    private int roll;
}
