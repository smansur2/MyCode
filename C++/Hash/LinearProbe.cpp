/*
Suhail Mansuri
CPE 593 B
I pledge my honor that I have abided by the Stevens Honor System
*/
#include<iostream>

using namespace std;


class HashMapLinearProbing {
private:
  class Node {
	public:
 		int key;
		int val;
	};
  int count;
	Node* table;
	int size;
	int hist[51];


	int hash(int s) {
		int sum = s%size;
		return sum;
	}
public:
	HashMapLinearProbing(int sz) : table(new Node[sz]), size(sz) {
		for (int i = 0; i < 51; i++)
			hist[i] = 0;
      count=1;
	}

	~HashMapLinearProbing() {
		delete [] table;
	}
  int gettable(int i){
    return table[i].key;
  }
  void add(int s, int v) {
    int pos = hash(s);
 		int count = 0;
		while (table[pos].key != 0) {
			if (table[pos].key == s) {
				table[pos].val = v;
				if (count > 49)
					count = 50;
				hist[count]++;
				return;
			}
			count++;
			pos++;
			if (pos == size)
				pos = 0;
		}
		if (count > 49)
			count = 50;
		hist[count]++;
		table[pos].key = s;
		table[pos].val = v;
	}

	bool contains(int s)  {
    int pos = hash(s);
		while (table[pos].key != 0) {
			if (table[pos].key == s) {
				return true;
			}
			pos++;
			if (pos == size)
				pos = 0;
		}
    return false;
	}
	int* get(int s) {
    int pos = hash(s);
		while (table[pos].key != 0) {
			if (table[pos].key == s) {
				return &table[pos].val;
			}
			pos++;
			if (pos == size)
				pos = 0;
		}
    return NULL;
	}
	void displayHistogram() {
		for (int i = 0; i < 51; i++) {
      if(i!=50)
			   cout << i << "\t" << hist[i] << '\n';
      else
        cout <<">" << i << "\t" << hist[i] << '\n';
		}
	}
  void print(){
    for(int i = 0;i<size;i++)
      cout<<gettable(i)<<" ";
  }

};


int main() {
  cout<<"Enter an Integer"<<endl;
  int n;

  cin >> n;
  HashMapLinearProbing m(2*n);
  for (int i = 0; i < n; i++){
    m.add(rand(),1);
  }
  m.displayHistogram();




  return 1;
}
