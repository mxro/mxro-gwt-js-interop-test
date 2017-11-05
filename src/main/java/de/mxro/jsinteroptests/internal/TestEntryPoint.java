package de.mxro.jsinteroptests.internal;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

import delight.gwt.console.Console;

public class TestEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Console.log("Setting excpetion handler");
		GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
			public void onUncaughtException(Throwable e) {
				
				Console.log(e.getClass().toString());
				Console.log("Processing it "+e);
				for (StackTraceElement elem : e.getStackTrace()) {
					Console.log(elem.getFileName()+" "+elem.getMethodName());
				}
			}
			
		});
	}

}
