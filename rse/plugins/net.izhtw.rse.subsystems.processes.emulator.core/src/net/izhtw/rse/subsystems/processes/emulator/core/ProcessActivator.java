package net.izhtw.rse.subsystems.processes.emulator.core;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.subsystems.processes.servicesubsystem.IProcessServiceSubSystem;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ProcessActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		ProcessActivator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		ProcessActivator.context = null;
	}

	/**
     * Find the first IProcessServiceSubSystem service associated with the host.
     * 
     * @param host the connection 
     * @return shell service subsystem, or <code>null</code> if not found.
     */
    public static IProcessServiceSubSystem getEmulatorProcessServiceSubSystem(IHost host) {
        if (host == null)
            return null;
        ISubSystem[] subSystems = host.getSubSystems();
        for (int i = 0; subSystems != null && i < subSystems.length; i++) {
            if (subSystems[i] instanceof IProcessServiceSubSystem) {
                return (IProcessServiceSubSystem)subSystems[i];
            }
        }
        return null;
    }
}
