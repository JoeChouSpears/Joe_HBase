import Utils.HBaseUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: joe22
 * @Date: 2021/6/24 16:41
 */
public class HBaseUtilsTest {

    private static final String TABLE_NAME = "WordCount";
    private static final String TEACHER = "teacher";
    private static final String STUDENT = "student";

    @Test
    public void createTable() {
        // 新建表
        List<String> columnFamilies = Arrays.asList(TEACHER, STUDENT);
        boolean table = HBaseUtils.createTable(TABLE_NAME, columnFamilies);
        System.out.println("表创建结果:" + table);
    }
}
