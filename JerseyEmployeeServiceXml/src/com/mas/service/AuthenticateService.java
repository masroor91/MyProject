package com.mas.service;

import java.util.StringTokenizer;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class AuthenticateService {
	
	//Basic encryptedUsername:encryptedPassword
	
	public boolean isValidUser(String authenticateString){
		boolean flag = false;
		
		if (authenticateString == null){
			flag= false;
		}
		else{
		
			String encodedUsernamePassword = authenticateString.replace("Basic", "");
		
			try{
				byte[] decodeUserPass= Base64.decode(encodedUsernamePassword); //xyz:abc
				String decodedUserPas= new String(decodeUserPass, "UTF-8");  //un:pas
			
				StringTokenizer tokenizer = new StringTokenizer(decodedUserPas, ":");
			
				String userName= tokenizer.nextToken();
				String password= tokenizer.nextToken();
				
				System.out.println(userName+ " " + password);
			
				if (userName.equals("mvr") && password.equals("@mvr")){
					flag= true;
				}
				else{
					flag= false;
				}
			}
			catch(Exception e){
				e.printStackTrace();
				flag=false;
			}
		}
		
		return flag;
	}
}
