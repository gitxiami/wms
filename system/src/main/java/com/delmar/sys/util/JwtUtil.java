/******************************************************************************
 * 版权所有 刘大磊 2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：13336390671                                                               *
 * email:ldlqdsd@126.com						                              *
 *****************************************************************************/
package com.delmar.sys.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.jose4j.lang.JoseException;

import com.delmar.sys.model.User;
import com.google.gson.Gson;

/**
 * @author 刘大磊 2015年5月18日 下午6:22:45
 */
public class JwtUtil {
	private static  RsaJsonWebKey rsaJsonWebKey;
	static
	{
		try {
			rsaJsonWebKey = RsaJwkGenerator.generateJwk(2048);
		} catch (JoseException e) {
			e.printStackTrace();
		}
		 // Give the JWK a Key ID (kid), which is just the polite thing to do
	    rsaJsonWebKey.setKeyId("chinAdElmar7#@10f");
	}


	public static String getTokenString(User user)
	{
		String token=null;
	  
	    // Create the Claims, which will be the content of the JWT
	    JwtClaims claims = new JwtClaims();
	    claims.setIssuer("MobileApp");  // who creates the token and signs it
	    claims.setAudience("Delmar"); // to whom the token is intended to be sent
	    //claims.setExpirationTimeMinutesInTheFuture(10); // time when the token will expire (10 minutes from now)
	    //设置token有效期为12个月
	    claims.setExpirationTimeMinutesInTheFuture(60*24*30*12); 
	    claims.setGeneratedJwtId(); // a unique identifier for the token
	    claims.setIssuedAtToNow();  // when the token was issued/created (now)
	    claims.setNotBeforeMinutesInThePast(2); // time before which the token is not yet valid (2 minutes ago)
	    
	    claims.setSubject("Security"); // the subject/principal is whom the token is about
	    claims.setClaim("userId",user.getId());
	    claims.setClaim("userName",user.getUsername());
	    claims.setClaim("loginName",user.getName());
	    //List<String> groups = Arrays.asList("group-one", "other-group", "group-three");
	    //claims.setStringListClaim("groups", groups); // multi-valued claims work too and will end up as a JSON array
	    // A JWT is a JWS and/or a JWE with JSON claims as the payload.
	    // In this example it is a JWS so we create a JsonWebSignature object.
	    JsonWebSignature jws = new JsonWebSignature();
	    // The payload of the JWS is JSON content of the JWT Claims
	    jws.setPayload(claims.toJson());
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+claims.toJson());
	    // The JWT is signed using the private key
	    jws.setKey(rsaJsonWebKey.getPrivateKey());

	    // Set the Key ID (kid) header because it's just the polite thing to do.
	    // We only have one key in this example but a using a Key ID helps
	    // facilitate a smooth key rollover process
	    jws.setKeyIdHeaderValue(rsaJsonWebKey.getKeyId());

	    // Set the signature algorithm on the JWT/JWS that will integrity protect the claims
	    jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);

	    // Sign the JWS and produce the compact serialization or the complete JWT/JWS
	    // representation, which is a string consisting of three dot ('.') separated
	    // base64url-encoded parts in the form Header.Payload.Signature
	    // If you wanted to encrypt it, you can simply set this jwt as the payload
	    // of a JsonWebEncryption object and set the cty (Content Type) header to "jwt".
	    try {
	    	token= jws.getCompactSerialization();
		} catch (JoseException e) {
			e.printStackTrace();
		}
		return token;
	}
	public static boolean  validateToken(String token)
	{
	    JwtConsumer jwtConsumer = new JwtConsumerBuilder()
        .setRequireExpirationTime() // the JWT must have an expiration time
        .setAllowedClockSkewInSeconds(30) // allow some leeway in validating time based claims to account for clock skew
        .setRequireSubject() // the JWT must have a subject claim
        .setExpectedIssuer("MobileApp") // whom the JWT needs to have been issued by
        .setExpectedAudience("Delmar") // to whom the JWT is intended for
        .setVerificationKey(rsaJsonWebKey.getKey()) // verify the signature with the public key
        .build(); // create the JwtConsumer instance

		try
		{
		    //  Validate the JWT and process it to the Claims
		    JwtClaims jwtClaims = jwtConsumer.processToClaims(token);
		    
		    //过期时间		    
		  
		    //用户名和ID
		    
		   
		   
		    return true;
		}
		catch (InvalidJwtException e)
		{
		    // InvalidJwtException will be thrown, if the JWT failed processing or validation in anyway.
		    // Hopefully with meaningful explanations(s) about what went wrong.
		    System.out.println("Invalid JWT! " + e);
		    return false;
		} catch (Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	
	
	public static JwtClaims getJwtClaims(String token)
	{
	    JwtConsumer jwtConsumer = new JwtConsumerBuilder()
        .setRequireExpirationTime() // the JWT must have an expiration time
        .setAllowedClockSkewInSeconds(30) // allow some leeway in validating time based claims to account for clock skew
        .setRequireSubject() // the JWT must have a subject claim
        .setExpectedIssuer("MobileApp") // whom the JWT needs to have been issued by
        .setExpectedAudience("Delmar") // to whom the JWT is intended for
        .setVerificationKey(rsaJsonWebKey.getKey()) // verify the signature with the public key
        .build(); // create the JwtConsumer instance

		try
		{
		    //  Validate the JWT and process it to the Claims
		    JwtClaims jwtClaims = jwtConsumer.processToClaims(token);
		    
		    return jwtClaims;
		}
		catch (InvalidJwtException e)
		{
		    // InvalidJwtException will be thrown, if the JWT failed processing or validation in anyway.
		    // Hopefully with meaningful explanations(s) about what went wrong.
		    System.out.println("Invalid JWT! " + e);
		    return null;
		} catch (Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	
	
}
