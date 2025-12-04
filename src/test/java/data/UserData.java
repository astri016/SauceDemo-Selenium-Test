package data;

import org.testng.annotations.DataProvider;

public class UserData {

    @DataProvider(name = "users")
    public static Object[][] users() {
        return new Object[][]{
                {"standard_user"},
                {"problem_user"},
                {"performance_glitch_user"},
                {"error_user"},
                {"visual_user"}
        };
    }
}
