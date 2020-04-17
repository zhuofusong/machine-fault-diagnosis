import connexion
import six

from swagger_server.models.model_flow_chart_extension_meta import ModelFlowChartExtensionMeta  # noqa: E501
from swagger_server import util


def model_flow_model_flow_id_extension_delete(model_flow_id):  # noqa: E501
    """delete a model flow chart extension

    delete a model flow chart extension # noqa: E501

    :param model_flow_id: model flow chart id
    :type model_flow_id: str

    :rtype: object
    """
    return 'do some magic!'


def model_flow_model_flow_id_extension_get(model_flow_id):  # noqa: E501
    """retrieve a model flow chart extension

    retrieve a model flow chart extension # noqa: E501

    :param model_flow_id: model flow chart id
    :type model_flow_id: str

    :rtype: List[ModelFlowChartExtensionMeta]
    """
    return 'do some magic!'


def model_flow_model_flow_id_extension_post(model_flow_id, model_flow_chart_extension):  # noqa: E501
    """create a model flow chart extension

    create a model flow chart extension # noqa: E501

    :param model_flow_id: model flow chart id
    :type model_flow_id: str
    :param model_flow_chart_extension: model flow chart extension
    :type model_flow_chart_extension: dict | bytes

    :rtype: object
    """
    if connexion.request.is_json:
        model_flow_chart_extension = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def model_flow_model_flow_id_extension_put(model_flow_id, model_flow_chart_extension):  # noqa: E501
    """update a model flow chart extension

    update a model flow chart extension # noqa: E501

    :param model_flow_id: model flow chart id
    :type model_flow_id: str
    :param model_flow_chart_extension: model flow chart extension
    :type model_flow_chart_extension: dict | bytes

    :rtype: object
    """
    if connexion.request.is_json:
        model_flow_chart_extension = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
