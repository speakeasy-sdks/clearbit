# Person

<!-- Start SDK Installation -->
## SDK Installation

```bash
pip install git+https://github.com/speakeasy-sdks/clearbit.git#subdirectory=python-client-sdk
```
<!-- End SDK Installation -->

## SDK Example Usage
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

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### SDK SDK

* `find_person` - Look up a person by their email address
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
