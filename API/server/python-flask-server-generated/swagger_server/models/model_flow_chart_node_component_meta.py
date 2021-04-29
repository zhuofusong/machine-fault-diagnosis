# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class ModelFlowChartNodeComponentMeta(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, id: str=None, kind: str=None, created_time: float=None, modified_time: float=None, author: str=None, comments: str=None):  # noqa: E501
        """ModelFlowChartNodeComponentMeta - a model defined in Swagger

        :param id: The id of this ModelFlowChartNodeComponentMeta.  # noqa: E501
        :type id: str
        :param kind: The kind of this ModelFlowChartNodeComponentMeta.  # noqa: E501
        :type kind: str
        :param created_time: The created_time of this ModelFlowChartNodeComponentMeta.  # noqa: E501
        :type created_time: float
        :param modified_time: The modified_time of this ModelFlowChartNodeComponentMeta.  # noqa: E501
        :type modified_time: float
        :param author: The author of this ModelFlowChartNodeComponentMeta.  # noqa: E501
        :type author: str
        :param comments: The comments of this ModelFlowChartNodeComponentMeta.  # noqa: E501
        :type comments: str
        """
        self.swagger_types = {
            'id': str,
            'kind': str,
            'created_time': float,
            'modified_time': float,
            'author': str,
            'comments': str
        }

        self.attribute_map = {
            'id': 'id',
            'kind': 'kind',
            'created_time': 'createdTime',
            'modified_time': 'modifiedTime',
            'author': 'author',
            'comments': 'comments'
        }
        self._id = id
        self._kind = kind
        self._created_time = created_time
        self._modified_time = modified_time
        self._author = author
        self._comments = comments

    @classmethod
    def from_dict(cls, dikt) -> 'ModelFlowChartNodeComponentMeta':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The modelFlowChartNodeComponentMeta of this ModelFlowChartNodeComponentMeta.  # noqa: E501
        :rtype: ModelFlowChartNodeComponentMeta
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this ModelFlowChartNodeComponentMeta.


        :return: The id of this ModelFlowChartNodeComponentMeta.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ModelFlowChartNodeComponentMeta.


        :param id: The id of this ModelFlowChartNodeComponentMeta.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def kind(self) -> str:
        """Gets the kind of this ModelFlowChartNodeComponentMeta.

        what kind of node component it is  # noqa: E501

        :return: The kind of this ModelFlowChartNodeComponentMeta.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind: str):
        """Sets the kind of this ModelFlowChartNodeComponentMeta.

        what kind of node component it is  # noqa: E501

        :param kind: The kind of this ModelFlowChartNodeComponentMeta.
        :type kind: str
        """
        if kind is None:
            raise ValueError("Invalid value for `kind`, must not be `None`")  # noqa: E501

        self._kind = kind

    @property
    def created_time(self) -> float:
        """Gets the created_time of this ModelFlowChartNodeComponentMeta.


        :return: The created_time of this ModelFlowChartNodeComponentMeta.
        :rtype: float
        """
        return self._created_time

    @created_time.setter
    def created_time(self, created_time: float):
        """Sets the created_time of this ModelFlowChartNodeComponentMeta.


        :param created_time: The created_time of this ModelFlowChartNodeComponentMeta.
        :type created_time: float
        """

        self._created_time = created_time

    @property
    def modified_time(self) -> float:
        """Gets the modified_time of this ModelFlowChartNodeComponentMeta.


        :return: The modified_time of this ModelFlowChartNodeComponentMeta.
        :rtype: float
        """
        return self._modified_time

    @modified_time.setter
    def modified_time(self, modified_time: float):
        """Sets the modified_time of this ModelFlowChartNodeComponentMeta.


        :param modified_time: The modified_time of this ModelFlowChartNodeComponentMeta.
        :type modified_time: float
        """

        self._modified_time = modified_time

    @property
    def author(self) -> str:
        """Gets the author of this ModelFlowChartNodeComponentMeta.


        :return: The author of this ModelFlowChartNodeComponentMeta.
        :rtype: str
        """
        return self._author

    @author.setter
    def author(self, author: str):
        """Sets the author of this ModelFlowChartNodeComponentMeta.


        :param author: The author of this ModelFlowChartNodeComponentMeta.
        :type author: str
        """

        self._author = author

    @property
    def comments(self) -> str:
        """Gets the comments of this ModelFlowChartNodeComponentMeta.


        :return: The comments of this ModelFlowChartNodeComponentMeta.
        :rtype: str
        """
        return self._comments

    @comments.setter
    def comments(self, comments: str):
        """Sets the comments of this ModelFlowChartNodeComponentMeta.


        :param comments: The comments of this ModelFlowChartNodeComponentMeta.
        :type comments: str
        """

        self._comments = comments