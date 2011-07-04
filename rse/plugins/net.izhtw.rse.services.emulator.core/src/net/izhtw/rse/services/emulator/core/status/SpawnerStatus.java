package net.izhtw.rse.services.emulator.core.status;

import org.eclipse.core.runtime.Status;

public class SpawnerStatus extends Status {

	public SpawnerStatus(int severity, String pluginId, String message) {
		super(severity, pluginId, message);
	}

}
