import connexion
import six

from swagger_server.models.model_flow_chart_meta import ModelFlowChartMeta  # noqa: E501
from swagger_server import util


def model_flow_delete(model_flow_search_string=None):  # noqa: E501
    """delete a list of model flow charts

    delete a list of model flow charts # noqa: E501

    :param model_flow_search_string: the string for searching for model flow charts
    :type model_flow_search_string: str

    :rtype: object
    """
    return 'do some magic!'


def model_flow_get(model_flow_search_string=None):  # noqa: E501
    """get a list of all model flow charts

    Get a list of all model flow charts # noqa: E501

    :param model_flow_search_string: the string for searching for model flow charts
    :type model_flow_search_string: str

    :rtype: List[ModelFlowChartMeta]
    """
    return 'do some magic!'
