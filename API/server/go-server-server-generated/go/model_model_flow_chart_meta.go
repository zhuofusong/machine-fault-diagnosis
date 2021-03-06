/*
 * Machine fault diagnosis
 *
 * List of top level server APIs
 *
 * API version: 1.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type ModelFlowChartMeta struct {

	Id string `json:"id"`

	Kind string `json:"kind"`

	CreatedTime *BigDecimal `json:"createdTime,omitempty"`

	LastModifiedTime *BigDecimal `json:"lastModifiedTime,omitempty"`

	Author string `json:"author,omitempty"`

	EditMode string `json:"editMode,omitempty"`

	Config *interface{} `json:"config,omitempty"`

	Comments string `json:"comments,omitempty"`
}
