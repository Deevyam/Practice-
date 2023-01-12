/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int unit,a,b,c,d;
   printf("enter basic unit");
   scanf("%d",&unit);
    if(unit<=50)
    {
       
        a=unit*0.50;
        printf("the bill is%d",a);
       
    }
   else if(unit<=50&&unit<=100)
    {
        int z;
        z=unit-50;
        b=z*0.75;
        printf("the bill is%d",b+25);
        
    }
     else if(unit<=101&&unit<250)
    {
        int z;
        z=unit-100;
        c=z*1.25;
        printf("the bill%d",z+62);
    
}
else if(unit>250)
    {
         int z,y;
        y=z+218;
        z=unit-100;
        d=z*1.50;
        printf("the bill%d",z+218);
   printf("the final bill%d\n",y*0.20);
}}