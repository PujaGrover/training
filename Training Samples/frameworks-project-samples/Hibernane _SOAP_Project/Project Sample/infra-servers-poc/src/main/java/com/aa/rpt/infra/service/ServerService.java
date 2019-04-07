package com.aa.rpt.infra.service;

import java.util.List;

import com.aa.rpt.infra.model.Servers;

public interface ServerService {
	public void save(Servers servers);
	public Servers fetchServerFromId(Integer id);
	public Servers update(Servers servers);
	public void delete(Servers servers);
	public List<Servers> getAllServers();
	public List<Servers> saveAllServers(List<Servers> serversList);
}
