/*
Suhail Mansuri
EE 593
*/
#include <iostream>
#include <string>
#include <fstream>
using namespace std;

class DLinkedList {
public:
	class Node {
	public:
		int  v;
		Node* next;
		Node* prev;
		Node() : next(NULL), prev(NULL) {}
		Node(int v, Node* next, Node* prev) : v(v), next(next), prev(prev) {}
	};

	Node* head;
	Node* tail;

	DLinkedList() { //O(1)
		head = tail = NULL;
	}
	~DLinkedList()  { //O(n )
		Node* temp;
		for (Node* p = head; p->next != NULL; p=temp) {
			temp = p->next;
      delete p;
		}
	}
	void addFirst(int v) {
		if (head == NULL) {
			head = tail = new Node(v, NULL, NULL);
			return;
		}
		//head = new Node(v, head, NULL)
		Node* temp = new Node();
		temp->v = v;
		temp->next = head;
		temp->prev = NULL;
		head->prev = temp;
		head = temp;
	}
	void addLast(int v) {
		if (head == NULL) {
			head = tail = new Node(v, NULL, NULL);
			return;
		}
		tail->next = new Node(v, NULL, tail);
		tail = tail->next;
	}
	void removeFirst() {
		if (head == NULL)
			return;
		if (head->next == NULL) {
      delete head;
			head = tail = NULL;
			return;
		}
			Node* temp = head;
			head = head->next;
			head->prev = NULL;
			delete temp;
	}

	void removeLast() {
		if (tail == NULL)
			return;
		if (head->next == NULL) {
			delete head;
			head = tail = NULL;
			return;
		}
		tail = tail->prev; // go back!!!
		delete tail->next;
		tail->next = NULL;
	}
  int get(int i) {
		Node* p = head;
		for (; i > 0 && p != NULL; i--, p = p->next)
			;
		if (p == NULL)
			throw "Diediedie";
		return p->v;
	}

  void insertAfter(Node* p, int v) {
		//		p->next =    new Node(v, p->next, p)
		Node* temp = new Node();
		temp->v = v;
		temp->next = p->next;
		temp->prev = p;
		p->next = temp;
		p->next->prev = temp;
	}

	  void insertBefore(Node* p, int v) {
			if (p->prev == NULL) {
				head = new Node(v, p, NULL);
				p->prev = head;
				return;
			}
			insertAfter(p->prev,v);


	}

	void print(){
		for (Node* p = head; p != NULL; p=p->next) {
			cout<<p->v<<" ";
		}
		cout<<endl;
	}
};

void command(string s,ifstream& inFile, DLinkedList& x){
	if(s=="ADD_FRONT"){
		inFile>>s;
		int i, j, k;
		i = s[0]-48;
		j = s[2]-48;
		k = (s[4]-48)*10 + s[5]-48;
		for(i;i<=k;i+=j){
			x.addFirst(i);
		}
	}
	else if(s=="ADD_BACK"){
		inFile>>s;
		int i, j, k;
		i = s[0]-48;
		j = s[2]-48;
		k = (s[4]-48)*10 + s[5]-48;
		for(i;i<=k;i+=j){
			x.addLast(i);
		}
	}
	else if(s=="REMOVE_FRONT"){
		inFile>>s;
		int j = s[0]-48;
		for(int i = 0;i<j;i++){
			x.removeFirst();
		}
	}
	else if(s=="REMOVE_BACK"){
		inFile>>s;
		int j = s[0]-48;
		for(int i = 0;i<j;i++){
			x.removeLast();
		}
	}
	else if(s=="OUTPUT"){
		x.print();
	}
}



  void main(){
    string s;
    DLinkedList x;

    ifstream inFile;
    inFile.open("HW4b.txt");
    if(!inFile){
      cout<<"Unable to open file"<<endl;
      exit(1);
    }
    while(!inFile.eof()){
        inFile>>s;
        command(s,inFile,x);
    }
    return 1;
  }
