package net.izhtw.rse.services.emulator.processes.impl;

import java.io.File;
import java.io.IOException;

import org.eclipse.cdt.utils.spawner.ProcessFactory;
import org.eclipse.cdt.utils.spawner.Spawner;

public class SpawnerProcessFactory {

	public static SpawnerProcess getSpawnerProcess(){
		
		String[] envp = null;
		String cmd = null;
		File dir = null;
		
		try {
			
			Spawner process = (Spawner)ProcessFactory.getFactory().exec(cmd, envp, dir);
		
			return new SpawnerProcess(process);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
