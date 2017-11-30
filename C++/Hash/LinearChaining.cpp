/*
Suhail Mansuri
CPE 593 B
I pledge my honor that I have abided by the Stevens Honor System
*/
#include<iostream>
#include <fstream>
#include <string>

using namespace std;


class HashMapLinearProbing {
private:
  class Node {
	public:
 		string key;
		int val;
	};
  int count;
	Node* table;
	int size;
	int hist[51];


  int hash(const string& s) const {
		int sum = s.length();
		for (int i = 0; i < s.length(); i++)
			sum = (sum + s[i]) ^ (sum >> 13) ^ (sum << 17);
		return sum & (size-1);
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
  string gettable(int i){
    return table[i].key;
  }
  void add(const string& s, const int v) {
    int pos = hash(s);
 		int count = 0;
    int skip = 1;
		while (table[pos].key.length() != 0) {
			if (table[pos].key == s) {
				table[pos].val = v;
				if (count > 49)
					count = 50;
				hist[count]++;
				return;
			}
			count++;
			pos+=skip;
      skip+=skip;
			if (pos == size)
				pos = 0;
		}
		if (count > 49)
			count = 50;
		hist[count]++;
		table[pos].key = s;
		table[pos].val = v;
	}

	void displayHistogram() {
		for (int i = 0; i < 51; i++) {
      if(i!=50)
			   cout << i << "\t" << hist[i] << '\n';
      else
        cout <<">" << i << "\t" << hist[i] << '\n';
		}
	}

  void load(const char filename[]) {
  ifstream dict(filename);
  string word;
  int count = 0;
  while (!dict.eof()) {
    dict >> word;
    add(word, count++);
  }

}
  void print(){
    for(int i = 0;i<size;i++){
      cout<<gettable(i)<<" ";
    }
  }

};


int main() {
  HashMapLinearProbing m(2*370099);
  m.load("words.dat");
  m.displayHistogram();




  return 1;
}
