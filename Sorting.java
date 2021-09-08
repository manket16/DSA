/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    
    
     static void swap(int a[], int l, int r){
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }
    
    
   private static void bubble(int a[]){
        int n= a.length;
        for(int i=0; i<n;i++){
            for(int j=1;j<n;j++){
                if(a[j-1]>a[j])
                  swap(a,j,j-1);
            }
        }
        
    }
    
    
   private static void selection(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                min = j;
            }
            
            swap(a,i,min);
        }
    }
    
    
    static void mergesort(int a[],int l, int h ){
        if(l<h){
        int mid = (l+h)/2;
        mergesort(a,l,mid);
        mergesort(a,mid+1,h);
        merge(a,l,mid,h);
            
        }
        
       
        
    }
    
    static void merge(int a[], int l, int mid, int h){
        int b[] = new int[a.length];
        int i = l;
        int j = mid+1;
        int k = l;
        
        while(i<=mid && j<= h){
            if(a[i]<a[j]){
                b[k] = a[i];
                i++;
                
            }
            else{
                b[k] = a[j];
                j++;
                
            }
            k++;
        }
        
        if(i>mid){
            while(j<=h){
                b[k] = a [j];
                k++;
                j++;
            }
        }
        else{
            while(i<=mid){
                b[k] = a[i];
                i++;
                k++;
            }
        }
         for(k=l;k<=h;k++){
            a[k] = b[k];
        }
    }
    
   
    
    
    
    
    
    
    
    
    
	public static void main(String[] args) {
	    int a[] = {3,5,2,8,10,1,7,11,9};
	    mergesort(a,0,a.length-1);
	    System.out.println(Arrays.toString(a));
		
	}
}
