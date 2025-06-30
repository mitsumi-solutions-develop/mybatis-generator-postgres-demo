package io.github.mitsumi.solutions.mybatis.postgres.generated.json.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.mitsumi.solutions.mybatis.postgres.generated.json.models.Address;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserProfile
 */

@JsonTypeName("user_profile")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class UserProfile {

  private @Nullable String familyName;

  private @Nullable String givenName;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female"),
    
    OTHER("other");

    private final String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable GenderEnum gender;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate birthday;

  private @Nullable Address address;

  public UserProfile familyName(@Nullable String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Get familyName
   * @return familyName
   */
  
  @Schema(name = "family_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("family_name")
  public @Nullable String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(@Nullable String familyName) {
    this.familyName = familyName;
  }

  public UserProfile givenName(@Nullable String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
   */
  
  @Schema(name = "given_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("given_name")
  public @Nullable String getGivenName() {
    return givenName;
  }

  public void setGivenName(@Nullable String givenName) {
    this.givenName = givenName;
  }

  public UserProfile gender(@Nullable GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable GenderEnum getGender() {
    return gender;
  }

  public void setGender(@Nullable GenderEnum gender) {
    this.gender = gender;
  }

  public UserProfile birthday(@Nullable LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   */
  @Valid 
  @Schema(name = "birthday", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthday")
  public @Nullable LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(@Nullable LocalDate birthday) {
    this.birthday = birthday;
  }

  public UserProfile address(@Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable Address getAddress() {
    return address;
  }

  public void setAddress(@Nullable Address address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.familyName, userProfile.familyName) &&
        Objects.equals(this.givenName, userProfile.givenName) &&
        Objects.equals(this.gender, userProfile.gender) &&
        Objects.equals(this.birthday, userProfile.birthday) &&
        Objects.equals(this.address, userProfile.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyName, givenName, gender, birthday, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

