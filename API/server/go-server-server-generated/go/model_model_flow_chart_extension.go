/*
 * Machine fault diagnosis
 *
 * List of top level server APIs
 *
 * API version: 1.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type ModelFlowChartExtension struct {

	Id string `json:"id"`

	FixedConfig *ModelFlowChartExtensionFixedConfig `json:"fixed_config,omitempty"`
	// the address in DB where the installation script is stored
	InstallScript string `json:"install_script,omitempty"`
	// where to retrieve the extension starting script
	StartScript string `json:"start_script,omitempty"`
}
