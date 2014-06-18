package com.efigence.guava;

import java.net.InetAddress;

import org.junit.Test;

import com.google.common.net.HostAndPort;
import com.google.common.net.HttpHeaders;
import com.google.common.net.InetAddresses;

public class O014_Net {

	@Test
	public void someNetPackageDemo() {
		// given
		System.out.println(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN);
		InetAddress inetAddress = InetAddresses.forString("193.200.227.13");
		// Zagadka
		// System.out.println(inetAddress.getCanonicalHostName());
		System.out.println(HostAndPort.fromString("127.0.0.1:1234").getHostText());
	}
}
