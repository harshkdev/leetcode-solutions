/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode* temp = head;
    int length = 0;

    while(temp != NULL){
        length++;
        temp = temp -> next;
    }

    int* res = malloc(length * sizeof(int));
    int i = 0;

    
    while( head != NULL){
        res[i] = head -> val;
        i++;
        head = head -> next;
        
    }

    
    int j = length - 1;
    for(int i = 0; i < length; i++ ){
        
        if(res[i] != res[j]){
            return false;
        }
        j--;
       
    }
    return true;
    
}