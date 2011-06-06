package net.izhtw.rse.subsystems.emulator.qemu.subsystem;

import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.core.subsystems.IConnectorService;
import org.eclipse.rse.core.subsystems.SubSystem;

public class QemuSubSystem extends SubSystem {

	protected QemuSubSystem(IHost host, IConnectorService connectorService) {
		super(host, connectorService);
	}

}
