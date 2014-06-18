package com.efigence.guava;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import com.google.common.hash.Hashing;

public class O006_Hashing {

	private static final String MD5_HASH = "09433e1853385270b51511571e35eeca";
	private static final String SHA_512_HASH = "d984e6c7dcd83fdc5d7fa8c11e6695ee0db9f5ef62449ac6564eed50a415b4d7c4c472ce14e380b1df1ab2436e5edc3cd22d5e2cb0b1ea1542682ffa470f3727";

	@Test
	public void shouldDisplayHash() {
		// given
		String textToHash = "secret";
		// when
		assertThat(Hashing.md5().newHasher().putUnencodedChars(textToHash).hash().toString())
			.isEqualTo(MD5_HASH);
		assertThat(Hashing.sha512().newHasher().putUnencodedChars(textToHash).hash().toString())
			.isEqualTo(SHA_512_HASH);
	}
}
