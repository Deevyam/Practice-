#include <iostream>
using namespace std;

class student {
    public:
    int rollno, n1,n2,n3;
    float calavg();

};
float student::calavg(){

return(n1+n2+n3)/3;
}

int main(){
    student s1;
    cout<<"enter number"<<endl;
    cin>>s1.n1>>s1.n2>>s1.n3;
    float avg = s1.calavg();
    cout<<avg;
    return 0;
};
