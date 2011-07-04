package net.izhtw.rse.services.emulator.core.processes.impl;

import java.io.File;
import java.io.IOException;

import net.izhtw.rse.services.emulator.core.processes.ISpawnerProcess;

import org.eclipse.cdt.utils.spawner.ProcessFactory;
import org.eclipse.cdt.utils.spawner.Spawner;
import org.eclipse.rse.services.clientserver.processes.IHostProcess;
import org.eclipse.rse.services.processes.AbstractHostProcess;

public class SpawnerProcess extends AbstractHostProcess implements IHostProcess, ISpawnerProcess{

	private Spawner process = null;
	
	public SpawnerProcess(Spawner process) {
		super();
		this.process = process;
	}

}
