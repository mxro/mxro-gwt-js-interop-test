package de.mxro.jsinteroptests.internal;

import com.google.gwt.core.client.JavaScriptObject;

import delight.gwt.console.Console;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(name = "Read", namespace = JsPackage.GLOBAL)
public class Read {

	public static native Object resolve(JavaScriptObject o)/*-{ return o; }-*/;
	
	public static native void throwEx(String message)/*-{throw new Error(message); }-*/;
	
	public static native void trace()/*-{ console.trace(); }-*/;
	
	public static void assumeNotNull(Object object) {
		trace();
//		if (object == null) {
//			throwEx("Hi there");
//			return;
//		}
		object.toString();
	}
	
	public static void value(Object... some) {
		if (some != null && some.length > 0) {
			
			if (some[0] instanceof JavaScriptObject[]) {
				Console.log("Is js object array");
				JavaScriptObject[] arr = (JavaScriptObject[]) some[0];
				
				Object resolved = resolve(arr[0]);
				Console.log(wrap(resolved));
				Console.log("Class: " + resolved.getClass());
				
			}
			
			
		}

	}

	private static final native JavaScriptObject wrap(Object o)/*-{ return o; }-*/;

}
