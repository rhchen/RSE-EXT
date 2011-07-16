package net.izhtw.rse.subsystems.emulator.skyeye.subsystem;

import net.izhtw.rse.emulator.core.services.IEmulatorService;
import net.izhtw.rse.subsystems.emulator.local.subsystem.IEmulatorSubSystem;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.IConnectorService;
import org.eclipse.rse.core.subsystems.SubSystem;
import org.eclipse.rse.services.clientserver.messages.SystemMessageException;

public class SkyeyeSubSystem extends SubSystem implements IEmulatorSubSystem{

	protected IEmulatorService _service = null;
	
	protected SkyeyeSubSystem(IHost host, IConnectorService connectorService, IEmulatorService service) {
		super(host, connectorService);
		_service = service;
	}

	@Override
	public void initializeSubSystem(IProgressMonitor monitor)
			throws SystemMessageException {
		// TODO Auto-generated method stub
		super.initializeSubSystem(monitor);
		getEmulatorService().initService(monitor);
	}

	@Override
	public IEmulatorService getEmulatorService() {
		return this._service;
	}

}
