/* #include<bits/stdc++.h>
using namespace std;
int main(){
    int i,e,p;
    int choice;
    list<int> l;
    while(1){
        cout<<"Enter:\n1 to insert at begining \n2 to insert at end\n3 to insert at any position \n4 to delete at beginning \n5 to delete at end \n6 to delete at any position\n7 to reverse the list \n8 to display the list\n9 to exit\nEnter your choice: ";
        cin>>choice;
        switch(choice){
            case 1:{
                    cout<<"\n Enter the element: ";
                    cin>>e;
                    l.push_front(e);
                    break;}
            case 2:{
                    cout<<"\n Enter the element: ";
                    cin>>e;
                    l.push_back(e);
                    break;}
            case 3:{
                    cout<<"\n Enter the element: ";
                    cin>>e;
                    cout<<"\n Enter the position(index starting from 0): ";
                    cin>>p;
                    list<int>::iterator it=l.begin();
                    advance(it,p);
                    if(p<=l.size()){
                        l.insert(it,1,e);
                    }
                    else{
                        cout<<"Wrong position";
                        // break;
                    }
                    break;
            }
            case 4:{
                            l.pop_front();
            break;
            }
            case 5:{
            l.pop_back();
            break;}
            case 6:{
            cout<<"Enter the position (index starting from 0): ";
            cin>>p;
            list<int>::iterator it=l.begin();
            advance(it,p);
            l.erase(it);
            break;}
            case 7:{
            l.reverse();
            break;}
            case 8:{
            for(int i:l){
                cout<<i<<" ";
                
            }
            cout<<"\n";
            break;
            }
            case 9:{
            exit(0);
            break;}
            default:
            cout<<"INVALID";
            
        }
    }

    return 0;
} */




#include<bits/stdc++.h>
using namespace std;
int main(){
    int ele,n;
    list<int> l;
    /*cout<<"Enter num of element for inserting at beg: ";
    
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>ele;
        l.push_front(ele);
    }*/

    /* cout<<"Enter num of element for inserting at end: ";
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>ele;
        l.push_back(ele);
    } */

    
    cout<<"Enter num of element for inserting at beg: ";
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>ele;
        l.push_front(ele);}
        /*
    cout<<"Enter position for inserting ";
    int pos;
    cin>>pos;
    int element;
    cin>>element;
    list<int>::iterator it=l.begin();
    advance(it,pos);
    l.insert(it,element);
    */

    //deletetion at begin
    /*l.pop_front();

    */
   //deletion at end
    /*l.pop_back();*/

    //deletion at position
    /*int pos;
    cin>>pos;
    list<int>::iterator it=l.begin();
    advance(it,pos);
    l.erase(it);*/


    //for reverse
    /*l.reverse();
    */

    
    for(int i:l){
        cout<<i<<" ";
    }
    cout<<endl;
    return 0;
}