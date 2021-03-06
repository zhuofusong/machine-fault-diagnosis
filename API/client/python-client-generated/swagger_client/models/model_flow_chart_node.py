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


class ModelFlowChartNode(object):
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
        'id': 'str',
        'fixed_config': 'object',
        'linked_edges': 'list[ModelFlowChartNodeLinkedEdges]',
        'contained_components_id': 'str',
        'scripts': 'str'
    }

    attribute_map = {
        'id': 'id',
        'fixed_config': 'fixed_config',
        'linked_edges': 'linked_edges',
        'contained_components_id': 'contained_components_id',
        'scripts': 'scripts'
    }

    def __init__(self, id=None, fixed_config=None, linked_edges=None, contained_components_id=None, scripts=None):  # noqa: E501
        """ModelFlowChartNode - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._fixed_config = None
        self._linked_edges = None
        self._contained_components_id = None
        self._scripts = None
        self.discriminator = None
        self.id = id
        if fixed_config is not None:
            self.fixed_config = fixed_config
        if linked_edges is not None:
            self.linked_edges = linked_edges
        if contained_components_id is not None:
            self.contained_components_id = contained_components_id
        if scripts is not None:
            self.scripts = scripts

    @property
    def id(self):
        """Gets the id of this ModelFlowChartNode.  # noqa: E501


        :return: The id of this ModelFlowChartNode.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ModelFlowChartNode.


        :param id: The id of this ModelFlowChartNode.  # noqa: E501
        :type: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def fixed_config(self):
        """Gets the fixed_config of this ModelFlowChartNode.  # noqa: E501

        user-defined fixed config  # noqa: E501

        :return: The fixed_config of this ModelFlowChartNode.  # noqa: E501
        :rtype: object
        """
        return self._fixed_config

    @fixed_config.setter
    def fixed_config(self, fixed_config):
        """Sets the fixed_config of this ModelFlowChartNode.

        user-defined fixed config  # noqa: E501

        :param fixed_config: The fixed_config of this ModelFlowChartNode.  # noqa: E501
        :type: object
        """

        self._fixed_config = fixed_config

    @property
    def linked_edges(self):
        """Gets the linked_edges of this ModelFlowChartNode.  # noqa: E501

        all incoming and outgoing edges  # noqa: E501

        :return: The linked_edges of this ModelFlowChartNode.  # noqa: E501
        :rtype: list[ModelFlowChartNodeLinkedEdges]
        """
        return self._linked_edges

    @linked_edges.setter
    def linked_edges(self, linked_edges):
        """Sets the linked_edges of this ModelFlowChartNode.

        all incoming and outgoing edges  # noqa: E501

        :param linked_edges: The linked_edges of this ModelFlowChartNode.  # noqa: E501
        :type: list[ModelFlowChartNodeLinkedEdges]
        """

        self._linked_edges = linked_edges

    @property
    def contained_components_id(self):
        """Gets the contained_components_id of this ModelFlowChartNode.  # noqa: E501

        the id of the corresponding node components  # noqa: E501

        :return: The contained_components_id of this ModelFlowChartNode.  # noqa: E501
        :rtype: str
        """
        return self._contained_components_id

    @contained_components_id.setter
    def contained_components_id(self, contained_components_id):
        """Sets the contained_components_id of this ModelFlowChartNode.

        the id of the corresponding node components  # noqa: E501

        :param contained_components_id: The contained_components_id of this ModelFlowChartNode.  # noqa: E501
        :type: str
        """

        self._contained_components_id = contained_components_id

    @property
    def scripts(self):
        """Gets the scripts of this ModelFlowChartNode.  # noqa: E501

        location in DB for retrieval of this node's scripts  # noqa: E501

        :return: The scripts of this ModelFlowChartNode.  # noqa: E501
        :rtype: str
        """
        return self._scripts

    @scripts.setter
    def scripts(self, scripts):
        """Sets the scripts of this ModelFlowChartNode.

        location in DB for retrieval of this node's scripts  # noqa: E501

        :param scripts: The scripts of this ModelFlowChartNode.  # noqa: E501
        :type: str
        """

        self._scripts = scripts

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
        if issubclass(ModelFlowChartNode, dict):
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
        if not isinstance(other, ModelFlowChartNode):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
