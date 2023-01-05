#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int num1;
int num2;
float a,b,PI;
int oper;
cout<<"CALCULATOR "<<endl;
cout<<"Operations  "<<"Trigonometric Functions   "<<"Logarithmic Functions\n";
cout<<"choose operations \n0.addition \n1.subtraction \n2 multiplication \n3. division \n4.modulus \n5.exponents \n6.square roots \n7.sin \n8.cos \n9.Tan \n10.inverse of sin \n11.inverse of cos \n12.inverse of Tan n\13.log n\14.Log with base 10 \n15.abs \n16.floor"<<endl;
while (true){
cout<<"Enter operation to performed: ";
cin>>oper;
switch (oper)
{
case 0:
cout<<"enter first number:";
cin>>num1;
cout<<"enter second number:";
cin>>num2;
cout << num1 << " + " << num2 << " = " << num1 + num2;
break;
case 1:
cout<<"enter first number:";
cin>>num1;
cout<<"enter second number:";
cin>>num2;
cout << num1 << " - " << num2 << " = " << num1 - num2;
break;
case 2:
cout<<"enter first number:";
cin>>num1;
cout<<"enter second number:";
cin>>num2;
cout << num1 << " * " << num2 << " = " << num1 * num2;
break;
case 3:
cout<<"enter first number:";
cin>>num1;
cout<<"enter second number:";
cin>>num2;cout << num1 << " / " << num2 << " = " << num1 / num2;
break;
case 4:
cout<<"enter first number:";
cin>>num1;
cout<<"enter second number:";
cin>>num2;
cout << num1 << " % " << num2 << " = " << num1 % num2;
break;
case 5:
cout<<"Enter number : ";
cin>>a;
cout<<"Enter the exponent : ";
cin>>b;
cout<<"Exponent = "<<pow(a,b)<<endl;
break;
case 6:
cout<<"Enter the number : ";
cin>>a;
cout<<"Square Root = "<<sqrt(a)<<endl;
break;
case 7:
cout<<"Enter the number : ";
cin>>a;
cout<<"Sin = "<<sin(a)<<endl;
break;
case 8:
cout<<"Enter the number : ";
cin>>a;
cout<<"Cos = "<<cos(a)<<endl;
break;
case 9:
cout<<"Enter the number : ";
cin>>a;
cout<<"Tan = "<<tan(a)<<endl;
break;
case 10:
cout<<"Enter the number : ";
cin>>a;
cout<<"Inverse of Sin = "<<asin(a)*180.0/PI<<endl;
break;
case 11:
cout<<"Enter the number : ";
cin>>a;
cout<<"Inverse of Cos = "<<acos(a)*180.0/PI<<endl;
break;
case 12:
cout<<"Enter the number : ";
cin>>a;
cout<<"Inverse of tan = "<<atan(a)*180.0/PI<<endl;
break;
case 13:
cout<<"Enter the number : ";
cin>>a;
cout<<"Log = "<<log(a)<<endl;
break;
case 14:
cout<<"Enter the number : ";
cin>>a;
cout<<"Log with base 10 = "<<log10(a)<<endl;
break;
case 15:
cout<<"Enter number :";
cin>>a;
cout << "abs( "<<a<<" ) = " << abs(a) << endl;
break;
case 16:
cout<<"Enter number :";
cin>>a;
cout<<"floor( "<<a<<" ) = " << floor(a) << endl;
break;
default:
cout<<"wroung input"<<endl;
}}
    return 0;
}
