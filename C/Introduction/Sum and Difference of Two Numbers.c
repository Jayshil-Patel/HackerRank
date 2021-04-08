#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int a,b;
    int sum, diff;
    float sum_f,diff_f;
    float c,d;
    scanf("%d %d",&a,&b);
    scanf("%f %f",&c,&d);
    sum = a+b;
    diff = a-b;
    sum_f= c +d;
    diff_f = c -d;
    
    printf("%d",sum);
    printf(" %d",diff);
    printf("\n");
    printf("%.1f",sum_f);
    printf(" %.1f",diff_f);
    return 0;
}
