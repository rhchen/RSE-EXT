package net.izhtw.rse.subsystems.device.emulator.ui.adaptor;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rse.ui.SystemMenuManager;
import org.eclipse.rse.ui.view.AbstractSystemViewAdapter;
import org.eclipse.rse.ui.view.ISystemRemoteElementAdapter;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;

import net.izhtw.rse.subsystems.device.emulator.core.EmulatorConstants;
import net.izhtw.rse.subsystems.device.emulator.core.model.Emulator;
import net.izhtw.rse.subsystems.device.emulator.ui.EmulatorPlugin;

public abstract class EmulatorSystemViewAdapter extends AbstractSystemViewAdapter implements ISystemRemoteElementAdapter{

	@Override
	public String getText(Object element) {
		return ((Emulator) element).getName();
	}

	@Override
	public String getAbsoluteName(Object object) {
		return getText(object);
	}

	@Override
	public String getAbsoluteParentName(Object element) {
		return null;
	}
	
	@Override
	public void addActions(SystemMenuManager menu,
			IStructuredSelection selection, Shell parent, String menuGroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object element) {
		return EmulatorPlugin.getDefault().getImageDescriptor("ICON_QEMU");
	}

	@Override
	public String getType(Object element) {
		return EmulatorConstants.TYPE;
	}

	@Override
	public String getRemoteType(Object element) {
		return EmulatorConstants.TYPE;
	}

	@Override
	public String getRemoteSubType(Object element) {
		return null;
	}

	@Override
	public String getRemoteTypeCategory(Object element) {
		return EmulatorConstants.TYPE_CATEGORY;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(IAdaptable element) {
		return false;
	}

	@Override
	public Object[] getChildren(IAdaptable element, IProgressMonitor monitor) {
		return null;
	}

	@Override
	protected IPropertyDescriptor[] internalGetPropertyDescriptors() {
		
		PropertyDescriptor[] pd = new PropertyDescriptor[1];
	
		pd[0] = new PropertyDescriptor(EmulatorConstants.EMULATOR_PROPERTY_KEY_NAME, EmulatorConstants.EMULATOR_PROPERTY_KEY_NAME);
		
		pd[0].setDescription(EmulatorConstants.EMULATOR_PROPERTY_KEY_NAME_DESCRIPTION);
		
		return pd;
	}

	@Override
	protected Object internalGetPropertyValue(Object key) {
		
		Emulator emulator = (Emulator) propertySourceInput;
		
		if(key.equals(EmulatorConstants.EMULATOR_PROPERTY_KEY_NAME)){
			
			return emulator.getName();
			
		}
		
		return EmulatorConstants.NOT_DEFINED;
	}

	@Override
	public boolean refreshRemoteObject(Object oldElement, Object newElement) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getRemoteParent(Object element, IProgressMonitor monitor)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getRemoteParentNamesInUse(Object element,
			IProgressMonitor monitor) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract String getSubSystemConfigurationId(Object element);
}
