import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int number = getLocalNumber();
        Assert.assertTrue("Метод getLocalNumber возвращает не корректное число",number == 14);
    }

    @Test
    public void testGetClassNumber() {
        int number = getClassNumber();
        Assert.assertTrue("Метод getClassNumber возвращает число равное или меньше 45", number > 45);
    }

    @Test
    public void testGetClassString() {
        String str = getClassString();

        Assert.assertTrue("Строка не содержит подстроку 'Hello' или 'hello'",str.contains("hello")||str.contains("Hello"));
    }
}
