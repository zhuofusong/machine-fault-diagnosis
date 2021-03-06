# coding: utf-8

"""
    Machine fault diagnosis

    List of top level server APIs  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six


class ModelFlowChartGraph(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'nodes': 'list[ModelFlowChartNodeMeta]',
        'node_components': 'list[ModelFlowChartNodeComponentMeta]',
        'edges': 'list[ModelFlowChartEdgeMeta]',
        'extensions': 'list[ModelFlowChartExtensionMeta]'
    }

    attribute_map = {
        'nodes': 'nodes',
        'node_components': 'node_components',
        'edges': 'edges',
        'extensions': 'extensions'
    }

    def __init__(self, nodes=None, node_components=None, edges=None, extensions=None):  # noqa: E501
        """ModelFlowChartGraph - a model defined in Swagger"""  # noqa: E501
        self._nodes = None
        self._node_components = None
        self._edges = None
        self._extensions = None
        self.discriminator = None
        self.nodes = nodes
        if node_components is not None:
            self.node_components = node_components
        self.edges = edges
        if extensions is not None:
            self.extensions = extensions

    @property
    def nodes(self):
        """Gets the nodes of this ModelFlowChartGraph.  # noqa: E501


        :return: The nodes of this ModelFlowChartGraph.  # noqa: E501
        :rtype: list[ModelFlowChartNodeMeta]
        """
        return self._nodes

    @nodes.setter
    def nodes(self, nodes):
        """Sets the nodes of this ModelFlowChartGraph.


        :param nodes: The nodes of this ModelFlowChartGraph.  # noqa: E501
        :type: list[ModelFlowChartNodeMeta]
        """
        if nodes is None:
            raise ValueError("Invalid value for `nodes`, must not be `None`")  # noqa: E501

        self._nodes = nodes

    @property
    def node_components(self):
        """Gets the node_components of this ModelFlowChartGraph.  # noqa: E501


        :return: The node_components of this ModelFlowChartGraph.  # noqa: E501
        :rtype: list[ModelFlowChartNodeComponentMeta]
        """
        return self._node_components

    @node_components.setter
    def node_components(self, node_components):
        """Sets the node_components of this ModelFlowChartGraph.


        :param node_components: The node_components of this ModelFlowChartGraph.  # noqa: E501
        :type: list[ModelFlowChartNodeComponentMeta]
        """

        self._node_components = node_components

    @property
    def edges(self):
        """Gets the edges of this ModelFlowChartGraph.  # noqa: E501


        :return: The edges of this ModelFlowChartGraph.  # noqa: E501
        :rtype: list[ModelFlowChartEdgeMeta]
        """
        return self._edges

    @edges.setter
    def edges(self, edges):
        """Sets the edges of this ModelFlowChartGraph.


        :param edges: The edges of this ModelFlowChartGraph.  # noqa: E501
        :type: list[ModelFlowChartEdgeMeta]
        """
        if edges is None:
            raise ValueError("Invalid value for `edges`, must not be `None`")  # noqa: E501

        self._edges = edges

    @property
    def extensions(self):
        """Gets the extensions of this ModelFlowChartGraph.  # noqa: E501


        :return: The extensions of this ModelFlowChartGraph.  # noqa: E501
        :rtype: list[ModelFlowChartExtensionMeta]
        """
        return self._extensions

    @extensions.setter
    def extensions(self, extensions):
        """Sets the extensions of this ModelFlowChartGraph.


        :param extensions: The extensions of this ModelFlowChartGraph.  # noqa: E501
        :type: list[ModelFlowChartExtensionMeta]
        """

        self._extensions = extensions

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(ModelFlowChartGraph, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ModelFlowChartGraph):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
