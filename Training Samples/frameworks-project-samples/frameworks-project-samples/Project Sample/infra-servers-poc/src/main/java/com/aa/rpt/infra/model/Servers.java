package com.aa.rpt.infra.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "servers")
public class Servers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "server_name")
	private String serverName;

	@Column(name = "hardware_type")
	private String hardwareType;

	@Column(name = "application")
	private String application;

	@Column(name = "green_ip")
	private String greenIp;

	@Column(name = "grey_ip")
	private String greyIp;

	@Column(name = "ilo_ip")
	private String iloIp;

	@Column(name = "datacenter")
	private String datacenter;

	@Column(name = "os")
	private String os;
	
	@Column(name="file_name")
	private String fileName;
	
	@Column(name="content_type")
	private String contentType;
	
	@Column(name="content")
	@Lob
	private Blob content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getHardwareType() {
		return hardwareType;
	}

	public void setHardwareType(String hardwareType) {
		this.hardwareType = hardwareType;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getGreenIp() {
		return greenIp;
	}

	public void setGreenIp(String greenIp) {
		this.greenIp = greenIp;
	}

	public String getGreyIp() {
		return greyIp;
	}

	public void setGreyIp(String greyIp) {
		this.greyIp = greyIp;
	}

	public String getIloIp() {
		return iloIp;
	}

	public void setIloIp(String iloIp) {
		this.iloIp = iloIp;
	}

	public String getDatacenter() {
		return datacenter;
	}

	public void setDatacenter(String datacenter) {
		this.datacenter = datacenter;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Blob getContent() {
		return content;
	}

	public void setContent(Blob content) {
		this.content = content;
	}
	
}
