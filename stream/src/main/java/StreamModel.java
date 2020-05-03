import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/03/24 17:11
 * @version: V1.0
 */
public  class StreamModel {
    void toMap(List<Student> list){


        Map<Long, Student> map = list.stream().collect(Collectors.toMap(Student::getId, student -> student, (key1,
                                                                                                              key2) -> key1));
        Map<Long, String> map1 = list.stream().collect(
                Collectors.toMap(Student::getId,Student::getName, (key1, key2) -> key1)
        );
        map.forEach((key, value) -> {
            System.out.println("key: " + key + "    value: " + value);
        });
        map1.forEach((key, value) -> {
            System.out.println("key: " + key + "    value: " + value);
        });



    }
}
