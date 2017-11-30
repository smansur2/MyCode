#include <iostream>
#include <fstream>
#include <string>
using namespace std;

void load(const char filename[]) {
ifstream dict(filename);
string word;
int count = 0;
  while (!dict.eof()) {
    dict >> word;
    count++;
  }
  cout<<count;
}

int main(){
  load("words.txt");


  return 1;

}
