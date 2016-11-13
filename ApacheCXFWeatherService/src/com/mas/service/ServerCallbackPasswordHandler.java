package com.mas.service;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class ServerCallbackPasswordHandler implements CallbackHandler {

	@Override
	public void handle(Callback[] callback) throws IOException, UnsupportedCallbackException {
		
		WSPasswordCallback pc= (WSPasswordCallback)  callback[0];
		
		if(pc.getUsage()== WSPasswordCallback.USERNAME_TOKEN){
			if (pc.getIdentifier().equals("mvr"))
				pc.setPassword("@nit");
		}
		
	}

}
