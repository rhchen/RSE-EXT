package net.izhtw.rse.subsystems.emulator.qemu.adapter;

import net.izhtw.rse.subsystems.emulator.core.model.Emulator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.rse.ui.view.AbstractSystemRemoteAdapterFactory;
import org.eclipse.rse.ui.view.ISystemViewElementAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

public class QemuSystemViewAdapterFactory extends AbstractSystemRemoteAdapterFactory implements IAdapterFactory{

	private QemuSystemViewAdapter qemuSystemViewAdapter = new QemuSystemViewAdapter();
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		
		ISystemViewElementAdapter adapter = null;
		
		if(adaptableObject instanceof Emulator){
			adapter = qemuSystemViewAdapter;
		}
		
		if ((adapter != null) && (adapterType == IPropertySource.class))
			  adapter.setPropertySourceInput(adaptableObject);
			return adapter;
	}

}
