<!-- Start SDK Example Usage -->
```typescript
import {
  FindPersonRequest,
  FindPersonResponse
} from "Person/dist/sdk/models/operations";

import { AxiosError } from "axios";
import { SDK } from "Person";
const sdk = new SDK();

const req: FindPersonRequest = {
  company: "Medhurst - Rau",
  companyDomain: "quibusdam",
  email: "Ryan.Little62@yahoo.com",
  facebook: "deserunt",
  familyName: "suscipit",
  givenName: "iure",
  ipAddress: "magnam",
  linkedin: "debitis",
  location: "ipsa",
  twitter: "delectus",
  webhookUrl: "tempora",
};

sdk.findPerson(req).then((res: FindPersonResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->