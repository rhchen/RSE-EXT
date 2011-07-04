package net.izhtw.rse.services.emulator.core.processes.impl;

import org.eclipse.cdt.utils.spawner.Spawner;
import org.eclipse.rse.services.clientserver.processes.IHostProcess;
import org.eclipse.rse.services.processes.AbstractHostProcess;

import net.izhtw.rse.services.emulator.core.processes.ISpawnerProcess;


public class SpawnerProcess extends AbstractHostProcess implements IHostProcess, ISpawnerProcess{

	private Spawner process = null;
	
	public SpawnerProcess(Spawner process) {
		super();
		this.process = process;
	}

}
