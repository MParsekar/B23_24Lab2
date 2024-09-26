package mes.casetools.lab3.BCA2205126;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class IsPrime_Test {

    @Test
    void is_prime(){
        IsPrime prime_num = new IsPrime();
        boolean output = prime_num.isPrime(7);
        assertTrue(output);
    }

    @Test
    void is_not_seven(){
        IsPrime prime_num = new IsPrime();
        boolean output = prime_num.isPrime(8);
        assertFalse(output);
    }
}

