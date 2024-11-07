package org.dnyanyog.service;

import org.dnyanyog.dto.NotificationRequest;
import org.dnyanyog.dto.NotificationResponce;

public interface NotificationService {
	
	public NotificationResponce sendNotification(NotificationRequest request);

}
