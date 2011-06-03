package net.izhtw.rse.subsystems.device.emulator.qemu.subsystem;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.ISubSystem;
import org.eclipse.rse.core.subsystems.SubSystemConfiguration;

public class QemuSubSystemConfiguration extends SubSystemConfiguration {

	@Override
	public ISubSystem createSubSystemInternal(IHost conn) {
		return new QemuSubSystem(conn, getConnectorService(conn));
	}

}
