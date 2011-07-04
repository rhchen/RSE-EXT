package net.izhtw.rse.services.emulator.core.processes.impl;

import java.io.File;
import java.io.IOException;

import org.eclipse.cdt.utils.spawner.ProcessFactory;
import org.eclipse.cdt.utils.spawner.Spawner;

public class SpawnerProcessFactory {

	public static SpawnerProcess getSpawnerProcess(String cmd, String[] envp, File dir) throws IOException{
		
		Spawner process = (Spawner)ProcessFactory.getFactory().exec(cmd, envp, dir);
		
		return new SpawnerProcess(process);
	}
}
