package net.izhtw.rse.emulator.core;

import net.izhtw.rse.emulator.core.subsystems.IEmulatorSubSystem;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.subsystems.processes.servicesubsystem.IProcessServiceSubSystem;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class CoreActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		CoreActivator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		CoreActivator.context = null;
	}

	public static ISubSystem getEmulatorSubSystem(IHost host, Class<ISubSystem> clazz) {
        
		if (host == null) return null;
        
		ISubSystem[] subSystems = host.getSubSystems();
        
		for (int i = 0; subSystems != null && i < subSystems.length; i++) {
        	
        	if(clazz.isInstance(subSystems[i])) return clazz.cast(subSystems[i]);
        	
        }
		
        return null;
    }
	
	public static IEmulatorSubSystem getEmulatorSubSystem(IHost host) {
        
		if (host == null) return null;
        
		ISubSystem[] subSystems = host.getSubSystems();
        
		for (int i = 0; subSystems != null && i < subSystems.length; i++) {
            
			if (subSystems[i] instanceof IEmulatorSubSystem) return (IEmulatorSubSystem)subSystems[i];
        }
		
        return null;
    }

	public static IProcessServiceSubSystem getEmulatorProcessServiceSubSystem(IHost host) {
        
		if (host == null) return null;
        
		ISubSystem[] subSystems = host.getSubSystems();
        
		for (int i = 0; subSystems != null && i < subSystems.length; i++) {
            
			if (subSystems[i] instanceof IProcessServiceSubSystem) return (IProcessServiceSubSystem)subSystems[i];
        }
		
        return null;
    }
}
