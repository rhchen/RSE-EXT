package net.izhtw.rse.subsystems.emulator.local.subsystem;

import net.izhtw.rse.services.emulator.core.services.IEmulatorService;

import org.eclipse.rse.core.subsystems.ISubSystem;

public interface IEmulatorSubSystem extends ISubSystem {

	public IEmulatorService getEmulatorService();
}
