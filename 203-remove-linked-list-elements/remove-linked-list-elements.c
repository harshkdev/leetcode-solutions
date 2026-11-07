struct ListNode* removeElements(struct ListNode* head, int val) {

    if(head == NULL){
        return NULL;
    }

    // Delete nodes from beginning
    while(head != NULL && head->val == val){
        struct ListNode* temp = head;
        head = head->next;
        free(temp);
    }

    if(head == NULL){
        return NULL;
    }

    // Two pointers
    struct ListNode* p = head;
    struct ListNode* q = head->next;

    while(q != NULL){

        if(q->val == val){

            p->next = q->next;
            free(q);
            q = p->next;

        }
        else{

            p = q;
            q = q->next;

        }
    }

    return head;
}