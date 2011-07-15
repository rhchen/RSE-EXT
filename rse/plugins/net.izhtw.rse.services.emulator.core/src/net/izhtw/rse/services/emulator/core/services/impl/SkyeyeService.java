package net.izhtw.rse.services.emulator.core.services.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.rse.services.clientserver.messages.SystemMessageException;

import net.izhtw.rse.services.emulator.core.services.AbstractEmulatorService;
import net.izhtw.rse.services.emulator.core.services.ISkyeyeService;

public class SkyeyeService extends AbstractEmulatorService implements ISkyeyeService{

	@Override
	public void initService(IProgressMonitor monitor)
			throws SystemMessageException {
		
		super.initService(monitor);
		
		
	}

	@Override
	public void uninitService(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		super.uninitService(monitor);
	}

}
