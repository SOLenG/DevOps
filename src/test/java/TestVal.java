/**
 * Created by zaafranigabriel on 16/09/2016.
 */
import org.junit.*;
public class TestVal {

    @Test
    public void should_get_value(){
        File file = new File();
        String value = file.get();
        System.out.println(value);
        Assert.assertNotNull(value);
    }

    @Test
    public void should_post_value(){
        File file = new File();
        Assert.assertTrue(file.post());
    }

}
