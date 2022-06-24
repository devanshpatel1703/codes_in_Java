#include<math.h>
#include <stdio.h>
int main() 
{
    int n,temp;
    printf("Enter the number :");
    scanf("%d",&n);
    int size=log2(n);
    int arr[size+1];
    int i=0,bit;
    while(n>0){
        bit=n%2;
        arr[i]=bit;
        n/=2;
        i++;
    }
    for(i=0;i<(size+1)/2;i++){
        temp=arr[i];
        arr[i]=arr[size-i];
        arr[size-i]=temp;
    }
    printf("Bit size->  ");
    for(i=0;i<size+1;i++){
        printf("%d ",size+1-i);
    }
    printf("\n");
    printf("The array-> ");
    for(i=0;i<size+1;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}
