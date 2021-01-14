import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: jackie
 * @Date: 2021/1/11 17:40
 * @Version: 1.0.0
 * @function:
 */
@SpringBootTest
public class TestAdmin {


    @Test
    public void test01(){
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update("admin".getBytes("UTF-8"));
            instance.update("1234".getBytes("UTF-8"));
            byte[] digest = instance.digest();
            //7b902e6ff1db9f560443f2048974fd7d386975b0
            System.out.println(new BigInteger(1, digest).toString(32));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
