package net.izhtw.rse.subsystems.emulator.skyeye.adapter;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import net.izhtw.rse.subsystems.emulator.local.adapter.EmulatorSystemViewAdapter;
import net.izhtw.rse.subsystems.emulator.skyeye.subsystem.SkyeyeSubSystemConfiguration;

public class SkyeyeSystemViewAdapter extends EmulatorSystemViewAdapter {

	@Override
	public Object[] getChildren(IAdaptable element, IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return super.getChildren(element, monitor);
	}

	@Override
	protected IPropertyDescriptor[] internalGetPropertyDescriptors() {
		// TODO Auto-generated method stub
		return super.internalGetPropertyDescriptors();
	}

	@Override
	protected Object internalGetPropertyValue(Object key) {
		// TODO Auto-generated method stub
		return super.internalGetPropertyValue(key);
	}

	@Override
	public String getSubSystemConfigurationId(Object element) {
		return SkyeyeSubSystemConfiguration.SUBSYSTEM_CONFIGURATION_ID;
	}

}
