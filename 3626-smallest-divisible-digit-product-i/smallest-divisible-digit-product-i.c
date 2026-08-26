int prod(int n){
    int lastdigit;
    int prod = 1;
    while( n != 0){
        lastdigit = n % 10;
        prod = prod * lastdigit;
        n = n /10;
    }
    return prod;
}
int smallestNumber(int n, int t) {

    prod(n);
    while(prod(n)%t!=0){
        n++;
    }
    return n;

    
    
}