package net.izhtw.rse.services.emulator.handler;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.rse.services.clientserver.processes.HostProcessFilterImpl;
import org.eclipse.rse.services.clientserver.processes.IHostProcess;
import org.eclipse.rse.services.clientserver.processes.IHostProcessFilter;
import org.eclipse.rse.services.clientserver.processes.handlers.ProcessHandler;

import net.izhtw.rse.services.emulator.processes.impl.SpawnerProcess;
import net.izhtw.rse.services.emulator.processes.impl.SpawnerProcessFactory;

public class SpawnerProcessHandler implements ProcessHandler {

	SortedSet<SpawnerProcess> hm = Collections.synchronizedSortedSet(new TreeSet<SpawnerProcess>());
	
	@Override
	public SortedSet<SpawnerProcess> lookupProcesses(IHostProcessFilter rpfs) throws Exception {
		return hm;
	}

	@Override
	public IHostProcess kill(IHostProcess process, String type)
			throws Exception {
		
		HostProcessFilterImpl rpfs = new HostProcessFilterImpl();
		
		rpfs.setPid("" + process.getPid());
		
		SortedSet<SpawnerProcess> results = lookupProcesses(rpfs);
		
		if (results == null || results.size() == 0) return null;
		else return (IHostProcess) results.first();
	}

	public SpawnerProcess exec(){
		
		SpawnerProcess sp = SpawnerProcessFactory.getSpawnerProcess();
		
		hm.add(sp);
		
		return sp;
	}
}
