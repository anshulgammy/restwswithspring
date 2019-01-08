package com.techbrunch.boostrap.webapplication.util;

public class CommonUtil {
	public static <T> T checkNotNull(T resource) throws ResourceNotFoundException {
        if (resource == null) {
            throw new ResourceNotFoundException();
        }
        return resource;
    }
}
