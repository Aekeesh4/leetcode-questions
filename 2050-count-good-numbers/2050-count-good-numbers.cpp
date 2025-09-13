class Solution {
public:
  long long mod=1e9+7;
  long long mypow(long long base,long long exp,long long mod){
    long long result=1;
    base%=mod;
   
    while(exp>0){
         if(exp%2!=0)
        result=(result*base)%mod;
        base=(base*base)%mod;
        exp=exp/2;
    }
    return result;
  }
   
    int countGoodNumbers(long long n) {
        long long k=(n+1)/2;
        long long m=n/2;
        long long s1=mypow(5,k,mod);
        long long s2=mypow(4,m,mod);
        return (s1*s2)%mod;





        
    }
};