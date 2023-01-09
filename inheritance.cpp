#include<iostream>
using namespace std;
class Maths
{
    int num1;
    int num2;
protected:
    int res;

public:
    void input()
    {
        cout<<"enter first number";
        cin>>num1;
        cout<<"enter second number";
        cin>>num2;
    }

    void sum(){
        res=num1+num2;
        cout<<"the sum is"<<res;

    }

    void sum(int x, int y)
    {
        res=x+y;
        cout<<"the sum is"<<res;
    }
};

class ADMaths:public Maths
{
    int num1;
    int num2;

public:
    void subtract(int x,int y)
    {
        num1=x;
        num2=y;
        res=num1-num2;
        cout<<"the subtraction is"<<res;
    }
    void multi(int x,int y)
    {
        num1=x;
        num2=y;
        res=x*y;
        cout<<"the multiplication is "<<res;}
    };
int main()
{
  Maths mt;
  mt.sum();
  mt.input();
  ADMaths ad;
  ad.multi(11,11);
}
