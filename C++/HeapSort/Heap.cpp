/*
Suhail Mansuri
CPE 593 B
Source: http://www.geeksforgeeks.org/heap-sort/
*/
#include <iostream>
using namespace std;

void heapify(int arr[], int n, int i)
{
    int largest = i;
    int l = 2*i + 1;
    int r = 2*i + 2;
    if (l < n && arr[l] > arr[largest])
        largest = l;

    if (r < n && arr[r] > arr[largest])
        largest = r;

    if (largest != i)
    {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;

        heapify(arr, n, largest);
    }
}

void heapSort(int arr[], int n)
{
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);
    for (int i=n-1; i>=0; i--)
    {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        heapify(arr, i, 0);
    }
}





void main(){
  int x;
  cout<<"How big is the array?"<<endl;
  cin>>x;
  int *arr = new int[x];
  cout<<"Enter elements in array"<<endl;
  for(int i = 0; i<x;i++)
    cin>>arr[i];
  heapSort(arr,x);
  cout<<endl;
  for(int i = 0; i<x;i++)
    cout<<arr[i]<<" ";
  delete[] arr;
  return 1;
}
