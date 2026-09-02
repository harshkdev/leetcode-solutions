char* firstPalindrome(char** words, int wordsSize) {
    for(int i =0; i < wordsSize; i++){

        int length = strlen(words[i]);
        int left = 0; 
        int right = length - 1;
        int pal = 1;
        while( left < right){
            if(words[i][left] != words[i][right]){
                pal = 0;
                break;
               
            }
            else{
                right--;
                left++;
            }
           
        }
        if(pal == 1){
            return words[i];
            
        }
    }
    return "";
    
}