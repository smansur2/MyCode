#include <iostream>
#include <fstream>

using namespace std;

int main() {
  int x;
  ifstream inFile;
  inFile.open("hw2a.dat");
  if(!inFile){
    cout<<"Unable to open file";
    exit(1);
  }
inFile>>x;
int *arr = new int[x];
for(int i =0; i<x;i++)
  {
    cin>>arr[i];
  }
for(int i = 0; i<x;i++){
  cout<<arr[i]<<" ";
}
/*
cout<<x<<endl;
for(int i =0;i<2;i++)
  cout<<a[i]<<" ";

*/

 inFile.close();
  return 1;
}
