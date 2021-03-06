/*
 * Machine fault diagnosis
 * List of top level server APIs
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ModelFlowChartEdgeMeta
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-16T08:54:30.701Z[GMT]")
public class ModelFlowChartEdgeMeta {
  @SerializedName("id")
  private String id = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("createdTime")
  private BigDecimal createdTime = null;

  @SerializedName("modifiedTime")
  private BigDecimal modifiedTime = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("comments")
  private String comments = null;

  public ModelFlowChartEdgeMeta id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ModelFlowChartEdgeMeta kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * the kind of string based on which
   * @return kind
  **/
  @Schema(required = true, description = "the kind of string based on which")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ModelFlowChartEdgeMeta createdTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public BigDecimal getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
  }

  public ModelFlowChartEdgeMeta modifiedTime(BigDecimal modifiedTime) {
    this.modifiedTime = modifiedTime;
    return this;
  }

   /**
   * Get modifiedTime
   * @return modifiedTime
  **/
  @Schema(description = "")
  public BigDecimal getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(BigDecimal modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  public ModelFlowChartEdgeMeta author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @Schema(description = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public ModelFlowChartEdgeMeta comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @Schema(description = "")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelFlowChartEdgeMeta modelFlowChartEdgeMeta = (ModelFlowChartEdgeMeta) o;
    return Objects.equals(this.id, modelFlowChartEdgeMeta.id) &&
        Objects.equals(this.kind, modelFlowChartEdgeMeta.kind) &&
        Objects.equals(this.createdTime, modelFlowChartEdgeMeta.createdTime) &&
        Objects.equals(this.modifiedTime, modelFlowChartEdgeMeta.modifiedTime) &&
        Objects.equals(this.author, modelFlowChartEdgeMeta.author) &&
        Objects.equals(this.comments, modelFlowChartEdgeMeta.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, createdTime, modifiedTime, author, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFlowChartEdgeMeta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
