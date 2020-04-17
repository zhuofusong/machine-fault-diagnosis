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
    /// ModelFlowChartEdgeMeta
    /// </summary>
    [DataContract]
        public partial class ModelFlowChartEdgeMeta :  IEquatable<ModelFlowChartEdgeMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelFlowChartEdgeMeta" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="kind">the kind of string based on which (required).</param>
        /// <param name="createdTime">createdTime.</param>
        /// <param name="modifiedTime">modifiedTime.</param>
        /// <param name="author">author.</param>
        /// <param name="comments">comments.</param>
        public ModelFlowChartEdgeMeta(string id = default(string), string kind = default(string), decimal? createdTime = default(decimal?), decimal? modifiedTime = default(decimal?), string author = default(string), string comments = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for ModelFlowChartEdgeMeta and cannot be null");
            }
            else
            {
                this.Id = id;
            }
            // to ensure "kind" is required (not null)
            if (kind == null)
            {
                throw new InvalidDataException("kind is a required property for ModelFlowChartEdgeMeta and cannot be null");
            }
            else
            {
                this.Kind = kind;
            }
            this.CreatedTime = createdTime;
            this.ModifiedTime = modifiedTime;
            this.Author = author;
            this.Comments = comments;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// the kind of string based on which
        /// </summary>
        /// <value>the kind of string based on which</value>
        [DataMember(Name="kind", EmitDefaultValue=false)]
        public string Kind { get; set; }

        /// <summary>
        /// Gets or Sets CreatedTime
        /// </summary>
        [DataMember(Name="createdTime", EmitDefaultValue=false)]
        public decimal? CreatedTime { get; set; }

        /// <summary>
        /// Gets or Sets ModifiedTime
        /// </summary>
        [DataMember(Name="modifiedTime", EmitDefaultValue=false)]
        public decimal? ModifiedTime { get; set; }

        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [DataMember(Name="author", EmitDefaultValue=false)]
        public string Author { get; set; }

        /// <summary>
        /// Gets or Sets Comments
        /// </summary>
        [DataMember(Name="comments", EmitDefaultValue=false)]
        public string Comments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModelFlowChartEdgeMeta {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Kind: ").Append(Kind).Append("\n");
            sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
            sb.Append("  ModifiedTime: ").Append(ModifiedTime).Append("\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  Comments: ").Append(Comments).Append("\n");
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
            return this.Equals(input as ModelFlowChartEdgeMeta);
        }

        /// <summary>
        /// Returns true if ModelFlowChartEdgeMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelFlowChartEdgeMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelFlowChartEdgeMeta input)
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
                    this.Kind == input.Kind ||
                    (this.Kind != null &&
                    this.Kind.Equals(input.Kind))
                ) && 
                (
                    this.CreatedTime == input.CreatedTime ||
                    (this.CreatedTime != null &&
                    this.CreatedTime.Equals(input.CreatedTime))
                ) && 
                (
                    this.ModifiedTime == input.ModifiedTime ||
                    (this.ModifiedTime != null &&
                    this.ModifiedTime.Equals(input.ModifiedTime))
                ) && 
                (
                    this.Author == input.Author ||
                    (this.Author != null &&
                    this.Author.Equals(input.Author))
                ) && 
                (
                    this.Comments == input.Comments ||
                    (this.Comments != null &&
                    this.Comments.Equals(input.Comments))
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
                if (this.Kind != null)
                    hashCode = hashCode * 59 + this.Kind.GetHashCode();
                if (this.CreatedTime != null)
                    hashCode = hashCode * 59 + this.CreatedTime.GetHashCode();
                if (this.ModifiedTime != null)
                    hashCode = hashCode * 59 + this.ModifiedTime.GetHashCode();
                if (this.Author != null)
                    hashCode = hashCode * 59 + this.Author.GetHashCode();
                if (this.Comments != null)
                    hashCode = hashCode * 59 + this.Comments.GetHashCode();
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
