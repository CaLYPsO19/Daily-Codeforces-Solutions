/*
Drinks
Little Vasya loves orange juice very much. That's why any food and drink in his kitchen necessarily contains orange juice. There are n drinks in his fridge, the volume fraction of orange juice in the i-th drink equals pi percent.

One day Vasya decided to make himself an orange cocktail. He took equal proportions of each of the n drinks and mixed them. Then he wondered, how much orange juice the cocktail has.

Find the volume fraction of orange juice in the final drink.
*/
import java.io.*;
public class drinks {
	public static void main(String[] args){		
	    try {	
	    	
	    	BufferedReader reader =new BufferedReader( new InputStreamReader( System.in)); // STDIN
	    	
	    	Integer nDrinks=Integer.valueOf(reader.readLine().trim());
	    	Integer[] percentages=new Integer[nDrinks];
	    	Integer sum=0;
	    	String[] str=reader.readLine().trim().split(" ",nDrinks);
	    	for(int i=0;i!=str.length;i++){
	    		percentages[i]=Integer.valueOf(str[i].trim()); 
	    		sum+=percentages[i]; }
	    	System.out.println((double)sum/percentages.length);
	    	
		    }catch(Exception e){
		    	e.printStackTrace(System.err);
		}
	}
}
