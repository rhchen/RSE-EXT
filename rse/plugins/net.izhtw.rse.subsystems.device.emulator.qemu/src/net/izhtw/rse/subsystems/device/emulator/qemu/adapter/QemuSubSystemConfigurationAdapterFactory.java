package net.izhtw.rse.subsystems.device.emulator.qemu.adapter;

import net.izhtw.rse.subsystems.device.emulator.qemu.subsystem.QemuSubSystemConfiguration;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.rse.ui.subsystems.ISubSystemConfigurationAdapter;

/**
 * @see IAdapterFactory
 */
public class QemuSubSystemConfigurationAdapterFactory implements IAdapterFactory {

	private ISubSystemConfigurationAdapter ssConfigAdapter = new QemuSubSystemConfigurationAdapter();
	
	/**
	 * @see IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		Object adapter = null;
	    if (adaptableObject instanceof QemuSubSystemConfiguration)
	    	adapter = ssConfigAdapter;
	      	    
		return adapter;
	}

	/**
	 * @see IAdapterFactory#getAdapterList()
	 */
	@SuppressWarnings("unchecked")
	public Class<ISubSystemConfigurationAdapter>[] getAdapterList() 
	{
	    return new Class[] {ISubSystemConfigurationAdapter.class};		
	}

	public void registerWithManager(IAdapterManager manager)
	{
		manager.registerAdapters(this, QemuSubSystemConfiguration.class);
	}
}
