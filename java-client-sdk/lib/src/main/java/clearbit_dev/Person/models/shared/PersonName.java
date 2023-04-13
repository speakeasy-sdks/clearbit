/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package clearbit_dev.Person.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonName {
    /**
     * The person's last name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("familyName")
    public String familyName;
    public PersonName withFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }
    
    /**
     * The person's full name. This may exist even if the givenName or familyName aren't available.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fullName")
    public String fullName;
    public PersonName withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    
    /**
     * The person's first name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("givenName")
    public String givenName;
    public PersonName withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }
    
}