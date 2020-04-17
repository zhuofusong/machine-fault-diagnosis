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


class ModelFlowChartNodeMeta(object):
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
        'kind': 'str',
        'created_time': 'float',
        'modified_time': 'float',
        'author': 'str',
        'comments': 'str'
    }

    attribute_map = {
        'id': 'id',
        'kind': 'kind',
        'created_time': 'createdTime',
        'modified_time': 'modifiedTime',
        'author': 'author',
        'comments': 'comments'
    }

    def __init__(self, id=None, kind=None, created_time=None, modified_time=None, author=None, comments=None):  # noqa: E501
        """ModelFlowChartNodeMeta - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._kind = None
        self._created_time = None
        self._modified_time = None
        self._author = None
        self._comments = None
        self.discriminator = None
        self.id = id
        self.kind = kind
        if created_time is not None:
            self.created_time = created_time
        if modified_time is not None:
            self.modified_time = modified_time
        if author is not None:
            self.author = author
        if comments is not None:
            self.comments = comments

    @property
    def id(self):
        """Gets the id of this ModelFlowChartNodeMeta.  # noqa: E501


        :return: The id of this ModelFlowChartNodeMeta.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ModelFlowChartNodeMeta.


        :param id: The id of this ModelFlowChartNodeMeta.  # noqa: E501
        :type: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def kind(self):
        """Gets the kind of this ModelFlowChartNodeMeta.  # noqa: E501

        what kind of node it is. A 'simple' node or a supernode.  # noqa: E501

        :return: The kind of this ModelFlowChartNodeMeta.  # noqa: E501
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind):
        """Sets the kind of this ModelFlowChartNodeMeta.

        what kind of node it is. A 'simple' node or a supernode.  # noqa: E501

        :param kind: The kind of this ModelFlowChartNodeMeta.  # noqa: E501
        :type: str
        """
        if kind is None:
            raise ValueError("Invalid value for `kind`, must not be `None`")  # noqa: E501

        self._kind = kind

    @property
    def created_time(self):
        """Gets the created_time of this ModelFlowChartNodeMeta.  # noqa: E501


        :return: The created_time of this ModelFlowChartNodeMeta.  # noqa: E501
        :rtype: float
        """
        return self._created_time

    @created_time.setter
    def created_time(self, created_time):
        """Sets the created_time of this ModelFlowChartNodeMeta.


        :param created_time: The created_time of this ModelFlowChartNodeMeta.  # noqa: E501
        :type: float
        """

        self._created_time = created_time

    @property
    def modified_time(self):
        """Gets the modified_time of this ModelFlowChartNodeMeta.  # noqa: E501


        :return: The modified_time of this ModelFlowChartNodeMeta.  # noqa: E501
        :rtype: float
        """
        return self._modified_time

    @modified_time.setter
    def modified_time(self, modified_time):
        """Sets the modified_time of this ModelFlowChartNodeMeta.


        :param modified_time: The modified_time of this ModelFlowChartNodeMeta.  # noqa: E501
        :type: float
        """

        self._modified_time = modified_time

    @property
    def author(self):
        """Gets the author of this ModelFlowChartNodeMeta.  # noqa: E501


        :return: The author of this ModelFlowChartNodeMeta.  # noqa: E501
        :rtype: str
        """
        return self._author

    @author.setter
    def author(self, author):
        """Sets the author of this ModelFlowChartNodeMeta.


        :param author: The author of this ModelFlowChartNodeMeta.  # noqa: E501
        :type: str
        """

        self._author = author

    @property
    def comments(self):
        """Gets the comments of this ModelFlowChartNodeMeta.  # noqa: E501


        :return: The comments of this ModelFlowChartNodeMeta.  # noqa: E501
        :rtype: str
        """
        return self._comments

    @comments.setter
    def comments(self, comments):
        """Sets the comments of this ModelFlowChartNodeMeta.


        :param comments: The comments of this ModelFlowChartNodeMeta.  # noqa: E501
        :type: str
        """

        self._comments = comments

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
        if issubclass(ModelFlowChartNodeMeta, dict):
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
        if not isinstance(other, ModelFlowChartNodeMeta):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
