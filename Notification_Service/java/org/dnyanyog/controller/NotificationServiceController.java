package org.dnyanyog.controller;

import org.dnyanyog.dto.NotificationRequest;
import org.dnyanyog.dto.NotificationResponce;
import org.dnyanyog.service.NotificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class NotificationServiceController {
	
	@Autowired
	NotificationServiceImpl service;

	@PostMapping(path = "/api/notification/v1/notify", 
				consumes = { "application/json","application/xml" }, 
				produces = { "application/json", "application/xml" })
	public NotificationResponce notificationController(@Valid @RequestBody NotificationRequest request) {
		return service.sendNotification(request);
	}

}
