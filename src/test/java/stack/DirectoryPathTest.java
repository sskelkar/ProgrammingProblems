package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirectoryPathTest {

    @Test
    public void simplifyDirectoryPath() {
        //given
        String path = "/home/";

        //when
        String result = new DirectoryPath().simplify(path);

        //then
        assertEquals("/home", result);
    }

    @Test
    public void simplifyDirectoryPath2() {
        //given
        String path = "/a/./b/../../c/";

        //when
        String result = new DirectoryPath().simplify(path);

        //then
        assertEquals("/c", result);
    }

    @Test
    public void simplifyDirectoryPath3() {
        //given
        String path = "/../";

        //when
        String result = new DirectoryPath().simplify(path);

        //then
        assertEquals("/", result);
    }

    @Test
    public void simplifyDirectoryPath4() {
        //given
        String path = "/home//foo/";

        //when
        String result = new DirectoryPath().simplify(path);

        //then
        assertEquals("/home/foo", result);
    }
}