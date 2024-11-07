package org.dnyanyog.dto;

import java.time.LocalDateTime;

public class NotificationResponce {
	private String status;
	private String code;
	private String message;
	private LocalDateTime timestamp;
	
	public static NotificationResponce getInstance() {
		return new NotificationResponce();
	}

	public String getStatus() {
		return status;
	}

	public NotificationResponce setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getCode() {
		return code;
	}

	public NotificationResponce setCode(String string) {
		this.code = string;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public NotificationResponce setMessage(String message) {
		this.message = message;
		return this;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public NotificationResponce setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
		return this;
	}

}
