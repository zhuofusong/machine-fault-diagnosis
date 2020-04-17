import connexion
import six

from swagger_server.models.model_flow_chart import ModelFlowChart  # noqa: E501
from swagger_server.models.model_flow_chart_meta import ModelFlowChartMeta  # noqa: E501
from swagger_server import util


def model_flow_model_flow_id_delete(model_flow_id):  # noqa: E501
    """delete a model flow chart

    delete a model flow chart # noqa: E501

    :param model_flow_id: model flow chart id
    :type model_flow_id: str

    :rtype: object
    """
    return 'do some magic!'


def model_flow_model_flow_id_get(model_flow_id):  # noqa: E501
    """retrieve a model flow chart

    retrieve a model flow chart # noqa: E501

    :param model_flow_id: model flow chart id
    :type model_flow_id: str

    :rtype: List[ModelFlowChartMeta]
    """
    return 'do some magic!'


def model_flow_model_flow_id_post(model_flow_id, model_flow_chart):  # noqa: E501
    """create a model flow chart

    create a model flow chart # noqa: E501

    :param model_flow_id: model flow chart id
    :type model_flow_id: str
    :param model_flow_chart: model flow chart
    :type model_flow_chart: dict | bytes

    :rtype: object
    """
    if connexion.request.is_json:
        model_flow_chart = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def model_flow_model_flow_id_put(model_flow_id, model_flow_chart):  # noqa: E501
    """update a model flow chart

    update a model flow chart # noqa: E501

    :param model_flow_id: model flow chart id
    :type model_flow_id: str
    :param model_flow_chart: model flow chart
    :type model_flow_chart: dict | bytes

    :rtype: object
    """
    if connexion.request.is_json:
        model_flow_chart = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
