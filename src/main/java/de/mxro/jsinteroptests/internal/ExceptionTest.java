package de.mxro.jsinteroptests.internal;

import com.google.gwt.core.client.JavaScriptObject;

import delight.gwt.console.Console;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(name = "ExceptionTest", namespace = JsPackage.GLOBAL)
public class ExceptionTest {

	public static void triggerTypeErrorWhenNull(Object object) {

		object.toString();
	}
	
	public static void throwJavaException() {
		throw new RuntimeException("Java Exception");
	}
	
	public static native void throwEx(String message)/*-{throw new Error(message); }-*/;
	
	public static void throwJsException() {
		throwEx("JavaScript exception");
	}
	
	public static native void trace()/*-{ console.trace(); }-*/;
	
	public static void writeTrace() {
		trace();
	}
	
	public static native String getTraceNative()/*-{ 
	try {
		throw new Error('Trace');
	} catch (e) {
		return e.stack;
	}
	
	 }-*/;
	
	public static String getTrace() {
		return getTraceNative();
	}
	
	public static native void rethrow(Object t)/*-{
	throw t;
	}-*/;
	
	public static native String getMessage(Object t)/*-{
	return t.message;
	}-*/;
	
}
