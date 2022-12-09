#include<iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *left,*right;
    
    Node(int d){
        data=d;
        left=NULL;
        right=NULL;
    }
    void display(){
        cout<<data<<endl;
    }
};

class BST
{
       public:
       Node *rptr;
       BST(){
           rptr=NULL;
       }
       Node* addNode(Node *r,int d){
           if(r==NULL){
               Node *nptr=new Node(d);
               return nptr;
           }
           else if(r->data>d){
               r->left=addNode(r->left,d);
               return r;
           }
           else{
               r->right=addNode(r->right,d);
               return r;
           }
       }
       Node* search(Node *r,int val){
            if(r==NULL){
                return NULL;
            }
            else if(r->data == val){
                return r;
            }
            else if(r->data>val){
                return search(r->left,val);
            }
            else{
                return search(r->right,val);
            }
       }
    Node *getParent(Node *r,Node *dptr){
            if(r==NULL){
                return NULL;
            }
            else if(r->left == dptr || r->right == dptr){
                return r;
            }
            else if(r->data > dptr->data){
                return getParent(r->left,dptr);
            }
            else{
                return getParent(r->right,dptr);
            }
    }
    Node* get_MinNode(Node *node)
    {
        if(node->left == NULL)
        {
            return node;
        }
        else 
        {
            get_MinNode(node->left);
        }
        return 0;
    }
    void deleteNode(Node *r,int d){
           if(r==NULL){
               return;
           }
           else{
                Node *dptr = search(r,d);
                if(dptr!=NULL){
                   Node *pptr = getParent(r,dptr);
                   if(dptr->left == NULL && dptr->right == NULL){
                       if(pptr->left==dptr){
                            pptr->left = NULL;
                       }
                       else{
                           pptr->right=NULL;
                       }
                       delete dptr;
                   }
                   else{
                       if(dptr->left==NULL || dptr->right==NULL){
                           Node *pptr = getParent(r,dptr);
                           if(pptr->left == dptr){
                               if(dptr->right!=NULL){
                                   pptr->left = dptr->right;
                               }
                               else{
                                   pptr->left=dptr->left;
                               }
                           }
                           else{
                              if(dptr->right!=NULL){
                                   pptr->right = dptr->right;
                               }
                               else{
                                   pptr->right=dptr->left;
                               } 
                           }
                       }
                       else
                       {    
                         Node *inorders = get_MinNode(dptr->right);
                         int val = inorders->data;
                         deleteNode(r,val);
                         dptr->data = val;
                       }
                   }
                }
           }
       }
       void inorder(Node *r)
       {
           if(r==NULL)
           {
               return;
           }
           else
           {
               inorder(r->left);
               r->display();
               inorder(r->right);
           }
       }
};
int main()
{
    BST bst;
    Node *t = bst.addNode(NULL,10);
    t = bst.addNode(t,7);
    t = bst.addNode(t,15);
    t = bst.addNode(t,8);
    t = bst.addNode(t,12);
    t = bst.addNode(t,14);
    t = bst.addNode(t,9);
    t = bst.addNode(t,6);

    cout<<"Before deletion"<<endl;
    bst.inorder(t);

    bst.deleteNode(t,7);
    cout<<"After deletion"<<endl;
    bst.inorder(t);
  
    return 0;
}