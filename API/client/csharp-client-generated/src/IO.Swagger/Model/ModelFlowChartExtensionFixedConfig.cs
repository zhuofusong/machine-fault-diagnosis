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
    /// user-defined fixed configurations
    /// </summary>
    [DataContract]
        public partial class ModelFlowChartExtensionFixedConfig :  IEquatable<ModelFlowChartExtensionFixedConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelFlowChartExtensionFixedConfig" /> class.
        /// </summary>
        /// <param name="compatibility">list of model flow charts it is compatible with.</param>
        public ModelFlowChartExtensionFixedConfig(List<string> compatibility = default(List<string>))
        {
            this.Compatibility = compatibility;
        }
        
        /// <summary>
        /// list of model flow charts it is compatible with
        /// </summary>
        /// <value>list of model flow charts it is compatible with</value>
        [DataMember(Name="compatibility", EmitDefaultValue=false)]
        public List<string> Compatibility { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModelFlowChartExtensionFixedConfig {\n");
            sb.Append("  Compatibility: ").Append(Compatibility).Append("\n");
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
            return this.Equals(input as ModelFlowChartExtensionFixedConfig);
        }

        /// <summary>
        /// Returns true if ModelFlowChartExtensionFixedConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelFlowChartExtensionFixedConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelFlowChartExtensionFixedConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Compatibility == input.Compatibility ||
                    this.Compatibility != null &&
                    input.Compatibility != null &&
                    this.Compatibility.SequenceEqual(input.Compatibility)
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
                if (this.Compatibility != null)
                    hashCode = hashCode * 59 + this.Compatibility.GetHashCode();
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
