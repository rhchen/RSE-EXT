package net.izhtw.rse.subsystems.device.emulator.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EmulatorActivator implements BundleActivator {

	public static final String PLUGIN_ID = "net.izhtw.rse.subsystems.device.emulator.core";
	
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		EmulatorActivator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		EmulatorActivator.context = null;
	}

}
