#include<stdio.h>
int main(){
	
	printf("Sahil Rawat\t MCA A \t 28\n\n");
	int *pt; int a[5];int i,j,s;
	int flag=0;
	
	printf("Enter 5 Values in array: ");
	for(i=0;i<5;i++)
	{
	   scanf("%d",&a[i]);
    }
    
    pt=a;
    
    
    
	printf("Enter number to search: ");
	scanf("%d",&s);
	

    for(pt; pt< &a[4]; pt++)
    {
    	if(s==*pt)
    	{
    	flag=1;	
    	break;
		}
	
	}
	
	
	if(flag){
	printf("%d is present in array\n\n",s);
}
else{
	
	printf("%d is not present in array",s);
}

}
