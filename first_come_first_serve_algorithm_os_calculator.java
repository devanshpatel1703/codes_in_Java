import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.printf("Enter number of processes :");
        int n=input.nextInt();
        String[] pcs=new String[n];
        int[] bt=new int[n];
        int[] at=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter process name :");
            pcs[i]=input.next();
        }
        for(int i=0;i<n;i++){
            System.out.printf("Enter %s arrival time :",pcs[i]);
            at[i]=input.nextInt();
            System.out.printf("Enter %s brust time :",pcs[i]);
            bt[i]=input.nextInt();
        }
        int temp=0;
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(at[j-1] > at[j]){  
                    //Arrvial time array  
                    temp = at[j-1];  
                    at[j-1] = at[j];  
                    at[j] = temp;
                    temp=0;
                    //Brust time array
                    temp = bt[j-1];  
                    bt[j-1] = bt[j];  
                    bt[j] = temp;
                    String str="";
                    //Process array
                    str = pcs[j-1];  
                    pcs[j-1] = pcs[j];  
                    pcs[j] = str;
                }      
            }  
        }
        System.out.printf("Sorted processes according to arrival time.\n\n");
        for(int i=0;i<n;i++){
            System.out.printf("Process :%s   Arrival time :%d  Brust time :%d\n",pcs[i],at[i],bt[i]);
        }
        System.out.printf("\n\n");
        int[] ct=new int[n];
        ct[0]=bt[0];
        int duration=bt[0];
        for(int i=1;i<n;i++){
            if(duration<at[i]){
                ct[i]=at[i]+bt[i];
                duration=at[i]+bt[i];
            }
            else{
                duration+=bt[i];
                ct[i]=duration;
            }
        }
        int[] tat=new int[n];
        int[] wt=new int[n];
        for(int i=0;i<n;i++){
            tat[i]=ct[i]-at[i];
            wt[i]=tat[i]-bt[i];
        }
        System.out.printf("P    AT    BT    CT    TAT    WT\n");
        for(int i=0;i<n;i++){
            System.out.printf("%s    %d    %d    %d    %d    %d\n",pcs[i],at[i],bt[i],ct[i],tat[i],wt[i]);
        }
	}
}
