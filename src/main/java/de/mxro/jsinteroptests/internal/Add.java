package de.mxro.jsinteroptests.internal;

import com.google.gwt.core.client.JavaScriptObject;

import delight.gwt.console.Console;
import jsinterop.annotations.JsOptional;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(name = "Add", namespace = JsPackage.GLOBAL)
public class Add {

	public static void add(String firstParam, @JsOptional Double number) {
		if (number != null) {
			Console.log(wrap(number));
			Console.log("" + number.getClass());
		}

	}

	private static final native JavaScriptObject wrap(Object o)/*-{ return o; }-*/;

}
