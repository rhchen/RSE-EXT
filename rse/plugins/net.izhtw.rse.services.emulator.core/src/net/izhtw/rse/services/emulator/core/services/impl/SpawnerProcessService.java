package net.izhtw.rse.services.emulator.core.services.impl;

import java.io.File;
import java.io.IOException;
import java.util.SortedSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.rse.services.clientserver.messages.SystemMessageException;
import org.eclipse.rse.services.clientserver.processes.IHostProcess;
import org.eclipse.rse.services.clientserver.processes.IHostProcessFilter;
import org.eclipse.rse.services.processes.AbstractProcessService;

import net.izhtw.rse.services.emulator.core.handler.impl.SpawnerProcessHandler;
import net.izhtw.rse.services.emulator.core.processes.ISpawnerProcess;
import net.izhtw.rse.services.emulator.core.processes.impl.SpawnerProcess;
import net.izhtw.rse.services.emulator.core.services.ISpawnerProcessService;

public class SpawnerProcessService extends AbstractProcessService implements ISpawnerProcessService{

	protected SpawnerProcessHandler handler;
	
	public SpawnerProcessService() {
		super();
		handler = new SpawnerProcessHandler();
	}

	public void forkProcess(String cmd, String[] envp, File dir) throws IOException{
		
		handler.exec(cmd, envp, dir);
		
	}
	
	@Override
	public IHostProcess[] listAllProcesses(IHostProcessFilter filter,
			IProgressMonitor monitor) throws SystemMessageException {
		
		IHostProcess[] processes = null;

		if (handler == null) return null;
		
		try {
			
			SortedSet<SpawnerProcess> results = handler.lookupProcesses(filter);
		
			processes = (IHostProcess[]) results.toArray(new IHostProcess[results.size()]);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
		return processes;
	
	}

	@Override
	public boolean kill(long pid, String signal, IProgressMonitor monitor)
			throws SystemMessageException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getSignalTypes() {
		// TODO Auto-generated method stub
		return null;
	}

}
