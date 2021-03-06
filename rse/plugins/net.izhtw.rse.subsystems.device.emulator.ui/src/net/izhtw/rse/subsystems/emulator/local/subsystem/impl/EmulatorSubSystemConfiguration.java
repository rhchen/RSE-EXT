package net.izhtw.rse.subsystems.emulator.local.subsystem.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.izhtw.rse.emulator.core.services.IEmulatorProcessService;
import net.izhtw.rse.emulator.core.services.IEmulatorService;
import net.izhtw.rse.emulator.core.subsystems.IEmulatorProcessServiceSubSystem;
import net.izhtw.rse.emulator.core.subsystems.IEmulatorProcessServiceSubSystemConfiguration;
import net.izhtw.rse.emulator.core.subsystems.IEmulatorSubSystemConfiguration;
import net.izhtw.rse.services.emulator.core.services.AbstractEmulatorService;

import org.eclipse.rse.core.IRSESystemType;
import org.eclipse.rse.core.RSECorePlugin;
import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.IConnectorService;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.core.subsystems.ISubSystemConfiguration;
import org.eclipse.rse.core.subsystems.SubSystemConfiguration;
import org.eclipse.rse.internal.connectorservice.local.LocalConnectorServiceManager;
import org.eclipse.rse.internal.services.local.ILocalService;
import org.eclipse.rse.services.IService;
import org.eclipse.rse.services.processes.IProcessService;

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
	
	@Override
	public IProcessService[] getEmulatorProcessService(IHost host, IRSESystemType systemType, Class clazz) {
		
		List matches = new ArrayList();
		
		ISubSystemConfiguration[] ssca = RSECorePlugin.getTheSystemRegistry().getSubSystemConfigurationsBySystemType(systemType, false, true);
		
		for(ISubSystemConfiguration ssa : ssca){
			
			if(ssa instanceof IEmulatorProcessServiceSubSystemConfiguration){
				
				ISubSystem[] ssarray =  ssa.getSubSystems(host, true);
				
				for(ISubSystem ss : ssarray){
					
					if(clazz.isInstance(ss)){
						
						IProcessService eps = ((IEmulatorProcessServiceSubSystem) ss).getProcessService();
						
						matches.add(eps);
						
					}
				}
			}
			
		}
		
		//ISubSystem[] ssa = RSECorePlugin.getTheSystemRegistry().getServiceSubSystems(host, IProcessService.class);
		
		return (IProcessService[])matches.toArray(new IProcessService[matches.size()]);
		
	}
}
