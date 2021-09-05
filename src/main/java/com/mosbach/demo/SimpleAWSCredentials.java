package com.mosbach.demo;

import com.amazonaws.auth.AWSCredentials;

public class SimpleAWSCredentials implements AWSCredentials {

	 @Override
	    public String getAWSAccessKeyId() {
	        return "wrong";
	    }

	    @Override
	    public String getAWSSecretKey() {
	        return "very_wrong";
	    }

}
