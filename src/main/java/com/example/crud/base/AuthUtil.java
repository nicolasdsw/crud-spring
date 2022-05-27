package com.example.crud.base;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.core.context.SecurityContextHolder;

public class AuthUtil {

	public static String getUserName() {
		if (SecurityContextHolder.getContext() == null || SecurityContextHolder.getContext().getAuthentication() == null
				|| "anonymousUser".equals(SecurityContextHolder.getContext().getAuthentication().getPrincipal())) {
			return null;
		}
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}

	public static String generateRandomToken() {
		return String.format("%s%s%d", UUID.randomUUID().toString(), "n", LocalDateTime.now().getNano());
	}
}
