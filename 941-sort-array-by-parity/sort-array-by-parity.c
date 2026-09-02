
int* sortArrayByParity(int* nums, int numsSize, int* returnSize) {

    int i = 0; int j = numsSize - 1;
    while( i < j){
        if( nums[i] % 2 == 0){
            i++;
        }
        else if(nums[j]%2 == 1){
            j--;
        }
        else{
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        

    }
    *returnSize = numsSize;
    return nums;
    // int *num = malloc(numsSize*sizeof(int));
    // int j = 0;

    // for(int i = 0; i < numsSize; i++){
    //     if(nums[i] % 2 == 0){
    //         num[j] = nums[i];
    //         j++;
    //     }
    // }

    // for( int i = 0; i < numsSize; i++){
    //     if(nums[i] % 2 !=0){
    //         num[j] = nums[i];
    //         j++;
    //     }
    // }
    // *returnSize = numsSize;
    // return num;
    
}