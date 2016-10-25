#include<stdio.h>
#include<conio.h>
bool isSubset(int arr[], int arr1[], int m, int n)
{
  
    for ( int i=0; i<n; i++)
    {
        for ( int j = 0; j<m; j++)
        {
           if(arr[i] == arr1[j])
              break;
        }
     
        if (m == j)
           return 0;
    }
    return 1;
}
 
int main()
{
    int arr[] = {11, 1, 3, 7};
    int arr1[] = {11, 3,13, 21,7, 1};
  
    int m = sizeof(arr1)/sizeof(arr1[0]);
    int n = sizeof(arr)/sizeof(arr[0]);

    if(isSubset(arr1, arr2, m, n))
      printf("arr[] is subset of arr1[] ");
    else
      printf("arr[] is not a subset of arr1[]");      

    getchar();
    return 0;
}
