package org.thermoweb.intellij.plugin.encrypt;

public enum Algorithms {
	PBEWITHHMACSHA1ANDAES_128("PBEWithHmacSHA512AndAES_128"),
	PBEWITHMD5ANDDES("PBEWithMD5AndDES"),
	PBEWITHHMACSHA1ANDAES_256("PBEWithHmacSHA1AndAES_256"),
	PBEWITHHMACSHA224ANDAES_128("PBEWithHmacSHA224AndAES_128"),
	PBEWITHHMACSHA224ANDAES_256("PBEWithHmacSHA224AndAES_256"),
	PBEWITHHMACSHA256ANDAES_128("PBEWithHmacSHA256AndAES_128"),
	PBEWITHHMACSHA256ANDAES_256("PBEWithHmacSHA256AndAES_256"),
	PBEWITHHMACSHA384ANDAES_128("PBEWithHmacSHA384AndAES_128"),
	PBEWITHHMACSHA384ANDAES_256("PBEWithHmacSHA384AndAES_256"),
	PBEWITHHMACSHA512ANDAES_128("PBEWithHmacSHA512AndAES_128"),
	PBEWITHHMACSHA512ANDAES_256("PBEWithHmacSHA512AndAES_256"),
	PBEWITHMD5ANDTRIPLEDES("PBEWithMD5AndTripleDES"),
	PBEWITHSHA1ANDDESEDE("PBEWithSHA1AndDESEDE"),
	PBEWITHSHA1ANDRC2_128("PBEWithSHA1AndRC2_128"),
	PBEWITHSHA1ANDRC2_40("PBEWithSHA1AndRC2_40"),
	PBEWITHSHA1ANDRC4_128("PBEWithSHA1AndRC4_128"),
	PBEWITHSHA1ANDRC4_40("PBEWithSHA1AndRC4_40");
	private final String code;

	Algorithms(final String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
}
