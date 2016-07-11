
// write a code for modified bubble sort

public int kthLargest(int[] A, int k){
    int[] sorted = A;
    int temp;
    bool bSorted = TRUE;
    for (int i = (A.length - 1); i >= 0; i--)
    {
      bSorted = true;
      for (int j = 1; j <= i; j++)
      {
         if (sorted[j-1] < sorted[j])
         {
              temp = sorted[j-1];
              sorted[j-1] = sorted[j];
              sorted[j] = temp;
              bSorted = FALSE;
         }
      }
      if(bSorted)
          break;
   }
   return sorted[k-1];
}

----------------------------Method - 2------------------------------------------

#include<stdio.h>
void swap(int *b,int *c)
{
  int x;
  x=*b;
  *b=*c;
  *c=x;
}
void main ()
{
  int a[10],i,j,flag;

  printf("enter the unsorted elements\n");

  for(i=0;i<5;i++)
    scanf("%d",&a[i]);

  for(i=0;i<5;i++)
  {
      flag=0;
      for(j=0;j<4-i;j++)
      {
          if(a[j]>a[j+1])
          {
              flag=1;
              swap(&a[j],&a[j+1]);
          }
      }
      if(flag==0)
        break;
  }

  printf("sorted elements are\n");
  for(i=0;i<5;i++)
    printf("%d\n",a[i]);
}
