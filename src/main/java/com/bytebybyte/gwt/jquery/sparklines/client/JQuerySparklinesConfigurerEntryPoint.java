package com.bytebybyte.gwt.jquery.sparklines.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.bytebybyte.gwt.jquery.sparklines.client.resources.JQuerySparklinesClientBundle;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

public class JQuerySparklinesConfigurerEntryPoint implements EntryPoint {

	protected Logger logger = Logger.getLogger(JQuerySparklinesConfigurerEntryPoint.class.getName());

	@Override
	public void onModuleLoad() {

		JQuerySparklinesClientBundle bundle = JQuerySparklinesClientBundle.INSTANCE;

		logger.log(Level.INFO, "Injecting sparklines javascript script element.");

		ScriptInjector.fromString(bundle.sparklines().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
