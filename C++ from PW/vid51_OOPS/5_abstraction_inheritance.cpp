/*Abstraction 
enables us to display only essential information while hiding implementation detaills
ex. pow(x,y) = x^y*/


/*inheritance

1.protected: 
-> accessible in own class
->parent class & derived class

2. private:

->accesible only in own class
*/
/*
#include<iostream>
using namespace std;

class parent{
    public:
    int x;
    protected:
    int y;
    private:
    int z;
};

class child1: public parent{
    //x will remain public
    //y will remain protected
    //z will remain accessible
};

class child2: private parent{
    //x will remain private
    //y will remain private
    //z will remain inaccesible
    
};
class child3: protected parent{
    //x will remain protected
    //y will remain protected
    //z will remain inaccesible 
    
};
int main(){
    parent p;
    p.x;
    
    
    return 0;
}*/





// TYPES OF INHERITANCE
//single inhe.

//class A  <-  class B

/*
#include<iostream>
using namespace std;
class Parent{
    public:
    Parent(){
        cout<<"Parent class"<<endl;
    }
};

class child: public Parent{
    public:
    child(){
        cout<<"child class"<<endl;
    }
};

int main(){
    child c;
    
    return 0;
}*/


//Multi-Level inhe

// class A  -< class B  <-  class C
/*
#include<iostream>
using namespace std;
class Parent{
    public:
    Parent(){
        cout<<"Parent class"<<endl;
    }
};

class child: public Parent{
    public:
    child(){
        cout<<"child class"<<endl;
    }
};

class GrandChild: public child{
    public:
    GrandChild(){
        cout<<"Grandchild class"<<endl;
    }
};

int main(){
    GrandChild gc;
    
    return 0;
    }
*/


//MULTIPLE INHER.
/*
class a   class b
  \       /
    \    /
    class c
*/
/*
#include<iostream>
using namespace std;
class Parent1{
    public:
    Parent1(){
        cout<<"Parent1 class"<<endl;
    }
};
class Parent2{
    public:
    Parent2(){
        cout<<"Parent2 class"<<endl;
    }
};

class child: public Parent1,public Parent2{   
    public:
    child(){
        cout<<"child class"<<endl;
    }
};

class GrandChild: public child{
    public:
    GrandChild(){
        cout<<"Grandchild class"<<endl;
    }
};

int main(){
    GrandChild gc;
    
    return 0;
    }

*/


//HIERARCHICAL INHERITANCE
// ONE CLASS MULTIPLE CHILD CLASS 
/*
            CLASS A
            /      \
        CLASS B   CLASS C

*/

/*
#include<iostream>
using namespace std;
class Parent1{
    public:
    Parent1(){
        cout<<"Parent1 class"<<endl;
    }
};
class Parent2{
    public:
    Parent2(){
        cout<<"Parent2 class"<<endl;
    }
};

class child1: public Parent1{   
    public:
    child1(){
        cout<<"child1 class"<<endl;
    }
};

class child2: public Parent1{   
    public:
    child2(){
        cout<<"child2 class"<<endl;
    }
};


int main(){
    child1 gc;
    
    return 0;
    }*/




//HYBRID INHER.

/*
            CLASS A 
            /      \
        CLASS B   CLASS C
                    |
                CLASS D
                
*/