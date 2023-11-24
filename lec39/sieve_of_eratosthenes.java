package lec39;

public class sieve_of_eratosthenes {
    public static void main(String[] args) {
       printSieve(100); 
    }
    // false indicates prime and true indicates non prime number. 
    public static void printSieve(int n) {
        boolean[] prime = new boolean[n+1];
        prime[0] = prime[1] = true;
        for(int i=2;i*i<prime.length;i++)
        {
            if(prime[i]==false) 
            for(int j=2;j*i<prime.length;j++) 
            prime[j*i] = true;
        }
        for(int i=1;i<n;i++) if(!prime[i]) System.out.print(i + " ");
    }
}
