/*
 * package com.cipl.demo.security;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.oauth2.provider.ClientDetails; import
 * org.springframework.security.oauth2.provider.ClientDetailsService; import
 * org.springframework.security.oauth2.provider.ClientRegistrationException;
 * import org.springframework.security.oauth2.provider.client.BaseClientDetails;
 * 
 *//**
	 * Implementation service class for spring security client credentials
	 * validation
	 * 
	 *
	 *//*
		 * public class ClientDetailsServiceImpl implements ClientDetailsService {
		 * 
		 * public static final Logger LOG =
		 * LoggerFactory.getLogger(ClientDetailsServiceImpl.class);
		 * 
		 * @Autowired private ClientCredentialRepository clientCredentialRepo;
		 * 
		 * 
		 * (non-Javadoc)
		 * 
		 * @see org.springframework.security.oauth2.provider.ClientDetailsService#
		 * loadClientByClientId(java.lang.String)
		 * 
		 * @Override public ClientDetails loadClientByClientId(String clientApiKey)
		 * throws ClientRegistrationException {
		 * 
		 * LOG.info("Validating access credentials for API authorization. . . ");
		 * ClientCredential clientCredentials =
		 * clientCredentialRepo.findByClientApiKey(clientApiKey);
		 * 
		 * // get details from database BaseClientDetails clientDetails = new
		 * BaseClientDetails(clientCredentials.getClientApiKey(),
		 * clientCredentials.getResourceIds(), clientCredentials.getScopes(),
		 * clientCredentials.getGrantTypes(), clientCredentials.getAuthorities());
		 * 
		 * clientDetails.setAccessTokenValiditySeconds(clientCredentials.
		 * getAccessTokenValidity());
		 * clientDetails.setClientSecret(clientCredentials.getClientApiSecret());
		 * 
		 * return clientDetails; } }
		 */