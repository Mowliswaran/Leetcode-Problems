class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int n=m.length;
        int nn=m[0].length;
        ArrayList<Integer>l=new ArrayList<>();
        int a=0,b=1;
        int f=0;
        int x=n*nn;
        matrix(l,n,nn,m,a,b,f,x);
        return l;
    }
    void matrix(ArrayList<Integer>l,int n,int nn,int m[][],int a,int b,int f,int x){
        
       if(f==x){
           return;
       }
        for(int i=a;i<nn;i++){
            if(f==x){
           return;
       }
            f++;
            l.add(m[a][i]);
        }
        if(f==x){
           return;
       }
        
       for(int i=b;i<n;i++){
           if(f==x){
           return;
       }
           f++;
           l.add(m[i][nn-1]);
       }
       if(f==x){
           return;
       }
       for(int i=nn-2;i>=a;i--){
           if(f==x){
           return;
       }
           f++;
           l.add(m[n-1][i]);
       }
       if(f==x){
           return;
       }
       for(int i=n-2;i>=b;i--){
           if(f==x){
           return;
       }
           f++;
           l.add(m[i][a]);
       }
       
       matrix(l,n-1,nn-1,m,a+1,b+1,f,x);
    }
}