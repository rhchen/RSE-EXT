package net.izhtw.rse.services.emulator.core.handler;

import java.io.File;
import java.io.IOException;

import net.izhtw.rse.services.emulator.core.processes.impl.SpawnerProcess;

import org.eclipse.rse.services.clientserver.processes.handlers.ProcessHandler;

public interface ISpawnerProcessHandler extends ProcessHandler{

	public SpawnerProcess exec(String cmd, String[] envp, File dir) throws IOException;
	
}
