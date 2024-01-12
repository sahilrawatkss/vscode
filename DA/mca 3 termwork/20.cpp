#include<iostream>

using namespace std;

#include<map>;
#include<vector>;

bool check(vector<int> v)
{
	map<int,int> mp;
	for(int i=0;i<9;i++)
	{
		mp[v[i]]++;
		if(mp[v[i]]>9/2)
		{
			return true;
		}
	}
	return false;
}

int main()
{
	vector<int> v;
	for(int i=0;i<9;i++)
	{
		int num;
		cin>>num;
		v.push_back(num);	
	}
	if(check(v))
	{
		cout<<"true";
	}
	else
	{
		cout<<"false";
	}
	cout<<"\n"<<v[9/2];
}
