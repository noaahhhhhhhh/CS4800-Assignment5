import java.beans.Transient;

public class PrimeTest {

   @Test
   public void test_2() {
      Prime number = new Prime();
      assertTrue(number.isPrime(2));
   }   

   @Test
   public void test_3() {
      Prime number = new Prime();
      assertTrue(number.isPrime(3));
   }

   @Test
   public void test_4() {
      Prime number = new Prime();
      assertTrue(number.isPrime(4));
   }   

   @Test
   public void test_5() {
      Prime number = new Prime();
      assertTrue(number.isPrime(5));
   }   

   @Test
   public void test_6() {
      Prime number = new Prime();
      assertTrue(number.isPrime(6));
   }   
}


