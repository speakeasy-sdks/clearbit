<!-- Start SDK Example Usage -->
```java
package hello.world;

import clearbit_dev.Person.SDK;

import clearbit_dev.Person.models.operations.FindPersonRequest;
import clearbit_dev.Person.models.operations.FindPersonResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            FindPersonRequest req = new FindPersonRequest() {{
                company = "Medhurst - Rau";
                companyDomain = "quibusdam";
                email = "Ryan.Little62@yahoo.com";
                facebook = "deserunt";
                familyName = "suscipit";
                givenName = "iure";
                ipAddress = "magnam";
                linkedin = "debitis";
                location = "ipsa";
                twitter = "delectus";
                webhookUrl = "tempora";
            }}            

            FindPersonResponse res = sdk.findPerson(req);

            if (res.person.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->