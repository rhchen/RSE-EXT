package net.izhtw.rse.services.emulator.handler;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.rse.core.RSECorePlugin;
import org.eclipse.rse.core.events.ISystemResourceChangeEvent;
import org.eclipse.rse.core.events.ISystemResourceChangeListener;
import org.eclipse.rse.core.model.ISystemRegistry;
import org.eclipse.rse.services.clientserver.processes.HostProcessFilterImpl;
import org.eclipse.rse.services.clientserver.processes.IHostProcess;
import org.eclipse.rse.services.clientserver.processes.IHostProcessFilter;
import org.eclipse.rse.services.clientserver.processes.handlers.ProcessHandler;

import net.izhtw.rse.services.emulator.processes.impl.SpawnerProcess;
import net.izhtw.rse.services.emulator.processes.impl.SpawnerProcessFactory;

public class SpawnerProcessHandler implements ProcessHandler, ISystemResourceChangeListener {

	private ISystemRegistry registry = null;

	protected SortedSet<SpawnerProcess> spawnerProcessSet = Collections.synchronizedSortedSet(new TreeSet<SpawnerProcess>());

	public SpawnerProcessHandler() {
		super();
		registry = RSECorePlugin.getTheSystemRegistry();
		registry.addSystemResourceChangeListener(this);
	}

	@Override
	public SortedSet<SpawnerProcess> lookupProcesses(IHostProcessFilter rpfs) throws Exception {
		return spawnerProcessSet;
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
		
		spawnerProcessSet.add(sp);
		
		return sp;
	}

	@Override
	public void systemResourceChanged(ISystemResourceChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
