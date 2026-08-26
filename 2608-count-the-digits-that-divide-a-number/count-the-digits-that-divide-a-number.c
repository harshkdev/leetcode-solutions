int countDigits(int num) {

    int lastdigit;
    int orig = num;
    int i = 0;

    while(num!=0){
        lastdigit = num % 10;
        
        if(orig%lastdigit==0){
            i++;
        }
        num = num/10;
    }
    return i;
    
}