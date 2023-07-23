#include<stdio.h>
struct stu{
	int n;
	float f;
	char str[8];
};
union uni{
	int n;
	float f;
	char str[8];
};
void main(){
	struct stu s={11,0.5,"Hello"};
	union uni u={11,0.5,"Hello"};
	printf("Sahil Rawat\t MCA A \t 28\n\n");
	printf("Structure Data\n");
	printf("%d\n%.2f\n%s\n",s.n,s.f,s.str);
	
	printf("\nUnion Data\n");
	printf("%d\n%.2f\n%s",u.n,u.f,u.str);
	printf("\n\nSize of Structure: %d",sizeof(s));
	printf("\nSize of Union: %d\n\n",sizeof(u));
}
