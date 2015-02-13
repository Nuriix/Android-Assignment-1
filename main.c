#include <stdio.h>

int main()
{
int a, b;
int c = 1;

printf("Enter the lowest value: ");
scanf("%d", &a);
printf("Enter the highest value: ");
scanf("%d", &b);

int n = a;

while(6*n-1 >= a && 6*n+1 <= b){
//if((6*n+1)-(6*n-1)==2) {
   if (primeTesting(6*n+1)==1 && primeTesting(6*n-1)==1) 
      c+=1;                    

n++;
}
printf("The number of twin prime is: %d\n", c);

system("PAUSE");
return 0;
}    

int primeTesting(int num){
    int div;
    //1=prime 0=not prime
    if (num==2) return 1;
    if (num%2 == 0) return 0;
    
    div=3;
    
    while (div*div <= num && num%div != 0)
          div+=2;
    if (num%div == 0) return 0;
    else return 1;
}
  
