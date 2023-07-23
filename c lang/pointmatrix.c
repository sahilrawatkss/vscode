#include<stdio.h>
void main(){
	
	
	int *pt,*ct,a[2][2],s;
	int b[2][2]; int add[2][2];
	
	printf("Enter the array for first matrix:\n");
	for(int i=0;i<2;i++)
	{    
		for(int j=0;j<2;j++){
		
	   scanf("%d",&a[i][j]);
       }
   }
   
   
   printf("Enter the array for second matrix:\n");
	for(int i=0;i<2;i++)
	{    
		for(int j=0;j<2;j++){
		
	   scanf("%d",&b[i][j]);
       }
   }    
   pt=a;
   ct=b;
   
   for(int i=0;i<2;i++)
   {
   	for(int j=0;j<2;j++)
   	{
   		
   		add[i][j]= *pt + *ct;
   		pt++;
   		ct++;
	   }
   }
   
   int *ad;
   ad=add;
   
    printf("Added matrix: \n");
	for(int i=0;i<2;i++)
	{    
		for(int j=0;j<2;j++){
		
	   printf("%d ",*ad);
	   ad++;
       }
       printf("\n");
   }
}
