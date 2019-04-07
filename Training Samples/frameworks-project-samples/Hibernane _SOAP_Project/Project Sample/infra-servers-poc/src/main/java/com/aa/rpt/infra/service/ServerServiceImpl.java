package com.aa.rpt.infra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aa.rpt.infra.model.Servers;
import com.aa.rpt.infra.repository.ServerRepository;

@Service
public class ServerServiceImpl implements ServerService {

	@Autowired
	private ServerRepository serverRepository;

	@Override
	public void save(Servers servers) {
		serverRepository.save(servers);
	}

	@Override
	public Servers fetchServerFromId(Integer id) {
		return serverRepository.findOne(id);
	}

	@Override
	public Servers update(Servers servers) {
		Servers dbServer = serverRepository.findOne(servers.getId());
		if (dbServer == null) {
			return null;
		}
		return serverRepository.saveAndFlush(servers);
	}

	@Override
	public void delete(Servers servers) {
		serverRepository.delete(servers);
	}

	@Override
	public List<Servers> getAllServers() {
		List<Servers> serversList = serverRepository.findAll();
		return serversList;
	}

	@Override
	public List<Servers> saveAllServers(List<Servers> serversList) {
		return serverRepository.save(serversList);
	}

}
