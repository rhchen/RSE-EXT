package net.izhtw.rse.subsystems.processes.emulator.local.subsystem.impl;

import net.izhtw.rse.emulator.core.subsystems.IEmulatorProcessServiceSubSystemConfiguration;
import net.izhtw.rse.services.emulator.local.LocalSpawnerProcessService;
import net.izhtw.rse.subsystems.processes.emulator.local.adapter.EmulatorProcessAdapter;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.internal.connectorservice.local.LocalConnectorService;
import org.eclipse.rse.internal.subsystems.processes.local.LocalProcessAdapter;
import org.eclipse.rse.services.processes.IProcessService;
import org.eclipse.rse.subsystems.processes.core.subsystem.IHostProcessToRemoteProcessAdapter;
import org.eclipse.rse.subsystems.processes.local.LocalProcessSubSystemConfiguration;
import org.eclipse.rse.subsystems.processes.servicesubsystem.ProcessServiceSubSystem;

public class EmulatorProcessSubSystemConfiguration extends LocalProcessSubSystemConfiguration implements IEmulatorProcessServiceSubSystemConfiguration{

	@Override
	public ISubSystem createSubSystemInternal(IHost host) {
		
		LocalConnectorService connectorService = (LocalConnectorService)getConnectorService(host);
		
		ISubSystem subsys = new EmulatorProcessServiceSubSystem(host, connectorService, getProcessService(host), getHostProcessAdapter());
		
		return subsys;
		
	}

	@Override
	public IHostProcessToRemoteProcessAdapter getHostProcessAdapter() {
		if (_hostProcessAdapter == null)
		{
			_hostProcessAdapter =  new EmulatorProcessAdapter();
		}
		return _hostProcessAdapter;
	}
}
