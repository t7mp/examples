package com.googlecode.t7mp.extlib;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple Test to invoke the webapplication in an
 * Integration-Test.
 * 
 * @author Joerg Bellmann
 *
 */
public class ResolveVersionIT {
	
	private static final Logger logger = LoggerFactory.getLogger(ResolveVersionIT.class);
	
	@Test
	public void testResolveVersion() throws ClientProtocolException, IOException{
		DefaultHttpClient client = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet("http://localhost:9091/external-libs");
		client.execute(getRequest, new ResponseHandler<Void>(){
			@Override
			public Void handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
				int statusCode = response.getStatusLine().getStatusCode();
				logger.info("Server returned statusCode: {}", statusCode);
				if(statusCode == HttpStatus.SC_OK){
					String result = EntityUtils.toString(response.getEntity(), Charset.defaultCharset());
					logger.info("Server returned: '{}'", result);
				}
				return null;
			}
		});
	}

}
