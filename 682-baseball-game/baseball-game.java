class Solution {
    public int calPoints(String[] operations) {
        int [] res = new int[operations.length];
        int size = 0;
        for(int i = 0; i < operations.length ; i++){
            if(operations[i].equals("C")){
                size--;
            }
            else if(operations[i].equals("D")){
                res[size] = 2 * res[size - 1];
                size++;
            }
            else if(operations[i].equals("+")){
                res[size] = res[size - 1] + res[size - 2];
                size++;
            }else{
                res[size] = Integer.parseInt(operations[i]);
                size++;
            }
            
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += res[i];
        }
        return sum;
        
    }
}