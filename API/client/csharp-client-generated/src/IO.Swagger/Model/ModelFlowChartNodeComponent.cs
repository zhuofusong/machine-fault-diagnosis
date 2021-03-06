/* 
 * Machine fault diagnosis
 *
 * List of top level server APIs
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// ModelFlowChartNodeComponent
    /// </summary>
    [DataContract]
        public partial class ModelFlowChartNodeComponent :  IEquatable<ModelFlowChartNodeComponent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelFlowChartNodeComponent" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="linkedNodeId">linkedNodeId.</param>
        /// <param name="fixedConfig">user-defined fixed config.</param>
        /// <param name="componentSubGraph">componentSubGraph.</param>
        public ModelFlowChartNodeComponent(string id = default(string), string linkedNodeId = default(string), Object fixedConfig = default(Object), ModelFlowChart componentSubGraph = default(ModelFlowChart))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for ModelFlowChartNodeComponent and cannot be null");
            }
            else
            {
                this.Id = id;
            }
            this.LinkedNodeId = linkedNodeId;
            this.FixedConfig = fixedConfig;
            this.ComponentSubGraph = componentSubGraph;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets LinkedNodeId
        /// </summary>
        [DataMember(Name="linked_node_id", EmitDefaultValue=false)]
        public string LinkedNodeId { get; set; }

        /// <summary>
        /// user-defined fixed config
        /// </summary>
        /// <value>user-defined fixed config</value>
        [DataMember(Name="fixed_config", EmitDefaultValue=false)]
        public Object FixedConfig { get; set; }

        /// <summary>
        /// Gets or Sets ComponentSubGraph
        /// </summary>
        [DataMember(Name="component_sub_graph", EmitDefaultValue=false)]
        public ModelFlowChart ComponentSubGraph { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModelFlowChartNodeComponent {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LinkedNodeId: ").Append(LinkedNodeId).Append("\n");
            sb.Append("  FixedConfig: ").Append(FixedConfig).Append("\n");
            sb.Append("  ComponentSubGraph: ").Append(ComponentSubGraph).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ModelFlowChartNodeComponent);
        }

        /// <summary>
        /// Returns true if ModelFlowChartNodeComponent instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelFlowChartNodeComponent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelFlowChartNodeComponent input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.LinkedNodeId == input.LinkedNodeId ||
                    (this.LinkedNodeId != null &&
                    this.LinkedNodeId.Equals(input.LinkedNodeId))
                ) && 
                (
                    this.FixedConfig == input.FixedConfig ||
                    (this.FixedConfig != null &&
                    this.FixedConfig.Equals(input.FixedConfig))
                ) && 
                (
                    this.ComponentSubGraph == input.ComponentSubGraph ||
                    (this.ComponentSubGraph != null &&
                    this.ComponentSubGraph.Equals(input.ComponentSubGraph))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.LinkedNodeId != null)
                    hashCode = hashCode * 59 + this.LinkedNodeId.GetHashCode();
                if (this.FixedConfig != null)
                    hashCode = hashCode * 59 + this.FixedConfig.GetHashCode();
                if (this.ComponentSubGraph != null)
                    hashCode = hashCode * 59 + this.ComponentSubGraph.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
