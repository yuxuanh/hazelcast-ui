/**
 * Name           : HazelcastMapLoader.java
 * Type           : JAVA
 * Purpose        : Entry point to load sample map into hazelcast
 * Description    : 
 * Mod Log
 * Date		    By		         	Jira			Description
 * ----------- 	----------------- 	---------- 		---------------	
**/

package com.impetus.hazelcast;

import java.util.Map;

import org.slf4j.Logger;

/**
 * Entry point for loading sample hazelcast maps
 * @author pushkin.gupta
 *
 */
public class HazelcastMapLoader {
	
	private static Logger logger = LogUtils.getLogger(HazelcastMapLoader.class);
	private static Map<String, String> testMap;
	
	public static void main(String[] args) {
		HazelcastMapLoader.loadHazelCastMap();
	}
	
	public static void loadHazelCastMap() {
		logger.info("Going to load hazelcast maps");
		
		Reader cacheInst = null;
		
		cacheInst = new Reader();
		testMap = cacheInst.initializeTestMap();
		for(int i=0;i<1000;i++) {
			testMap.put("Key"+i,"Value"+i);
		}
		logger.info("Loaded hazelcast maps");
	}
	
	public static Map<String,String> getTestMap() {
		return testMap;
	}
	
}
