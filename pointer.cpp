#include <iostream>
using namespace std;
int*insertX(int n, int arr[],int x, int pos)

int main()
{
int i;
n++;
for (i = n; i >= pos; i--)
{
arr[i] = arr[i - 1];
}
arr[pos - 1] = x;
return arr;
}


