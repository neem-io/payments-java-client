# payment-sdk

Payments

- API version: 1.0.3

- Build date: 2023-01-16T04:24:09.739426300+05:30[Asia/Colombo]

Enable your customers to make intrabank or IBFT payments through our payment APIs.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>neem.io</groupId>
  <artifactId>payment-sdk</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'payment-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'payment-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "neem.io:payment-sdk:0.0.1-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/payment-sdk-0.0.1-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PaymentsApi;

public class PaymentsApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *https://api.dev.neem.io/neem*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PaymentsApi* | [**initiateWalletPayment**](docs/PaymentsApi.md#initiateWalletPayment) | **POST** /api/v1/wallets/payment-initiate/{walletId} | Make Payments
*PaymentsApi* | [**walletBillInquiry**](docs/PaymentsApi.md#walletBillInquiry) | **GET** /api/v1/wallets/bill/inquiry/{walletId} | Bill Inquiry
*PaymentsApi* | [**walletBillPayment**](docs/PaymentsApi.md#walletBillPayment) | **POST** /api/v1/wallets/bill/payment/{walletId} | Bill Payment
*PaymentsApi* | [**walletPaymentInquiry**](docs/PaymentsApi.md#walletPaymentInquiry) | **GET** /api/v1/wallets/payment-inquiry/{walletId} | Payment Inquiry


## Documentation for Models



## Documentation for Authorization

Authentication schemes defined for the API:
### oAuth


- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - email: email identified as scope


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



