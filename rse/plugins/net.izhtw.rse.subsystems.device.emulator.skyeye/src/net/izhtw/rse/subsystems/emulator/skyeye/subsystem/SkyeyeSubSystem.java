package net.izhtw.rse.subsystems.emulator.skyeye.subsystem;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import net.izhtw.rse.emulator.core.services.IEmulatorProcessService;
import net.izhtw.rse.emulator.core.services.IEmulatorService;
import net.izhtw.rse.emulator.core.subsystems.IEmulatorSubSystem;
import net.izhtw.rse.subsystems.emulator.core.model.Emulator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.IConnectorService;
import org.eclipse.rse.core.subsystems.SubSystem;
import org.eclipse.rse.services.clientserver.messages.SystemMessageException;

public class SkyeyeSubSystem extends SubSystem implements IEmulatorSubSystem{

	protected IEmulatorService _service = null;
	
	protected IEmulatorProcessService _processserice = null;
	
	protected SkyeyeSubSystem(IHost host, IConnectorService connectorService, IEmulatorService service) {
		super(host, connectorService);
		_service = service;
	}
	
	protected SkyeyeSubSystem(IHost host, IConnectorService connectorService, IEmulatorService service, IEmulatorProcessService processserice) {
		super(host, connectorService);
		_service = service;
		_processserice = processserice;
	}

	@Override
	public void initializeSubSystem(IProgressMonitor monitor)
			throws SystemMessageException {
		super.initializeSubSystem(monitor);
		getEmulatorService().initService(monitor);
	}

	@Override
	public IEmulatorService getEmulatorService() {
		return this._service;
	}
	
	public IEmulatorProcessService getEmulatorProcessService() {
		return this._processserice;
	}

	@Override
	protected Object[] internalResolveFilterString(String filterString,
			IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		
		List matches = new ArrayList();
		
		matches.add(new Emulator("Skyeye_01"));
		matches.add(new Emulator("Skyeye_02"));
		matches.add(new Emulator("Skyeye_03"));
		
		return (Emulator[]) matches.toArray(new Emulator[matches.size()]);
		
		//return super.internalResolveFilterString(filterString, monitor);
	}

	@Override
	protected Object[] internalResolveFilterString(Object parent,
			String filterString, IProgressMonitor monitor)
			throws InvocationTargetException, InterruptedException {
		
		List matches = new ArrayList();
		
		matches.add(new Emulator("Skyeye_01"));
		matches.add(new Emulator("Skyeye_02"));
		matches.add(new Emulator("Skyeye_03"));
		
		return (Emulator[]) matches.toArray(new Emulator[matches.size()]);
		
		//return super.internalResolveFilterString(parent, filterString, monitor);
	}

	@Override
	public boolean hasChildren() {
		return true;
	}

	@Override
	public Object[] getChildren() {
		
		List matches = new ArrayList();
		
		matches.add(new Emulator("Skyeye_01"));
		matches.add(new Emulator("Skyeye_02"));
		matches.add(new Emulator("Skyeye_03"));
		
		return (Emulator[]) matches.toArray(new Emulator[matches.size()]);
	}

}
