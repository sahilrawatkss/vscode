#include<stdio.h>
struct stu{
	int a;
	int b;
};
void func(struct stu x,struct stu y){
	int p=x.a + y.a;
	int q=x.b + y.b;
	printf("\nAddition: %d + %di\n\n",p,q);
}

void main(){
	struct stu s1,s2;
	printf("Sahil Rawat\t MCA A \t 28\n\n");
	printf("Enter Complex number\n");
	printf("(Enter Real part then imaginary part):\n");
	scanf("%d%d",&s1.a,&s1.b);
	scanf("%d%d",&s2.a,&s2.b);
	func(s1,s2);
}

