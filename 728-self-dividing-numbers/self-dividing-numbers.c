/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* selfDividingNumbers(int left, int right, int* returnSize) {
    int* arr = malloc((right - left + 1)* sizeof(int));
    int count = 0;
    
    for(int i = left ; i <= right; i++){
        int valid = 1;
        int num = i;
        while( num != 0){
            int ld = num % 10;
            if(ld == 0 || i % ld != 0){
                valid = 0;
                break;
            }
            num /= 10;
        }
        if(valid){
            arr[count] = i;
            count++;
        }
    
    }
    *returnSize = count;
    return arr;
  
}