package kr.younnhome.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class WelcomeLambda implements RequestHandler<Object,Object>
{
	public Object handleRequest(Object input, Context context) {
		System.out.println("Welcome to lambda function");
		return null;
	}
}
