/*
 * $Id$
 *
 * Copyright (c) 2014  Pegasystems Inc.
 * All rights reserved.
 *
 * This  software  has  been  provided pursuant  to  a  License
 * Agreement  containing  restrictions on  its  use.   The  software
 * contains  valuable  trade secrets and proprietary information  of
 * Pegasystems Inc and is protected by  federal   copyright law.  It
 * may  not be copied,  modified,  translated or distributed in  any
 * form or medium,  disclosed to third parties or used in any manner
 * not provided for in  said  License Agreement except with  written
 * authorization from Pegasystems Inc.
*/

package test.problems;
public class TextSearch {
	
	public static void main(String[] args) {
		String text = "123456789";
		String search = "4568";
		System.out.println("Pattern:"+search+" "+searchText(text,search,text.length(),search.length())+" in:"+text);

	}
	private static boolean searchText(String lText, String lSearch, int textLength, int searchLength){
		boolean result = false;
		
		for(int i=0;i<(textLength-searchLength);i++){
			//for each substring start compare with search string
			result = compare(lText.substring(i,i+searchLength),lSearch);
			if(result){
				break;
			}
		}
		return result;
	}
	private static boolean compare(String lText, String lSearch) {
		char [] text = lText.toCharArray();
		char [] search = lSearch.toCharArray();
		boolean found = false;
		for(int i=0;i<search.length;i++){
			if(text[i] == search[i]){
				if(i==search.length-1){
					found=true;
					break;
				}
				else
					continue;
			}
			else 
				break;
		}
		return found;
		
	}

}
