package net.izhtw.rse.subsystems.emulator.qemu.subsystem;

import net.izhtw.rse.services.emulator.core.services.IQemuService;
import net.izhtw.rse.subsystems.emulator.local.subsystem.IEmulatorSubSystemConfiguration;
import net.izhtw.rse.subsystems.emulator.local.subsystem.impl.EmulatorSubSystemConfiguration;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;

public class QemuSubSystemConfiguration extends EmulatorSubSystemConfiguration implements IEmulatorSubSystemConfiguration{

	public static final String SUBSYSTEM_CONFIGURATION_ID = "qemu.emulator";
	
	@Override
	public ISubSystem createSubSystemInternal(IHost conn) {
		return new QemuSubSystem(conn, getConnectorService(conn));
	}

	@Override
	public Class getServiceType() {
		return IQemuService.class;
	}
}
