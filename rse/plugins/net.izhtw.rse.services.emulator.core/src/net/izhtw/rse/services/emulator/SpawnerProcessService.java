package net.izhtw.rse.services.emulator;

import java.util.SortedSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.rse.services.clientserver.messages.SystemMessageException;
import org.eclipse.rse.services.clientserver.processes.IHostProcess;
import org.eclipse.rse.services.clientserver.processes.IHostProcessFilter;
import org.eclipse.rse.services.clientserver.processes.handlers.ProcessHandler;
import org.eclipse.rse.services.processes.AbstractProcessService;
import org.eclipse.rse.services.processes.IProcessService;

import net.izhtw.rse.services.emulator.handler.SpawnerProcessHandler;
import net.izhtw.rse.services.emulator.processes.impl.SpawnerProcess;

public class SpawnerProcessService extends AbstractProcessService implements IProcessService{

	protected ProcessHandler handler;
	
	public SpawnerProcessService() {
		super();
		handler = new SpawnerProcessHandler();
	}

	@SuppressWarnings("unchecked")
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
