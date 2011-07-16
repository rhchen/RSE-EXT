package net.izhtw.rse.emulator.core.subsystems;

import net.izhtw.rse.emulator.core.services.IEmulatorService;

import org.eclipse.rse.core.subsystems.ISubSystem;

public interface IEmulatorSubSystem extends ISubSystem {

	public IEmulatorService getEmulatorService();
}
