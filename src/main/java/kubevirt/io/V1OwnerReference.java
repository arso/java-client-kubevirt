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

/**
 * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
 */
@ApiModel(description = "OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1OwnerReference {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("blockOwnerDeletion")
  private Boolean blockOwnerDeletion = null;

  @SerializedName("controller")
  private Boolean controller = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("uid")
  private String uid = null;

  public V1OwnerReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version of the referent.
   * @return apiVersion
  **/
  @ApiModelProperty(required = true, value = "API version of the referent.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1OwnerReference blockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

   /**
   * If true, AND if the owner has the \&quot;foregroundDeletion\&quot; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \&quot;delete\&quot; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
   * @return blockOwnerDeletion
  **/
  @ApiModelProperty(value = "If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.")
  public Boolean isBlockOwnerDeletion() {
    return blockOwnerDeletion;
  }

  public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
  }

  public V1OwnerReference controller(Boolean controller) {
    this.controller = controller;
    return this;
  }

   /**
   * If true, this reference points to the managing controller.
   * @return controller
  **/
  @ApiModelProperty(value = "If true, this reference points to the managing controller.")
  public Boolean isController() {
    return controller;
  }

  public void setController(Boolean controller) {
    this.controller = controller;
  }

  public V1OwnerReference kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1OwnerReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1OwnerReference uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OwnerReference v1OwnerReference = (V1OwnerReference) o;
    return Objects.equals(this.apiVersion, v1OwnerReference.apiVersion) &&
        Objects.equals(this.blockOwnerDeletion, v1OwnerReference.blockOwnerDeletion) &&
        Objects.equals(this.controller, v1OwnerReference.controller) &&
        Objects.equals(this.kind, v1OwnerReference.kind) &&
        Objects.equals(this.name, v1OwnerReference.name) &&
        Objects.equals(this.uid, v1OwnerReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OwnerReference {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    blockOwnerDeletion: ").append(toIndentedString(blockOwnerDeletion)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
