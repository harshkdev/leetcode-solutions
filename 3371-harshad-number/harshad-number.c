int sumOfTheDigitsOfHarshadNumber(int x) {
    int lastdigit;
    int sum = 0;
    int temp = x;

    while( x != 0){
        lastdigit = x % 10;
        sum = sum + lastdigit;
        x = x/ 10;
    }

    if( temp % sum == 0){
        return sum;
    }
    return -1;
    
}