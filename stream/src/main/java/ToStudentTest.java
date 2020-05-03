import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/03/24 17:04
 * @version: V1.0
 */
public class ToStudentTest {
    public static void main(String[] args) {
        Student studentA =new Student();
        studentA.setId(1L);
        studentA.setName("A");
        studentA.setAge(11);
        Student studentB =new Student();
        studentB.setId(2L);
        studentB.setName("B");
        studentB.setAge(22);
        Student studentC =new Student();
        studentC.setId(2L);
        studentC.setName("C");
        studentC.setAge(22);
        List<Student> studentList =new ArrayList<Student>();
        studentList.add(studentA);
        studentList.add(studentB);

        studentList.add(studentC);
        StreamModel streamModel =new StreamModel();
        streamModel.toMap(studentList);
    }
}
