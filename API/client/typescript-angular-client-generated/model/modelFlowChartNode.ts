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
import { ModelFlowChartNodeLinkedEdges } from './modelFlowChartNodeLinkedEdges';

export interface ModelFlowChartNode { 
    id: string;
    /**
     * user-defined fixed config
     */
    fixedConfig?: any;
    /**
     * all incoming and outgoing edges
     */
    linkedEdges?: Array<ModelFlowChartNodeLinkedEdges>;
    /**
     * the id of the corresponding node components
     */
    containedComponentsId?: string;
    /**
     * location in DB for retrieval of this node's scripts
     */
    scripts?: string;
}