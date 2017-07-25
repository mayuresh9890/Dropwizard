package com.vrs.TestEmailPrj;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class ConfigMConfiguration extends Configuration {
    // TODO: implement service configuration
	@NotEmpty
	private String smtp_host;
	
	@NotEmpty
	 private String smtp_socketFactoryport;

	 @NotEmpty
	 private String smtp_socketFactoryclass;

	 @NotEmpty
	 private String smtp_authentication;

	 @NotEmpty
	 private String smtp_port;

	 @NotEmpty
	 private String start_tls;

	 @NotEmpty
	 private String from_email;

	 @NotEmpty
	 private String username;

	 @NotEmpty
	 private String password;

	public String getSmtp_host() {
		return smtp_host;
	}

	public void setSmtp_host(String smtp_host) {
		this.smtp_host = smtp_host;
	}

	public String getSmtp_socketFactoryport() {
		return smtp_socketFactoryport;
	}

	public void setSmtp_socketFactoryport(String smtp_socketFactoryport) {
		this.smtp_socketFactoryport = smtp_socketFactoryport;
	}

	public String getSmtp_socketFactoryclass() {
		return smtp_socketFactoryclass;
	}

	public void setSmtp_socketFactoryclass(String smtp_socketFactoryclass) {
		this.smtp_socketFactoryclass = smtp_socketFactoryclass;
	}

	public String getSmtp_authentication() {
		return smtp_authentication;
	}

	public void setSmtp_authentication(String smtp_authentication) {
		this.smtp_authentication = smtp_authentication;
	}

	public String getSmtp_port() {
		return smtp_port;
	}

	public void setSmtp_port(String smtp_port) {
		this.smtp_port = smtp_port;
	}

	public String getStart_tls() {
		return start_tls;
	}

	public void setStart_tls(String start_tls) {
		this.start_tls = start_tls;
	}

	public String getFrom_email() {
		return from_email;
	}

	public void setFrom_email(String from_email) {
		this.from_email = from_email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
