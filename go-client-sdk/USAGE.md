<!-- Start SDK Example Usage -->
```go
package main

import (
    "context"
    "log"
    "Person"
    "Person/pkg/models/shared"
    "Person/pkg/models/operations"
)

func main() {
    s := sdk.New()

    ctx := context.Background()    
    req := operations.FindPersonRequest{
        Company: "Medhurst - Rau",
        CompanyDomain: "quibusdam",
        Email: "Ryan.Little62@yahoo.com",
        Facebook: "deserunt",
        FamilyName: "suscipit",
        GivenName: "iure",
        IPAddress: "magnam",
        Linkedin: "debitis",
        Location: "ipsa",
        Twitter: "delectus",
        WebhookURL: "tempora",
    }

    res, err := s.FindPerson(ctx, req)
    if err != nil {
        log.Fatal(err)
    }

    if res.Person != nil {
        // handle response
    }
}
```
<!-- End SDK Example Usage -->