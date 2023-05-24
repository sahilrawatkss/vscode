#include<iostream>
#include<unordered_map>
#include<vector>
using namespace std;
vector<string> commonChar(vector<string> v)
{
    unordered_map<char,int> m1;
    for(char x='a';x<='z';x++)
        m1[x]=100;
    unordered_map<char,int> m2;
    for(int i=0;i<v.size();i++)
    {
        m2.clear();
        for(auto s:v[i])
            m2[s]++;
        for(char c='a';c<='z';c++)
            m1[c]=min(m1[c],m2[c]);
    }
    vector<string> ans;
    string s;
    for(char c='a';c<='z';c++)
    {
        int temp=m1[c];
        s=c;
        while(temp>0)
        {
            ans.push_back(s);
            --temp;
        }
    }
    return ans;
}
int main()
{
    vector <string> v = {"qweerty" , "weerty" , "eerty"};
    vector <string> ans=commonChar(v);
    for(auto x:ans)
    {
        cout<<x<<" ";
    }
}