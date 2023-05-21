#include <iostream>
#include<vector>
using namespace std;

int main() 
{
    vector<int> v;
    v.push_back(8);
    v.push_back(1);
    v.push_back(2);
    v.push_back(2);
    v.push_back(3);
    vector<pair<int,int>> v2;
    for(int i=0;i<v.size();i++)
    {
        v2.push_back({v[i],i});
    }

    for(int i=0;i<v.size();i++)
    {
        cout<<v2[i].second<<" ";
    }
        return 0;
}