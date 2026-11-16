
void inorder(struct TreeNode* root, int* result, int* index) {

    if (root == NULL) {
        return;
    }

    // Left
    inorder(root->left, result, index);

    // Root
    result[*index] = root->val;
    (*index)++;

    // Right
    inorder(root->right, result, index);
}

int* inorderTraversal(struct TreeNode* root, int* returnSize) {

    int* result = malloc(100 * sizeof(int));
    *returnSize = 0;

    inorder(root, result, returnSize);

    return result;
}

