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

public class EmulatorSystemViewAdapter extends AbstractSystemViewAdapter implements ISystemRemoteElementAdapter{

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAbsoluteName(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addActions(SystemMenuManager menu,
			IStructuredSelection selection, Shell parent, String menuGroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getType(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(IAdaptable element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] getChildren(IAdaptable element, IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IPropertyDescriptor[] internalGetPropertyDescriptors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object internalGetPropertyValue(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRemoteSubType(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRemoteType(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRemoteTypeCategory(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSubSystemConfigurationId(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAbsoluteParentName(Object element) {
		// TODO Auto-generated method stub
		return null;
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

}
