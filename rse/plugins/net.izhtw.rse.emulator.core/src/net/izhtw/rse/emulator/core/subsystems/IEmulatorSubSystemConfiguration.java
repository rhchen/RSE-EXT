package net.izhtw.rse.emulator.core.subsystems;

import net.izhtw.rse.emulator.core.services.IEmulatorService;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystemConfiguration;

public interface IEmulatorSubSystemConfiguration extends ISubSystemConfiguration{

	public IEmulatorService getEmulatorService(IHost host);
}
