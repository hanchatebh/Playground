#include<stdio.h>
int main()
{
  int year,lyear;
  scanf("%d",&year);
  lyear=year%4;
  	if(lyear==0)
    {
      printf("Leap year");
    }
  	else
    {
      printf("Not Leap year");
    }
  //Type your code here
  return 0;
}