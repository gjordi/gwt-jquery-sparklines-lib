package com.bytebybyte.gwt.jquery.sparklines.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface JQuerySparklinesClientBundle extends ClientBundle {

	public final static JQuerySparklinesClientBundle INSTANCE = GWT.create(JQuerySparklinesClientBundle.class);

	@Source("sparklines/js/jquery.sparkline.min.js")
	TextResource sparklines();

}
