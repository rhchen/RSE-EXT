package net.izhtw.rse.subsystems.processes.emulator.local.subsystem;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.internal.connectorservice.local.LocalConnectorService;
import org.eclipse.rse.subsystems.processes.local.LocalProcessSubSystemConfiguration;
import org.eclipse.rse.subsystems.processes.servicesubsystem.ProcessServiceSubSystem;

public class EmulatorProcessSubSystemConfiguration extends LocalProcessSubSystemConfiguration {

	@Override
	public ISubSystem createSubSystemInternal(IHost host) {
		
		LocalConnectorService connectorService = (LocalConnectorService)getConnectorService(host);
		
		ISubSystem subsys = new EmulatorProcessServiceSubSystem(host, connectorService, getProcessService(host), getHostProcessAdapter());
		
		return subsys;
		
	}

}
