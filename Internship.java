import java.util.*;
public class Internship{

    public static void main(String [] args){
    
    int [] A ={4,5,10,11,6};
    
    int M = -1;
    ArrayList rezultat = scoatePerechi(A,M);
    afisareRezultate(rezultat);
    
    
    }
    public static ArrayList<int []> scoatePerechi(int [] A, int M){
        ArrayList<int []> rezultate=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                
                if( (A[i] - A[j]) == M){
                     int [] x = {A[i],A[j]};
                     rezultate.add(x);
                }
            }
        }
        if( rezultate.isEmpty()){
            
            System.out.println("lista goala");
        } 
        
        return rezultate;
        
    }
    
    public static void afisareRezultate(ArrayList<int []> R){
        for(int[] c :R){
            System.out.println(c[0] +"-" +c[1]);
        }
    }
}