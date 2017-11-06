class LinkedList2{
private:
  class Node{
  public:
    int v;
    Node* next;
    Node():next(nullptr){}
    Node(int x, Node* n):v(x),next(n){}
  }
  Node* head;
  Node* tail(){
    Node* p = head;
    for(;p-next!=nullptr;p=p->next)
      ;
      tail = p;
    }
  public:
    LinkedList2():{
      head=tail=nullptr;
    }
    ~LinkedList2():{
      Node* p = head;
      Node* temp = head;
      for(;p->next!=nullptr;p=temp){
        delete p;
        temp = temp->next;
      }
    }
    void addFirst(int x){
      if(head==nullptr){
        head=tail=new Node(x,nullptr);
        return;
      }
      Node* temp = new Node(x,head);
      head = temp;
    }
    void addEnd(int x){
      if(head==nullptr){
        head=tail=new Node(x,nullptr);
        return;
      }
      tail->next = new Node(x,nullptr);
    }
    void removeFront(){
      if(head->next==nullptr){
        delete head;
        head = tail = nullptr;
        return;
      }
      Node* temp = head;
      head = head->next;
      delete temp;
    }
    void removeBack(){
      if(head->next==nullptr){
        delete head;
        head = tail = nullptr;
        return;
      }
      Node* temp = head;
      for(;temp->next!=tail;temp=temp->next)
        ;
      temp->next = nullptr;
      delete tail;
      tail = temp;
    }
    void insertAfter(Node* p, int v){
      if(p->next==nullptr){
        addEnd(v);
        return;
      }
      p->next= new Node(v,p->next);
      
    }

  }
