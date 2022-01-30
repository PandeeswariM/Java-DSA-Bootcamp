package com.hard.linkedlist;
import java.util.*;

public class All_O_one_DS_432 {
	class AllOne {
	    Map<String, Integer> ktof = new HashMap<>();
	    TreeMap<Integer, Set<String>> ftok = new TreeMap<>();
	    int min, max;
	    public AllOne() {
	        min = 0;
	        max = 0;
	    }
	    
	    public void inc(String k) {
	        if (!ktof.containsKey(k)) {
	            min = 1;
	            if (max == 0) max = 1;
	            ktof.put(k, 1);
	            ftok.computeIfAbsent(1, x -> new HashSet<>()).add(k);
	            return;
	        }
	        int freq = ktof.get(k);
	        ktof.put(k, freq+1);
	        ftok.get(freq).remove(k);
	        if (ftok.get(freq).size() == 0) ftok.remove(freq);
	        ftok.computeIfAbsent(freq+1, x -> new HashSet<>()).add(k);
	        
	        if (freq == max) max++;
	        if (freq == min && ftok.get(freq) == null) min++;
	    }
	    
	    public void dec(String k) {
	        int freq = ktof.get(k);
	        if (freq == 1) {
	            ktof.remove(k);
	            ftok.get(1).remove(k);
	            if (ftok.get(1).size() == 0) {
	                ftok.remove(1);
	                min = ktof.size() == 0 ? 0 : ftok.higherKey(min);
	            }
	            return;
	        }
	        ktof.put(k, freq-1);
	        ftok.get(freq).remove(k);
	        if (ftok.get(freq).size() == 0) ftok.remove(freq);
	        ftok.computeIfAbsent(freq-1, x -> new HashSet<>()).add(k);

	        if (freq == max && ftok.get(freq) == null) max--;
	        if (freq == min) min--;
	    }
	    
	    public String getMaxKey() {
	        return max == 0 ? "" : ftok.get(max).iterator().next();
	    }
	    
	    public String getMinKey() {
	        return min == 0 ? "" : ftok.get(min).iterator().next();
	    }
	    
	}

}
