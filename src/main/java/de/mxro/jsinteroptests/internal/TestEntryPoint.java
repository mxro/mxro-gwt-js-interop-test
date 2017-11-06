package de.mxro.jsinteroptests.internal;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class TestEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
//		ExceptionTestNative.throwJsExceptionDirectly();
		
		GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
			
			public void onUncaughtException(Throwable e) {
				
				
				Console.log("Stacktrace for following error:");
				Console.log(ExceptionTest.getTrace());
				
				ExceptionTest.rethrow(e);
				
			}
			
		});
	}

}
