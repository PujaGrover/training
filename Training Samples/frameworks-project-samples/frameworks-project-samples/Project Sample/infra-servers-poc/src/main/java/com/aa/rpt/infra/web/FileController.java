package com.aa.rpt.infra.web;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.aa.rpt.infra.model.Servers;
import com.aa.rpt.infra.service.ServerService;
import com.aa.rpt.infra.web.handler.ExcelFileProcessingHandler;
import com.aa.rpt.infra.web.handler.FileHandler;

@RequestMapping("/file")
@Controller
public class FileController {
	@Autowired
	private ExcelFileProcessingHandler excelFileProcessingHandler;
	@Autowired
	private ServerService serverService;
	@Autowired
	private FileHandler fileHandler;
	
	@RequestMapping(value = "/servers", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
		List<Servers> serverList = serverService.getAllServers();
        model.addAttribute("servers", serverList);
        if(CollectionUtils.isEmpty(serverList)){
        		return "fileupload";
        }
        return "servers";
    }
	
	@RequestMapping(value = "/fileupload", method = RequestMethod.GET)
	public String fileUpload(Model model){
		return "fileupload";
	}

	@RequestMapping(value = "/processExcel", method = RequestMethod.POST)
	public String processExcel(Model model, @RequestParam("excelfile") MultipartFile excelfile) {		
		try {
			List<Servers> serverList = excelFileProcessingHandler.processExcel2003(excelfile.getInputStream());
			model.addAttribute("servers", serverList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "servers";	
	}
	
	@RequestMapping(value="/addserver", method = RequestMethod.GET)
	public ModelAndView addServer(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("addserver");
	    mav.addObject("server", new Servers());
	    return mav;
	}
	
	@RequestMapping(value="/editserver/{id}", method = RequestMethod.GET)
	public String editServer(HttpServletRequest request, HttpServletResponse response,Model model,@PathVariable("id") Integer id){
		model.addAttribute("server", serverService.fetchServerFromId(id));
	    return "editserver";
	}
	
	@RequestMapping(value="/deleteserver/{id}", method = RequestMethod.GET)
	public ModelAndView deleteServer(HttpServletRequest request, HttpServletResponse response,@PathVariable("id") Integer id){
		ModelAndView mav = new ModelAndView("servers");
		Servers server=serverService.fetchServerFromId(id);
		String serverName = server.getServerName();
	     serverService.delete(server);
	     mav.addObject("message", serverName+ " deleted. ");
	     mav.addObject("servers", serverService.getAllServers());
	    return mav;
	}
	
	@RequestMapping(value="/updateserver", method = RequestMethod.POST)
	public ModelAndView updateServer(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("server") Servers server,@RequestParam("iddfile") MultipartFile iddfile) throws IOException{
		ModelAndView mav = new ModelAndView("servers");
		if(iddfile != null){
			server.setFileName(iddfile.getOriginalFilename());
			server.setContentType(iddfile.getContentType());
			server.setContent(BlobProxy.generateProxy(iddfile.getBytes()));
		}
		serverService.update(server);
	    mav.addObject("message", server.getServerName()+ " updated ");
	    mav.addObject("servers", serverService.getAllServers());
	    return mav;
	}
	
	@RequestMapping(value="/addserver", method = RequestMethod.POST)
	public ModelAndView addNewServer(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("server") Servers server,@RequestParam("iddfile") MultipartFile iddfile) throws IOException{
		ModelAndView mav = new ModelAndView("servers");
		byte[] contentBytes = iddfile.getBytes();
		if(iddfile != null && contentBytes != null && contentBytes.length != 0 ){
			server.setFileName(iddfile.getOriginalFilename());
			server.setContentType(iddfile.getContentType());
			server.setContent(BlobProxy.generateProxy(iddfile.getBytes()));
		}
		serverService.save(server);
	    mav.addObject("message", server.getServerName()+ " added ");
	    mav.addObject("servers", serverService.getAllServers());
	    return mav;
	}
	
	
	
	@RequestMapping(value = "/saveidd/{id}", method = RequestMethod.POST)
	public String saveidd(Model model, @RequestParam("file") MultipartFile file,@PathVariable("id") Integer id) {	
		try {
			boolean saved = fileHandler.saveFile(id, file.getBytes(), file.getOriginalFilename(), file.getContentType());
			if(saved){
				model.addAttribute("message", file.getOriginalFilename() +" saved. ");
			}
			model.addAttribute("servers",  serverService.getAllServers());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "servers";
	}
	
	@RequestMapping("/download/{documentId}")
	public String download(@PathVariable("documentId")
			Integer documentId, HttpServletResponse response) {
		
		Servers server = serverService.fetchServerFromId(documentId);
		try {
			response.setHeader("Content-Disposition", "inline;filename=\"" +server.getFileName()+ "\"");
			OutputStream out = response.getOutputStream();
			response.setContentType(server.getContentType());
			FileCopyUtils.copy(server.getContent().getBinaryStream(), out);
			out.flush();
			out.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@RequestMapping(value = "/processExcel07", method = RequestMethod.POST)
	public String processExcel2007(Model model, @RequestParam("excelfile2007") MultipartFile excelfile) {	
		System.out.println("test");
		try {
			List<Servers> serverList = excelFileProcessingHandler.processExcel2007(excelfile.getInputStream());
			model.addAttribute("servers", serverList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "servers";
	}
} 
