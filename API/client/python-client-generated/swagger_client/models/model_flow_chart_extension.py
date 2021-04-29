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


class ModelFlowChartExtension(object):
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
        'fixed_config': 'ModelFlowChartExtensionFixedConfig',
        'install_script': 'str',
        'start_script': 'str'
    }

    attribute_map = {
        'id': 'id',
        'fixed_config': 'fixed_config',
        'install_script': 'install_script',
        'start_script': 'start_script'
    }

    def __init__(self, id=None, fixed_config=None, install_script=None, start_script=None):  # noqa: E501
        """ModelFlowChartExtension - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._fixed_config = None
        self._install_script = None
        self._start_script = None
        self.discriminator = None
        self.id = id
        if fixed_config is not None:
            self.fixed_config = fixed_config
        if install_script is not None:
            self.install_script = install_script
        if start_script is not None:
            self.start_script = start_script

    @property
    def id(self):
        """Gets the id of this ModelFlowChartExtension.  # noqa: E501


        :return: The id of this ModelFlowChartExtension.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ModelFlowChartExtension.


        :param id: The id of this ModelFlowChartExtension.  # noqa: E501
        :type: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def fixed_config(self):
        """Gets the fixed_config of this ModelFlowChartExtension.  # noqa: E501


        :return: The fixed_config of this ModelFlowChartExtension.  # noqa: E501
        :rtype: ModelFlowChartExtensionFixedConfig
        """
        return self._fixed_config

    @fixed_config.setter
    def fixed_config(self, fixed_config):
        """Sets the fixed_config of this ModelFlowChartExtension.


        :param fixed_config: The fixed_config of this ModelFlowChartExtension.  # noqa: E501
        :type: ModelFlowChartExtensionFixedConfig
        """

        self._fixed_config = fixed_config

    @property
    def install_script(self):
        """Gets the install_script of this ModelFlowChartExtension.  # noqa: E501

        the address in DB where the installation script is stored  # noqa: E501

        :return: The install_script of this ModelFlowChartExtension.  # noqa: E501
        :rtype: str
        """
        return self._install_script

    @install_script.setter
    def install_script(self, install_script):
        """Sets the install_script of this ModelFlowChartExtension.

        the address in DB where the installation script is stored  # noqa: E501

        :param install_script: The install_script of this ModelFlowChartExtension.  # noqa: E501
        :type: str
        """

        self._install_script = install_script

    @property
    def start_script(self):
        """Gets the start_script of this ModelFlowChartExtension.  # noqa: E501

        where to retrieve the extension starting script  # noqa: E501

        :return: The start_script of this ModelFlowChartExtension.  # noqa: E501
        :rtype: str
        """
        return self._start_script

    @start_script.setter
    def start_script(self, start_script):
        """Sets the start_script of this ModelFlowChartExtension.

        where to retrieve the extension starting script  # noqa: E501

        :param start_script: The start_script of this ModelFlowChartExtension.  # noqa: E501
        :type: str
        """

        self._start_script = start_script

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
        if issubclass(ModelFlowChartExtension, dict):
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
        if not isinstance(other, ModelFlowChartExtension):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other