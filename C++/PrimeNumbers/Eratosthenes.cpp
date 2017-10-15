#include <iostream>
#include <math.h>
using namespace std;

int SieveOfEratosthenes(unsigned long long n)
{
    // Create a boolean array "prime[0..n]" and initialize
    // all entries it as true. A value in prime[i] will
    // finally be false if i is Not a prime, else true.
    bool prime[n+1];
    for(int i = 0;i<n+1;i++){
      prime[i]=true;
    }
    for(int i=2;i<n+1;i+=2)
      prime[i]=false;
    for (int p=3; p<=n; p+=2)
    {
        // If prime[p] is not changed, then it is a prime
        if (prime[p] == true)
        {
            // Update all multiples of p
            for (int i=p*p; i<=n; i+=2*p)
                prime[i] = false;
        }
    }

    // Print all prime numbers
    int count = 0;
    for (int p=2; p<=n; p++)
       if (prime[p])
          count++;
    return count;
}


void main(){

  unsigned long long x;
  unsigned long long y;
  cin>> x >> y;
  cout<<(SieveOfEratosthenes(y)-SieveOfEratosthenes(x))+1<<endl;

  return 1;
}
