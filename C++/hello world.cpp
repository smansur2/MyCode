#include <iostream>
using namespace std;

void quicksort(int x[], int L, int R) {
  if (R <= L)
    return;
  int pivot = (x[L] + x[R]) / 2;
  int i = L, j = R;


  while (i < j) {
    while (x[i]< pivot)
      i++;
    while(x[j] >= pivot)
      j--;
    swap(x[i], x[j]);
  }
  // guarateed i == j
  quicksort(x, L, i);
  quicksort(x, i+1, R);
}


void main(){
  int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
  for(int i =0; i<10;i++)
    cout<<a[i]<<" ";
  cout<<endl;
    //quicksort(a, 0, 9);
  for(int i =0; i<10;i++)
      cout<<a[i]<<" ";

  return 1;
}
