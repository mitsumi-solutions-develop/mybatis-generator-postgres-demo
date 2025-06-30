package io.github.mitsumi.solutions.mybatis.postgres.generated.json.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Address
 */

@JsonTypeName("address")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class Address {

  private @Nullable String formatted;

  private @Nullable String streetAddress;

  private @Nullable String locality;

  private @Nullable String region;

  private @Nullable String postalCode;

  private @Nullable String country;

  public Address formatted(@Nullable String formatted) {
    this.formatted = formatted;
    return this;
  }

  /**
   * Get formatted
   * @return formatted
   */
  
  @Schema(name = "formatted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formatted")
  public @Nullable String getFormatted() {
    return formatted;
  }

  public void setFormatted(@Nullable String formatted) {
    this.formatted = formatted;
  }

  public Address streetAddress(@Nullable String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Get streetAddress
   * @return streetAddress
   */
  
  @Schema(name = "street_address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street_address")
  public @Nullable String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(@Nullable String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public Address locality(@Nullable String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * city, locality
   * @return locality
   */
  
  @Schema(name = "locality", description = "city, locality", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locality")
  public @Nullable String getLocality() {
    return locality;
  }

  public void setLocality(@Nullable String locality) {
    this.locality = locality;
  }

  public Address region(@Nullable String region) {
    this.region = region;
    return this;
  }

  /**
   * state, province, prefecture, region
   * @return region
   */
  
  @Schema(name = "region", description = "state, province, prefecture, region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public @Nullable String getRegion() {
    return region;
  }

  public void setRegion(@Nullable String region) {
    this.region = region;
  }

  public Address postalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
   */
  
  @Schema(name = "postal_code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postal_code")
  public @Nullable String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
  }

  public Address country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  
  @Schema(name = "country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable String getCountry() {
    return country;
  }

  public void setCountry(@Nullable String country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.formatted, address.formatted) &&
        Objects.equals(this.streetAddress, address.streetAddress) &&
        Objects.equals(this.locality, address.locality) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatted, streetAddress, locality, region, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

