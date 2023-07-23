#include<stdio.h>
void main()
{
	printf("Sahil Rawat\tMCA A\t28\n\n");
	int amount,ch,r500,r100,r50,r20,r10,r5,r2,r1;
	r500=r100=r50=r20=r10=r5=r2=r1=0;
	printf("enter the amount: ");
	scanf("%d",&amount);
	
		switch(1)
	{
		case 1:
			r500 = amount/500;
        	amount -= r500 * 500;
        case 2:
        	r100= amount/100;
        	amount-=r100*100;
		case 3:
			r50 = amount/50;
        	amount -= r50 * 50;
        case 4:
        	r20 = amount/20;
        	amount -= r20 * 20;
        case 5:
        	r10= amount/10;
        	amount -= r10 * 10;
        case 6:
        	r5 = amount/5;
        	amount -= r5 * 5;
        case 7:
        	r2 = amount/2;
        	amount -= r2 * 2;
        default:
        	r1 = amount/1;
        	amount -= r1 * 1;
	}
	
	printf("500 notes :%d\n100 notes :%d\n50 notes  :%d\n20 notes  :%d\n10 notes  :%d\n5 notes   :%d\n2 notes   :%d\n1 notes   :%d\n",r500,r100,r50,r20,r10,r5,r2,r1);
}
