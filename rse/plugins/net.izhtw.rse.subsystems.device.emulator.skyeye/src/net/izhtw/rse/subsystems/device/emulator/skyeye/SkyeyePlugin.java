package net.izhtw.rse.subsystems.device.emulator.skyeye;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SkyeyePlugin implements BundleActivator {

	public static final String PLUGIN_ID = "net.izhtw.rse.subsystems.device.emulator.skyeye";
	
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		SkyeyePlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		SkyeyePlugin.context = null;
	}

}
