package net.izhtw.rse.subsystems.emulator.core;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EmulatorActivator implements BundleActivator {

	public static final String PLUGIN_ID = "net.izhtw.rse.subsystems.emulator.core";
	
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
