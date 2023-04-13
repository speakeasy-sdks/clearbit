<!-- Start SDK Example Usage -->
```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK()


req = operations.FindPersonRequest(
    company="Medhurst - Rau",
    company_domain="quibusdam",
    email="Ryan.Little62@yahoo.com",
    facebook="deserunt",
    family_name="suscipit",
    given_name="iure",
    ip_address="magnam",
    linkedin="debitis",
    location="ipsa",
    twitter="delectus",
    webhook_url="tempora",
)
    
res = s.find_person(req)

if res.person is not None:
    # handle response
```
<!-- End SDK Example Usage -->