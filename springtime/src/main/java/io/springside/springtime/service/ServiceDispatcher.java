package io.springside.springtime.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import io.springside.springtime.serializer.Serializer;
import io.springside.springtime.service.ServiceBeanFactory.MethodInvoker;

public class ServiceDispatcher {
	
	private ServiceBeanFactory registry;

	public ServiceDispatcher(ServiceBeanFactory registry) {
		this.registry = registry;
	}

	public void dispatch(String path, Serializer serializer, InputStream inputBuf, OutputStream outputBuf)
			throws IOException {

		MethodInvoker methodInvoker = registry.get(path);
		if (methodInvoker == null) {
			throw new RuntimeException(path + " is a bad request");
		}

		Object requestParameter = serializer.decode(inputBuf, methodInvoker.requestParameterType);

		Object responseParameter = methodInvoker.invoke(requestParameter);

		serializer.encode(outputBuf, responseParameter);
	}
}
