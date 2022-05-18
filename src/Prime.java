public class Prime {
   public boolean isPrime(int num)
   {
      boolean prime = true;

      for (int i = 2; i <= num-1; i++) {
         if (num%i == 0) {
            prime = false;
            break;
         }
      }

      return prime;
   }
}