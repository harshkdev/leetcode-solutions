#include <stdlib.h>
#include <stdio.h>

char** fizzBuzz(int n, int* returnSize) {
    char** arr = malloc(n * sizeof(char*));
    *returnSize = n;

    for (int i = 0; i < n; i++) {
        int num = i + 1;

        if (num % 3 == 0 && num % 5 == 0) {
            arr[i] = "FizzBuzz";
        }
        else if (num % 3 == 0) {
            arr[i] = "Fizz";
        }
        else if (num % 5 == 0) {
            arr[i] = "Buzz";
        }
        else {
            arr[i] = malloc(12 * sizeof(char));
            sprintf(arr[i], "%d", num);
        }
    }

    return arr;
}