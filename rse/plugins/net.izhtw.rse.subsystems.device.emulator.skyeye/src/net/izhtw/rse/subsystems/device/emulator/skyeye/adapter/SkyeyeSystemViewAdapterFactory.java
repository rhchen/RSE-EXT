package net.izhtw.rse.subsystems.device.emulator.skyeye.adapter;

import net.izhtw.rse.subsystems.device.emulator.core.model.Emulator;

import org.eclipse.rse.ui.view.AbstractSystemRemoteAdapterFactory;
import org.eclipse.rse.ui.view.ISystemViewElementAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

public class SkyeyeSystemViewAdapterFactory extends
		AbstractSystemRemoteAdapterFactory {

	private SkyeyeSystemViewAdapter skyeyeSystemViewAdapter = new SkyeyeSystemViewAdapter();
	
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		
		ISystemViewElementAdapter adapter = null;
		
		if(adaptableObject instanceof Emulator){
			adapter = skyeyeSystemViewAdapter;
		}
		
		if ((adapter != null) && (adapterType == IPropertySource.class))
			  adapter.setPropertySourceInput(adaptableObject);
			return adapter;
	}

}
