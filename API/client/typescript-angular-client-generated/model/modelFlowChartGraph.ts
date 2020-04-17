/**
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
import { ModelFlowChartEdgeMeta } from './modelFlowChartEdgeMeta';
import { ModelFlowChartExtensionMeta } from './modelFlowChartExtensionMeta';
import { ModelFlowChartNodeComponentMeta } from './modelFlowChartNodeComponentMeta';
import { ModelFlowChartNodeMeta } from './modelFlowChartNodeMeta';

export interface ModelFlowChartGraph { 
    nodes: Array<ModelFlowChartNodeMeta>;
    nodeComponents?: Array<ModelFlowChartNodeComponentMeta>;
    edges: Array<ModelFlowChartEdgeMeta>;
    extensions?: Array<ModelFlowChartExtensionMeta>;
}