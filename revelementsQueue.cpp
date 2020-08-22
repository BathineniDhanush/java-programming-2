#include<iostream>
#include<queue>
#include<stack>
using namespace std;
void rq(queue<int>& Queue)
{
	if(Queue.empty()==true)
	{
		return;
	}
    stack<int> Stack;
    for(int i=0;i<sizeof(Queue);i++)
    {
    	Stack.push(Queue.front());
    	Queue.pop();
	}
	while(!Stack.empty())
	{
		Queue.push(Stack.top());
		Stack.pop();
	}
	
}
void Print(queue<int> & Queue)
{
	while(!Queue.empty())
	{
		cout<<Queue.front()<<" ";
		Queue.pop();
	}
}
int main()
{
	queue<int> Q;
	int k=3;
	Q.push(10);
	Q.push(20);
	Q.push(30);
	Q.push(40);
	Q.push(50);
	Q.push(60);Q.push(70);
	Q.push(80);
	Q.push(90);
	Q.push(100);
	rq(Q);
	Print(Q);
}
