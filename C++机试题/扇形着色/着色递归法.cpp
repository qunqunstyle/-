    #include "stdio.h"
    #include "math.h"
     
    int recurve(int n,int m){
    	int kinds;
    	if(n==1){
    		kinds = m;
    	}
    	if (n==2){
    		kinds = m*(m-1);
    	}
    	if (n==3){
    		kinds = m*(m-1)*(m-2);
    	}
    	if (n>3){
    		//kinds = m*pow(m-1,n-1) - recurve(n-1,m);
    		kinds = recurve(n-1,m)*(m-2) + recurve(n-2,m)*(m-1);
    	}
    	return kinds;
    }
     
    int main()
    {
        int n;
        int m=4; 
        int kind;  
        scanf("%d",&n); 
    	kind = recurve(n,m);	
        printf("%d",kind);   	  
    }
