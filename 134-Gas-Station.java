class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sc=0,sg=0,tot=0,res=0;
        for(int i=0;i<gas.length;i++){
            sc=sc+cost[i];
            sg=sg+gas[i];
        }
        if(sc>sg){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
            tot+=gas[i]-cost[i];
            if(tot<0){
                tot=0;
                res=i+1;
            }
        }
        return res;
    }
}