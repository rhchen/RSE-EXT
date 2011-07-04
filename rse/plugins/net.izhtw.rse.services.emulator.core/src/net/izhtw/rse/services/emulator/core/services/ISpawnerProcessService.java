package net.izhtw.rse.services.emulator.core.services;

import java.io.File;
import java.io.IOException;

import org.eclipse.rse.services.processes.IProcessService;

public interface ISpawnerProcessService extends IProcessService{

	public void forkProcess(String cmd, String[] envp, File dir) throws IOException;
	
}
