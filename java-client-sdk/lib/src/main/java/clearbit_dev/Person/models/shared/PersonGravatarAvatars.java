/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package clearbit_dev.Person.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonGravatarAvatars {
    /**
     * The type of picture listed by the person on their Gravatar profile.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public PersonGravatarAvatars withType(String type) {
        this.type = type;
        return this;
    }
    
    /**
     * The URL of a picture listed by the person on their Gravatar profile.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;
    public PersonGravatarAvatars withUrl(String url) {
        this.url = url;
        return this;
    }
    
}
