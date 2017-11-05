package de.mxro.jsinteroptests.internal;

public class ExceptionTestNative {
	public static native void throwJsExceptionDirectly()/*-{
														throw new Error('Direct JS Exception');
														}-*/;
}
