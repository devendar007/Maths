class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
    boolean isprime[]=new boolean[N+1];
    for(int i=2;i<=N;i++) isprime[i]=true;
    for(int i=2;i<=Math.sqrt(N);i++){
        if(isprime[i]){
      
        for(int j=2;j*i<=N;j++){
            isprime[j*i]=false;
        }
    }}
    for(int i=0;i<=N;i++) {
    if(isprime[i]){
        ans.add(i);
    }
    }
    return ans;
    }
}