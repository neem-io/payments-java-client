# PaymentsApi

All URIs are relative to *https://api.dev.neem.io/neem*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initiateWalletPayment**](PaymentsApi.md#initiateWalletPayment) | **POST** /api/v1/wallets/payment-initiate/{walletId} | Make Payments |
| [**walletBillInquiry**](PaymentsApi.md#walletBillInquiry) | **GET** /api/v1/wallets/bill/inquiry/{walletId} | Bill Inquiry |
| [**walletBillPayment**](PaymentsApi.md#walletBillPayment) | **POST** /api/v1/wallets/bill/payment/{walletId} | Bill Payment |
| [**walletPaymentInquiry**](PaymentsApi.md#walletPaymentInquiry) | **GET** /api/v1/wallets/payment-inquiry/{walletId} | Payment Inquiry |



## initiateWalletPayment

> Object initiateWalletPayment(walletId, xNeemId, xNeemPartnerId, body)

Make Payments

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        Integer walletId = 56; // Integer | 
        String xNeemId = "1234"; // String | 
        Integer xNeemPartnerId = 1234; // Integer | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.initiateWalletPayment(walletId, xNeemId, xNeemPartnerId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#initiateWalletPayment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **Integer**|  | |
| **xNeemId** | **String**|  | [optional] |
| **xNeemPartnerId** | **Integer**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[oAuth](../README.md#oAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  |


## walletBillInquiry

> Object walletBillInquiry(walletId, xNeemId, xNeemPartnerId, endToEndIdentification, productId, consumerNumber)

Bill Inquiry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String xNeemId = "1234"; // String | 
        Integer xNeemPartnerId = 1234; // Integer | 
        String endToEndIdentification = "endToEndIdentification_example"; // String | 
        String productId = "productId_example"; // String | 
        String consumerNumber = "consumerNumber_example"; // String | 
        try {
            Object result = apiInstance.walletBillInquiry(walletId, xNeemId, xNeemPartnerId, endToEndIdentification, productId, consumerNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#walletBillInquiry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **String**|  | |
| **xNeemId** | **String**|  | [optional] |
| **xNeemPartnerId** | **Integer**|  | [optional] |
| **endToEndIdentification** | **String**|  | [optional] |
| **productId** | **String**|  | [optional] |
| **consumerNumber** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[oAuth](../README.md#oAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  |


## walletBillPayment

> Object walletBillPayment(walletId, xNeemId, xNeemPartnerId, body)

Bill Payment

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        Integer walletId = 56; // Integer | 
        String xNeemId = "1234"; // String | 
        Integer xNeemPartnerId = 1234; // Integer | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.walletBillPayment(walletId, xNeemId, xNeemPartnerId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#walletBillPayment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **Integer**|  | |
| **xNeemId** | **String**|  | [optional] |
| **xNeemPartnerId** | **Integer**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[oAuth](../README.md#oAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  |


## walletPaymentInquiry

> Object walletPaymentInquiry(walletId, xNeemId, xNeemPartnerId, endToEndIdentification, paymentScheme, amount, currency, creditorIdentification, creditorName, creditorInstitutionIdentification, creditorSecondaryIdentification, extendedProperties)

Payment Inquiry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        PaymentsApi apiInstance = new PaymentsApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String xNeemId = "1234"; // String | 
        Integer xNeemPartnerId = 1234; // Integer | 
        String endToEndIdentification = "endToEndIdentification_example"; // String | 
        String paymentScheme = "paymentScheme_example"; // String | 
        String amount = "amount_example"; // String | 
        String currency = "currency_example"; // String | 
        String creditorIdentification = "creditorIdentification_example"; // String | 
        String creditorName = "creditorName_example"; // String | 
        String creditorInstitutionIdentification = "creditorInstitutionIdentification_example"; // String | 
        String creditorSecondaryIdentification = "creditorSecondaryIdentification_example"; // String | 
        List<Object> extendedProperties = null; // List<Object> | 
        try {
            Object result = apiInstance.walletPaymentInquiry(walletId, xNeemId, xNeemPartnerId, endToEndIdentification, paymentScheme, amount, currency, creditorIdentification, creditorName, creditorInstitutionIdentification, creditorSecondaryIdentification, extendedProperties);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#walletPaymentInquiry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **String**|  | |
| **xNeemId** | **String**|  | [optional] |
| **xNeemPartnerId** | **Integer**|  | [optional] |
| **endToEndIdentification** | **String**|  | [optional] |
| **paymentScheme** | **String**|  | [optional] |
| **amount** | **String**|  | [optional] |
| **currency** | **String**|  | [optional] |
| **creditorIdentification** | **String**|  | [optional] |
| **creditorName** | **String**|  | [optional] |
| **creditorInstitutionIdentification** | **String**|  | [optional] |
| **creditorSecondaryIdentification** | **String**|  | [optional] |
| **extendedProperties** | [**List&lt;Object&gt;**](Object.md)|  | [optional] |

### Return type

**Object**

### Authorization

[oAuth](../README.md#oAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  |

