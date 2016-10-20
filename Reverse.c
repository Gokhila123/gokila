#include<stdio.h>
#include<string.h>
void main()
{
char a[100],n;
int i=0,j=0;
printf("Enter the string ");
gets(a);
while(i<j) {
temp = str[i];
str[i] = str[j];
str[j] = temp;
i++;
j--;
}
printf("\n Reverse string is :%s", str);
return (0);
}


