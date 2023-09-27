#include<iostream>
#include<stack>
using namespace std;

int func(char a)
{
    switch(a)
    {
        case '+':
        case '-':
        return 1;
        case '*':
        case '/':
        return 2;
        case '^':
        return 3;
        default :
        return -1;
    }
}
int main()
{
    string str="a+b*(c^d-e)^(f+g*h)-i";
    string ans="";
    stack<char> stk;

    for(int i=0;i<str.size();i++)
    {
        if(isalpha(str[i]))
        {
            ans.push_back(str[i]);
        }
        else if(str[i]=='(')
        {
            stk.push('(');
        }
        else if()
        {
            stk.push(str[i]);
        }
    }
}