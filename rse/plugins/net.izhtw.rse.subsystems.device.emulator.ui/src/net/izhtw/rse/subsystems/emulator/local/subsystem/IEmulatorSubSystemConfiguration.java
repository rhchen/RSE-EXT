package net.izhtw.rse.subsystems.emulator.local.subsystem;

import net.izhtw.rse.services.emulator.core.services.IEmulatorService;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystemConfiguration;

public interface IEmulatorSubSystemConfiguration extends ISubSystemConfiguration{

	public IEmulatorService getEmulatorService(IHost host);
}
