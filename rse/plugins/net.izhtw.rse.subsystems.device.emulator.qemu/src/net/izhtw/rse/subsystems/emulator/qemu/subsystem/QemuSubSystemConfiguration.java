package net.izhtw.rse.subsystems.emulator.qemu.subsystem;

import net.izhtw.rse.subsystems.emulator.local.subsystem.EmulatorSubSystemConfiguration;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;

public class QemuSubSystemConfiguration extends EmulatorSubSystemConfiguration {

	public static final String SUBSYSTEM_CONFIGURATION_ID = "qemu.emulator";
	
	@Override
	public ISubSystem createSubSystemInternal(IHost conn) {
		return new QemuSubSystem(conn, getConnectorService(conn));
	}

}
