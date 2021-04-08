#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
	
    char chr[100];
    printf("Hello, World!");
    //printf("Enter a character: ");
    scanf("%[^\n]%*c",&chr);     
    printf("\n%s", chr);  
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
