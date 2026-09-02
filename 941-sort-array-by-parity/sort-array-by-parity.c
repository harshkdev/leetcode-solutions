/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortArrayByParity(int* nums, int numsSize, int* returnSize) {
    int *num = malloc(numsSize*sizeof(int));
    int j = 0;

    for(int i = 0; i < numsSize; i++){
        if(nums[i] % 2 == 0){
            num[j] = nums[i];
            j++;
        }
    }

    for( int i = 0; i < numsSize; i++){
        if(nums[i] % 2 !=0){
            num[j] = nums[i];
            j++;
        }
    }
    *returnSize = numsSize;
    return num;
    
}