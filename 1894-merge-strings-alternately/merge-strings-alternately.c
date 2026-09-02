

char * mergeAlternately(char * word1, char * word2){
    int len = strlen(word1);
    int length = strlen(word2);
    char *merge = malloc(len+length+1);
    int i = 0;
    int j = 0;
    int k = 0;

    while(i<len || j<length){
        if( i < len){
            merge[k++] = word1[i++];
        }
        if(j < length){
            merge[k++] = word2[j++];
        }
        

    }
    merge[k] = '\0';
    return merge;


}