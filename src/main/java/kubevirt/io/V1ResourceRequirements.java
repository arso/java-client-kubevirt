/*
 * KubeVirt API
 * This is KubeVirt API an add-on for Kubernetes.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: kubevirt-dev@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package kubevirt.io;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * V1ResourceRequirements
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1ResourceRequirements {
  @SerializedName("limits")
  private Map<String, String> limits = null;

  @SerializedName("overcommitGuestOverhead")
  private Boolean overcommitGuestOverhead = null;

  @SerializedName("requests")
  private Map<String, String> requests = null;

  public V1ResourceRequirements limits(Map<String, String> limits) {
    this.limits = limits;
    return this;
  }

  public V1ResourceRequirements putLimitsItem(String key, String limitsItem) {
      if (this.limits == null) {
          this.limits = new HashMap<>();
      }
      this.limits.put(key, limitsItem);
      return this;
  }

   /**
   * Limits describes the maximum amount of compute resources allowed. Valid resource keys are \&quot;memory\&quot; and \&quot;cpu\&quot;. +optional
   * @return limits
  **/
  @ApiModelProperty(value = "Limits describes the maximum amount of compute resources allowed. Valid resource keys are \"memory\" and \"cpu\". +optional")
  public Map<String, String> getLimits() {
    return limits;
  }

  public void setLimits(Map<String, String> limits) {
    this.limits = limits;
  }

  public V1ResourceRequirements overcommitGuestOverhead(Boolean overcommitGuestOverhead) {
    this.overcommitGuestOverhead = overcommitGuestOverhead;
    return this;
  }

   /**
   * Don&#39;t ask the scheduler to take the guest-management overhead into account. Instead put the overhead only into the container&#39;s memory limit. This can lead to crashes if all memory is in use on a node. Defaults to false.
   * @return overcommitGuestOverhead
  **/
  @ApiModelProperty(value = "Don't ask the scheduler to take the guest-management overhead into account. Instead put the overhead only into the container's memory limit. This can lead to crashes if all memory is in use on a node. Defaults to false.")
  public Boolean isOvercommitGuestOverhead() {
    return overcommitGuestOverhead;
  }

  public void setOvercommitGuestOverhead(Boolean overcommitGuestOverhead) {
    this.overcommitGuestOverhead = overcommitGuestOverhead;
  }

  public V1ResourceRequirements requests(Map<String, String> requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Requests is a description of the initial vmi resources. Valid resource keys are \&quot;memory\&quot; and \&quot;cpu\&quot;. +optional
   * @return requests
  **/
  @ApiModelProperty(value = "Requests is a description of the initial vmi resources. Valid resource keys are \"memory\" and \"cpu\". +optional")
  public Map<String, String> getRequests() {
    return requests;
  }

  public void setRequests(Map<String, String> requests) {
    this.requests = requests;
  }

  public V1ResourceRequirements putRequestsItem(String key, String requestsItem) {
      if (this.requests == null) {
          this.requests = new HashMap<>();
      }
      this.requests.put(key, requestsItem);
      return this;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceRequirements v1ResourceRequirements = (V1ResourceRequirements) o;
    return Objects.equals(this.limits, v1ResourceRequirements.limits) &&
        Objects.equals(this.overcommitGuestOverhead, v1ResourceRequirements.overcommitGuestOverhead) &&
        Objects.equals(this.requests, v1ResourceRequirements.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, overcommitGuestOverhead, requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceRequirements {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    overcommitGuestOverhead: ").append(toIndentedString(overcommitGuestOverhead)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
