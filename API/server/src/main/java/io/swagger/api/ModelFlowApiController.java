package io.swagger.api;

import io.swagger.model.ModelFlowChart;
import io.swagger.model.ModelFlowChartEdgeMeta;
import io.swagger.model.ModelFlowChartExtensionMeta;
import io.swagger.model.ModelFlowChartMeta;
import io.swagger.model.ModelFlowChartNodeComponentMeta;
import io.swagger.model.ModelFlowChartNodeMeta;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-16T08:57:06.645Z[GMT]")
@Controller
public class ModelFlowApiController implements ModelFlowApi {

    private static final Logger log = LoggerFactory.getLogger(ModelFlowApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ModelFlowApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> modelFlowDelete(@ApiParam(value = "the string for searching for model flow charts") @Valid @RequestParam(value = "modelFlowSearchString", required = false) String modelFlowSearchString
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartMeta>> modelFlowGet(@ApiParam(value = "the string for searching for model flow charts") @Valid @RequestParam(value = "modelFlowSearchString", required = false) String modelFlowSearchString
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartMeta>>(objectMapper.readValue("[ {\n  \"lastModifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"editMode\" : \"editMode\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\",\n  \"config\" : { }\n}, {\n  \"lastModifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"editMode\" : \"editMode\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\",\n  \"config\" : { }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowModelFlowIdDelete(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowModelFlowIdExtensionDelete(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartExtensionMeta>> modelFlowModelFlowIdExtensionGet(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartExtensionMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartExtensionMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartExtensionMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowModelFlowIdExtensionPost(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@NotNull @ApiParam(value = "model flow chart extension", required = true) @Valid @RequestParam(value = "modelFlowChartExtension", required = true) ModelFlowChartExtensionMeta modelFlowChartExtension
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowModelFlowIdExtensionPut(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@NotNull @ApiParam(value = "model flow chart extension", required = true) @Valid @RequestParam(value = "modelFlowChartExtension", required = true) ModelFlowChartExtensionMeta modelFlowChartExtension
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartMeta>> modelFlowModelFlowIdGet(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartMeta>>(objectMapper.readValue("[ {\n  \"lastModifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"editMode\" : \"editMode\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\",\n  \"config\" : { }\n}, {\n  \"lastModifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"editMode\" : \"editMode\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\",\n  \"config\" : { }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowModelFlowIdPost(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@NotNull @ApiParam(value = "model flow chart", required = true) @Valid @RequestParam(value = "modelFlowChart", required = true) ModelFlowChart modelFlowChart
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowModelFlowIdPut(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@NotNull @ApiParam(value = "model flow chart", required = true) @Valid @RequestParam(value = "modelFlowChart", required = true) ModelFlowChart modelFlowChart
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowNodeModelFlowIdEdgeIdDelete(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "edge's id in a model flow chart",required=true) @PathVariable("edgeId") String edgeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartEdgeMeta>> modelFlowNodeModelFlowIdEdgeIdGet(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "edge's id in a model flow chart",required=true) @PathVariable("edgeId") String edgeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartEdgeMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartEdgeMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartEdgeMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartEdgeMeta>> modelFlowNodeModelFlowIdEdgeIdPost(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "edge's id in a model flow chart",required=true) @PathVariable("edgeId") String edgeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartEdgeMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartEdgeMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartEdgeMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartEdgeMeta>> modelFlowNodeModelFlowIdEdgeIdPut(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "edge's id in a model flow chart",required=true) @PathVariable("edgeId") String edgeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartEdgeMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartEdgeMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartEdgeMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowNodeModelFlowIdNodeIdComponentDelete(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "node's id in a model flow chart",required=true) @PathVariable("nodeId") String nodeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartNodeComponentMeta>> modelFlowNodeModelFlowIdNodeIdComponentGet(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "node's id in a model flow chart",required=true) @PathVariable("nodeId") String nodeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartNodeComponentMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartNodeComponentMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartNodeComponentMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartNodeComponentMeta>> modelFlowNodeModelFlowIdNodeIdComponentPost(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "node's id in a model flow chart",required=true) @PathVariable("nodeId") String nodeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartNodeComponentMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartNodeComponentMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartNodeComponentMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartNodeComponentMeta>> modelFlowNodeModelFlowIdNodeIdComponentPut(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "node's id in a model flow chart",required=true) @PathVariable("nodeId") String nodeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartNodeComponentMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartNodeComponentMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartNodeComponentMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowNodeModelFlowIdNodeIdDelete(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "node's id in a model flow chart",required=true) @PathVariable("nodeId") String nodeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartNodeMeta>> modelFlowNodeModelFlowIdNodeIdGet(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "node's id in a model flow chart",required=true) @PathVariable("nodeId") String nodeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartNodeMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartNodeMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartNodeMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartNodeMeta>> modelFlowNodeModelFlowIdNodeIdPost(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "node's id in a model flow chart",required=true) @PathVariable("nodeId") String nodeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartNodeMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartNodeMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartNodeMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ModelFlowChartNodeMeta>> modelFlowNodeModelFlowIdNodeIdPut(@ApiParam(value = "model flow chart id",required=true) @PathVariable("modelFlowId") String modelFlowId
,@ApiParam(value = "node's id in a model flow chart",required=true) @PathVariable("nodeId") String nodeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ModelFlowChartNodeMeta>>(objectMapper.readValue("[ {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n}, {\n  \"modifiedTime\" : 6.027456183070403,\n  \"comments\" : \"comments\",\n  \"kind\" : \"kind\",\n  \"author\" : \"author\",\n  \"createdTime\" : 0.8008281904610115,\n  \"id\" : \"id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ModelFlowChartNodeMeta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ModelFlowChartNodeMeta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> modelFlowValidationKindIdPost(@ApiParam(value = "what kind of object to validate",required=true) @PathVariable("kind") String kind
,@ApiParam(value = "id of the object to be validated",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
