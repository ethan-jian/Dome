package run;
import java.util.List;
import org.testng.TestNG;
import com.google.common.collect.Lists;
import login.Login;

public class Run {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        List<String> suites = Lists.newArrayList();
        //添加要执行的testng.xml文件
        suites.add("testng.xml");
        System.out.println(suites);
        tng.setTestSuites(suites);
        tng.run();
    }
}
