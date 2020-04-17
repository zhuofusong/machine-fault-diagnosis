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
    /// ModelFlowChartNode
    /// </summary>
    [DataContract]
        public partial class ModelFlowChartNode :  IEquatable<ModelFlowChartNode>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelFlowChartNode" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="fixedConfig">user-defined fixed config.</param>
        /// <param name="linkedEdges">all incoming and outgoing edges.</param>
        /// <param name="containedComponentsId">the id of the corresponding node components.</param>
        /// <param name="scripts">location in DB for retrieval of this node&#x27;s scripts.</param>
        public ModelFlowChartNode(string id = default(string), Object fixedConfig = default(Object), List<ModelFlowChartNodeLinkedEdges> linkedEdges = default(List<ModelFlowChartNodeLinkedEdges>), string containedComponentsId = default(string), string scripts = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for ModelFlowChartNode and cannot be null");
            }
            else
            {
                this.Id = id;
            }
            this.FixedConfig = fixedConfig;
            this.LinkedEdges = linkedEdges;
            this.ContainedComponentsId = containedComponentsId;
            this.Scripts = scripts;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// user-defined fixed config
        /// </summary>
        /// <value>user-defined fixed config</value>
        [DataMember(Name="fixed_config", EmitDefaultValue=false)]
        public Object FixedConfig { get; set; }

        /// <summary>
        /// all incoming and outgoing edges
        /// </summary>
        /// <value>all incoming and outgoing edges</value>
        [DataMember(Name="linked_edges", EmitDefaultValue=false)]
        public List<ModelFlowChartNodeLinkedEdges> LinkedEdges { get; set; }

        /// <summary>
        /// the id of the corresponding node components
        /// </summary>
        /// <value>the id of the corresponding node components</value>
        [DataMember(Name="contained_components_id", EmitDefaultValue=false)]
        public string ContainedComponentsId { get; set; }

        /// <summary>
        /// location in DB for retrieval of this node&#x27;s scripts
        /// </summary>
        /// <value>location in DB for retrieval of this node&#x27;s scripts</value>
        [DataMember(Name="scripts", EmitDefaultValue=false)]
        public string Scripts { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModelFlowChartNode {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  FixedConfig: ").Append(FixedConfig).Append("\n");
            sb.Append("  LinkedEdges: ").Append(LinkedEdges).Append("\n");
            sb.Append("  ContainedComponentsId: ").Append(ContainedComponentsId).Append("\n");
            sb.Append("  Scripts: ").Append(Scripts).Append("\n");
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
            return this.Equals(input as ModelFlowChartNode);
        }

        /// <summary>
        /// Returns true if ModelFlowChartNode instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelFlowChartNode to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelFlowChartNode input)
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
                    this.FixedConfig == input.FixedConfig ||
                    (this.FixedConfig != null &&
                    this.FixedConfig.Equals(input.FixedConfig))
                ) && 
                (
                    this.LinkedEdges == input.LinkedEdges ||
                    this.LinkedEdges != null &&
                    input.LinkedEdges != null &&
                    this.LinkedEdges.SequenceEqual(input.LinkedEdges)
                ) && 
                (
                    this.ContainedComponentsId == input.ContainedComponentsId ||
                    (this.ContainedComponentsId != null &&
                    this.ContainedComponentsId.Equals(input.ContainedComponentsId))
                ) && 
                (
                    this.Scripts == input.Scripts ||
                    (this.Scripts != null &&
                    this.Scripts.Equals(input.Scripts))
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
                if (this.FixedConfig != null)
                    hashCode = hashCode * 59 + this.FixedConfig.GetHashCode();
                if (this.LinkedEdges != null)
                    hashCode = hashCode * 59 + this.LinkedEdges.GetHashCode();
                if (this.ContainedComponentsId != null)
                    hashCode = hashCode * 59 + this.ContainedComponentsId.GetHashCode();
                if (this.Scripts != null)
                    hashCode = hashCode * 59 + this.Scripts.GetHashCode();
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
