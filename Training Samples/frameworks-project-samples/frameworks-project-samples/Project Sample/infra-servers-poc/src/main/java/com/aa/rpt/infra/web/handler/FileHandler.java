package com.aa.rpt.infra.web.handler;

import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aa.rpt.infra.model.Servers;
import com.aa.rpt.infra.service.ServerService;

@Component
public class FileHandler {
	@Autowired
	private ServerService serverService;
	
	public boolean saveFile(Integer id,byte[] fileStream,String fileName,String contentType){
		boolean saved = false;
		Servers server=serverService.fetchServerFromId(id);
		if(server != null ){
			server.setFileName(fileName);
			server.setContentType(contentType);
			server.setContent(BlobProxy.generateProxy(fileStream));
			Servers dbServer = serverService.update(server);
			if(dbServer != null ){
				saved = true;
			}
		}
		return saved;
	}
}
