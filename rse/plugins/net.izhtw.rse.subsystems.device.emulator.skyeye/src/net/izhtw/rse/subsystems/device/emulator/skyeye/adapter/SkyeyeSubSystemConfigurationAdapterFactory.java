package net.izhtw.rse.subsystems.device.emulator.skyeye.adapter;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.rse.ui.subsystems.ISubSystemConfigurationAdapter;

import net.izhtw.rse.subsystems.device.emulator.skyeye.subsystem.SkyeyeSubSystemConfiguration;

public class SkyeyeSubSystemConfigurationAdapterFactory implements
		IAdapterFactory {

	private ISubSystemConfigurationAdapter ssConfigAdapter = new SkyeyeSubSystemConfigurationAdapter();
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		
		Object adapter = null;
	    
		if (adaptableObject instanceof SkyeyeSubSystemConfiguration)
	    	adapter = ssConfigAdapter;
	      	    
		return adapter;
	
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList() {
		
		return new Class[] {ISubSystemConfigurationAdapter.class};	
		
	}

	public void registerWithManager(IAdapterManager manager)
	{
		manager.registerAdapters(this, SkyeyeSubSystemConfiguration.class);
	}
}
