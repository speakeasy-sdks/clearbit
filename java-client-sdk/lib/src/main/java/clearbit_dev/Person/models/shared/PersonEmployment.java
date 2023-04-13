/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package clearbit_dev.Person.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonEmployment {
    /**
     * The domain of the company the person works for.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain")
    public String domain;
    public PersonEmployment withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    /**
     * The name of the company the person works for.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PersonEmployment withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The person's standardized role at the company they work for based on their title.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public String role;
    public PersonEmployment withRole(String role) {
        this.role = role;
        return this;
    }
    
    /**
     * The person's standardized seniority at the company they work for based on their title.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("seniority")
    public String seniority;
    public PersonEmployment withSeniority(String seniority) {
        this.seniority = seniority;
        return this;
    }
    
    /**
     * The person's standardized sub role at the company they work for based on their title.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subRole")
    public String subRole;
    public PersonEmployment withSubRole(String subRole) {
        this.subRole = subRole;
        return this;
    }
    
    /**
     * The person's title at the company they work for.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;
    public PersonEmployment withTitle(String title) {
        this.title = title;
        return this;
    }
    
}