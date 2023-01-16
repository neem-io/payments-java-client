package org.openapitools.client.api;

import org.openapitools.client.ApiClient;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T04:24:09.739426300+05:30[Asia/Colombo]")
@Component("org.openapitools.client.api.PaymentsApi")
public class PaymentsApi {
    private ApiClient apiClient;

    public PaymentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Make Payments
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemId  (optional)
     * @param xNeemPartnerId  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object initiateWalletPayment(Integer walletId, String xNeemId, Integer xNeemPartnerId, Object body) throws RestClientException {
        return initiateWalletPaymentWithHttpInfo(walletId, xNeemId, xNeemPartnerId, body).getBody();
    }

    /**
     * Make Payments
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemId  (optional)
     * @param xNeemPartnerId  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> initiateWalletPaymentWithHttpInfo(Integer walletId, String xNeemId, Integer xNeemPartnerId, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling initiateWalletPayment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xNeemId != null)
        localVarHeaderParams.add("X-Neem-Id", apiClient.parameterToString(xNeemId));
        if (xNeemPartnerId != null)
        localVarHeaderParams.add("X-Neem-Partner-Id", apiClient.parameterToString(xNeemPartnerId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/wallets/payment-initiate/{walletId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Bill Inquiry
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemId  (optional)
     * @param xNeemPartnerId  (optional)
     * @param endToEndIdentification  (optional)
     * @param productId  (optional)
     * @param consumerNumber  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object walletBillInquiry(String walletId, String xNeemId, Integer xNeemPartnerId, String endToEndIdentification, String productId, String consumerNumber) throws RestClientException {
        return walletBillInquiryWithHttpInfo(walletId, xNeemId, xNeemPartnerId, endToEndIdentification, productId, consumerNumber).getBody();
    }

    /**
     * Bill Inquiry
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemId  (optional)
     * @param xNeemPartnerId  (optional)
     * @param endToEndIdentification  (optional)
     * @param productId  (optional)
     * @param consumerNumber  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> walletBillInquiryWithHttpInfo(String walletId, String xNeemId, Integer xNeemPartnerId, String endToEndIdentification, String productId, String consumerNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling walletBillInquiry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endToEndIdentification", endToEndIdentification));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "productId", productId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumerNumber", consumerNumber));

        if (xNeemId != null)
        localVarHeaderParams.add("X-Neem-Id", apiClient.parameterToString(xNeemId));
        if (xNeemPartnerId != null)
        localVarHeaderParams.add("X-Neem-Partner-Id", apiClient.parameterToString(xNeemPartnerId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/wallets/bill/inquiry/{walletId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Bill Payment
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemId  (optional)
     * @param xNeemPartnerId  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object walletBillPayment(Integer walletId, String xNeemId, Integer xNeemPartnerId, Object body) throws RestClientException {
        return walletBillPaymentWithHttpInfo(walletId, xNeemId, xNeemPartnerId, body).getBody();
    }

    /**
     * Bill Payment
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemId  (optional)
     * @param xNeemPartnerId  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> walletBillPaymentWithHttpInfo(Integer walletId, String xNeemId, Integer xNeemPartnerId, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling walletBillPayment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xNeemId != null)
        localVarHeaderParams.add("X-Neem-Id", apiClient.parameterToString(xNeemId));
        if (xNeemPartnerId != null)
        localVarHeaderParams.add("X-Neem-Partner-Id", apiClient.parameterToString(xNeemPartnerId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/wallets/bill/payment/{walletId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Payment Inquiry
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemId  (optional)
     * @param xNeemPartnerId  (optional)
     * @param endToEndIdentification  (optional)
     * @param paymentScheme  (optional)
     * @param amount  (optional)
     * @param currency  (optional)
     * @param creditorIdentification  (optional)
     * @param creditorName  (optional)
     * @param creditorInstitutionIdentification  (optional)
     * @param creditorSecondaryIdentification  (optional)
     * @param extendedProperties  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object walletPaymentInquiry(String walletId, String xNeemId, Integer xNeemPartnerId, String endToEndIdentification, String paymentScheme, String amount, String currency, String creditorIdentification, String creditorName, String creditorInstitutionIdentification, String creditorSecondaryIdentification, List<Object> extendedProperties) throws RestClientException {
        return walletPaymentInquiryWithHttpInfo(walletId, xNeemId, xNeemPartnerId, endToEndIdentification, paymentScheme, amount, currency, creditorIdentification, creditorName, creditorInstitutionIdentification, creditorSecondaryIdentification, extendedProperties).getBody();
    }

    /**
     * Payment Inquiry
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemId  (optional)
     * @param xNeemPartnerId  (optional)
     * @param endToEndIdentification  (optional)
     * @param paymentScheme  (optional)
     * @param amount  (optional)
     * @param currency  (optional)
     * @param creditorIdentification  (optional)
     * @param creditorName  (optional)
     * @param creditorInstitutionIdentification  (optional)
     * @param creditorSecondaryIdentification  (optional)
     * @param extendedProperties  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> walletPaymentInquiryWithHttpInfo(String walletId, String xNeemId, Integer xNeemPartnerId, String endToEndIdentification, String paymentScheme, String amount, String currency, String creditorIdentification, String creditorName, String creditorInstitutionIdentification, String creditorSecondaryIdentification, List<Object> extendedProperties) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling walletPaymentInquiry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endToEndIdentification", endToEndIdentification));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "paymentScheme", paymentScheme));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "amount", amount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "creditorIdentification", creditorIdentification));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "creditorName", creditorName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "creditorInstitutionIdentification", creditorInstitutionIdentification));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "creditorSecondaryIdentification", creditorSecondaryIdentification));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "extendedProperties", extendedProperties));

        if (xNeemId != null)
        localVarHeaderParams.add("X-Neem-Id", apiClient.parameterToString(xNeemId));
        if (xNeemPartnerId != null)
        localVarHeaderParams.add("X-Neem-Partner-Id", apiClient.parameterToString(xNeemPartnerId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/wallets/payment-inquiry/{walletId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
