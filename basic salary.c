/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int basic;
   printf("enter basic salary");
   scanf("%d",&basic);
    if(basic<=10001&&basic<20000)
    {
        int a;
        a=basic+basic*20/100+basic*90/100;
        printf("the salary is%d",a);
        
    }
      else if(basic<=10000)
    {
        int a;
        a=basic+basic*20/100+basic*80/100;
        printf("the salary is%d",a);
        
    }
    else {
         int a;
        a=basic+basic*30/100+basic*95/100;
        printf("the salary is%d",a);
    }
    
}
