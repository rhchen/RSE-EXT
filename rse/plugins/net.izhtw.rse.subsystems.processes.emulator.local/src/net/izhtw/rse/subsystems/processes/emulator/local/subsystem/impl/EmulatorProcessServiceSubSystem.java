package net.izhtw.rse.subsystems.processes.emulator.local.subsystem.impl;

import net.izhtw.rse.subsystems.processes.emulator.local.subsystem.IEmulatorProcessServiceSubSystem;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.IConnectorService;
import org.eclipse.rse.services.clientserver.messages.SystemMessageException;
import org.eclipse.rse.services.clientserver.processes.IHostProcessFilter;
import org.eclipse.rse.services.processes.IProcessService;
import org.eclipse.rse.subsystems.processes.core.subsystem.IHostProcessToRemoteProcessAdapter;
import org.eclipse.rse.subsystems.processes.core.subsystem.IRemoteProcess;
import org.eclipse.rse.subsystems.processes.core.subsystem.IRemoteProcessContext;
import org.eclipse.rse.subsystems.processes.servicesubsystem.IProcessServiceSubSystem;
import org.eclipse.rse.subsystems.processes.servicesubsystem.ProcessServiceSubSystem;

public class EmulatorProcessServiceSubSystem extends ProcessServiceSubSystem implements IEmulatorProcessServiceSubSystem{

	public EmulatorProcessServiceSubSystem(IHost host,
			IConnectorService connectorService,
			IProcessService hostProcessService,
			IHostProcessToRemoteProcessAdapter adapter) {
		super(host, connectorService, hostProcessService, adapter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean kill(IRemoteProcess process, String signal)
			throws SystemMessageException {
		// TODO Auto-generated method stub
		return super.kill(process, signal);
	}

	@Override
	public IRemoteProcess[] listAllProcesses(IHostProcessFilter processFilter,
			IRemoteProcessContext context, IProgressMonitor monitor)
			throws InterruptedException, SystemMessageException {
		// TODO Auto-generated method stub
		return super.listAllProcesses(processFilter, context, monitor);
	}

	@Override
	public void initializeSubSystem(IProgressMonitor monitor)
			throws SystemMessageException {
		// TODO Auto-generated method stub
		super.initializeSubSystem(monitor);
	}

	@Override
	public void uninitializeSubSystem(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		super.uninitializeSubSystem(monitor);
	}

}
