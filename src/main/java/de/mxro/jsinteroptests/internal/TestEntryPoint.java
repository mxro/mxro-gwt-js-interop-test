package de.mxro.jsinteroptests.internal;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class TestEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		GWT.create(Add.class);
		
	}

}
