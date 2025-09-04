class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int tot=0, tnk =0, srt=0;

        for(int i=0;i<gas.length;i++){
            int diff = gas[i] - cost[i];
            tot = tot + diff;
            tnk = tnk + diff;

            if(tnk < 0){
                srt = i + 1;
                tnk = 0;
            }
        }
        return tot >= 0 ? srt : -1;
        
    }
}