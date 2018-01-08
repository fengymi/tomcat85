import java.util.Locale;

/**
 * 忽略大小写Local测试
 */
public class IgnoreCaseTest {

    public static void main(String[] args) {

        System.out.println(IgnoreCaseTest.class.getClassLoader());
        System.out.println(Object.class.getClassLoader());

        String one = "一壹";

        System.out.println(one.toLowerCase(Locale.SIMPLIFIED_CHINESE));

    }

}
