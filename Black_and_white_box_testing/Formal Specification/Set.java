package main.java;

import java.util.ArrayList;

public class Set {

	 public ArrayList<Integer> a;

	    public Set() {
	        a = new ArrayList<Integer>();
	    }
	    /*
	    protected  ArrayList<Integer> getA(){
	        return  a;
	    }
	    */
	    public int[] toArray() {
	        int[] ia = new int[a.size()];
	        for (int i = 0; i < ia.length; i++) {
	            ia[i] = a.get(i);
	        }
	        return ia;
	    }
	    public void insert(int x) {
	    	
	        boolean found = false;
	    	if(a.size()==0){
	        	System.out.println("empty list");
	        	a.add(x);
	        }
	        else {
	        	for (int i = 0; i < a.size(); i++) {
	        		if(a.get(i)==x){
	        			found=true;
	        		}
	        	}
	        	
	        	if(!found){
		        	for (int i = 0; i < a.size(); i++) {
		        		if(a.get(i) > x){
			              	a.add(i, x);
			                break;
			            } else if (a.get(i) < x){
			            	if(i == a.size()-1){
			            		a.add(i+1,x);
			            	}
			            	
			            }
		        	}
	        		
	        	}
	                
	         }
	       
	        System.out.println(a);
	    }

	   
	    public boolean member(int x) {
	        for (int i = 0; i < a.size(); i++) {
	            if (a.get(i) == x) {
	                    return true;
	             }
	            
	        }
	        return false;
	    }

	    public void section(Set s) {
	        for (int i = 0, j = 0; i < a.size() && j < s.a.size();) {
	            
	        	if (a.get(i)== s.a.get(j)) {
	        		a.remove(i);
	                j++;
	                System.out.println("A is: "+a);
	            } else {
	                if (a.get(i) < s.a.get(j)) {
	                	
	                    i++;
	                } else {
	                	
	                    j++;
	                }
	            }
	        }
	        
	    }

	    public boolean containsArithTriple() {
	        for (int i = 0; i < a.size(); i++) {
	        	
	        	ArrayList<Integer> b = new ArrayList<Integer>();
	        	b = a;
	        	b.remove(a.get(i));
	        	
	        	for (int j = 0; j < b.size(); j++) {
	                if (member(2 * a.get(i) - b.get(j))) 
	                	return true;
	            }
	        	
	        }
	        return false;
	    }
}
