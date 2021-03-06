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
/**
 * ModelFlowChartNodeLinkedEdges
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-16T08:54:30.701Z[GMT]")
public class ModelFlowChartNodeLinkedEdges {
  @SerializedName("direction")
  private String direction = null;

  @SerializedName("edge_data_flow")
  private Object edgeDataFlow = null;

  public ModelFlowChartNodeLinkedEdges direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @Schema(description = "")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public ModelFlowChartNodeLinkedEdges edgeDataFlow(Object edgeDataFlow) {
    this.edgeDataFlow = edgeDataFlow;
    return this;
  }

   /**
   * variable mapping between two nodes
   * @return edgeDataFlow
  **/
  @Schema(description = "variable mapping between two nodes")
  public Object getEdgeDataFlow() {
    return edgeDataFlow;
  }

  public void setEdgeDataFlow(Object edgeDataFlow) {
    this.edgeDataFlow = edgeDataFlow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelFlowChartNodeLinkedEdges modelFlowChartNodeLinkedEdges = (ModelFlowChartNodeLinkedEdges) o;
    return Objects.equals(this.direction, modelFlowChartNodeLinkedEdges.direction) &&
        Objects.equals(this.edgeDataFlow, modelFlowChartNodeLinkedEdges.edgeDataFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, edgeDataFlow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFlowChartNodeLinkedEdges {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    edgeDataFlow: ").append(toIndentedString(edgeDataFlow)).append("\n");
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
