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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import kubevirt.io.V1DomainSpec;
import kubevirt.io.V1LabelSelector;

/**
 * V1VirtualMachineInstancePresetSpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1VirtualMachineInstancePresetSpec {
  @SerializedName("domain")
  private V1DomainSpec domain = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  public V1VirtualMachineInstancePresetSpec domain(V1DomainSpec domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Domain is the same object type as contained in VirtualMachineInstanceSpec
   * @return domain
  **/
  @ApiModelProperty(value = "Domain is the same object type as contained in VirtualMachineInstanceSpec")
  public V1DomainSpec getDomain() {
    return domain;
  }

  public void setDomain(V1DomainSpec domain) {
    this.domain = domain;
  }

  public V1VirtualMachineInstancePresetSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Selector is a label query over a set of VMIs. Required.
   * @return selector
  **/
  @ApiModelProperty(required = true, value = "Selector is a label query over a set of VMIs. Required.")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VirtualMachineInstancePresetSpec v1VirtualMachineInstancePresetSpec = (V1VirtualMachineInstancePresetSpec) o;
    return Objects.equals(this.domain, v1VirtualMachineInstancePresetSpec.domain) &&
        Objects.equals(this.selector, v1VirtualMachineInstancePresetSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, selector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VirtualMachineInstancePresetSpec {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
