package net.izhtw.rse.services.emulator.status;

import org.eclipse.core.runtime.Status;

public class SpawnerStatus extends Status {

	public SpawnerStatus(int severity, String pluginId, String message) {
		super(severity, pluginId, message);
	}

}
