package net.izhtw.rse.subsystems.emulator.local.subsystem.impl;

import java.util.HashMap;
import java.util.Map;

import net.izhtw.rse.services.emulator.core.services.AbstractEmulatorService;
import net.izhtw.rse.services.emulator.core.services.IEmulatorService;
import net.izhtw.rse.subsystems.emulator.local.subsystem.IEmulatorSubSystemConfiguration;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.IConnectorService;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.core.subsystems.SubSystemConfiguration;
import org.eclipse.rse.internal.connectorservice.local.LocalConnectorServiceManager;
import org.eclipse.rse.internal.services.local.ILocalService;
import org.eclipse.rse.services.IService;

public abstract class EmulatorSubSystemConfiguration extends SubSystemConfiguration implements IEmulatorSubSystemConfiguration{

	protected Map _services;
	
	public EmulatorSubSystemConfiguration() {
		super();
		_services = new HashMap();
	}

	@Override
	public IConnectorService getConnectorService(IHost host)
	{
		return LocalConnectorServiceManager.getInstance().getConnectorService(host, getServiceImplType());
	}
	
	@Override
	public Class<ILocalService> getServiceImplType()
	{
		return ILocalService.class;
	}

	@Override
	public IService getService(IHost host) {
		
		return getEmulatorService(host);
	}

	@Override
	public IEmulatorService getEmulatorService(IHost host) {
		IEmulatorService service = (IEmulatorService)_services.get(host);
		if (service == null){
			service = new AbstractEmulatorService(){};
			_services.put(host, service);
		}
		return service;
	}
	
	
}
