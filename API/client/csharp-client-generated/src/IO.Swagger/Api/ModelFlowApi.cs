/* 
 * Machine fault diagnosis
 *
 * List of top level server APIs
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface IModelFlowApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// delete a list of model flow charts
        /// </summary>
        /// <remarks>
        /// delete a list of model flow charts
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Object</returns>
        Object ModelFlowDelete (string modelFlowSearchString = null);

        /// <summary>
        /// delete a list of model flow charts
        /// </summary>
        /// <remarks>
        /// delete a list of model flow charts
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>ApiResponse of Object</returns>
        ApiResponse<Object> ModelFlowDeleteWithHttpInfo (string modelFlowSearchString = null);
        /// <summary>
        /// get a list of all model flow charts
        /// </summary>
        /// <remarks>
        /// Get a list of all model flow charts
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>List&lt;ModelFlowChartMeta&gt;</returns>
        List<ModelFlowChartMeta> ModelFlowGet (string modelFlowSearchString = null);

        /// <summary>
        /// get a list of all model flow charts
        /// </summary>
        /// <remarks>
        /// Get a list of all model flow charts
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>ApiResponse of List&lt;ModelFlowChartMeta&gt;</returns>
        ApiResponse<List<ModelFlowChartMeta>> ModelFlowGetWithHttpInfo (string modelFlowSearchString = null);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// delete a list of model flow charts
        /// </summary>
        /// <remarks>
        /// delete a list of model flow charts
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Task of Object</returns>
        System.Threading.Tasks.Task<Object> ModelFlowDeleteAsync (string modelFlowSearchString = null);

        /// <summary>
        /// delete a list of model flow charts
        /// </summary>
        /// <remarks>
        /// delete a list of model flow charts
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> ModelFlowDeleteAsyncWithHttpInfo (string modelFlowSearchString = null);
        /// <summary>
        /// get a list of all model flow charts
        /// </summary>
        /// <remarks>
        /// Get a list of all model flow charts
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Task of List&lt;ModelFlowChartMeta&gt;</returns>
        System.Threading.Tasks.Task<List<ModelFlowChartMeta>> ModelFlowGetAsync (string modelFlowSearchString = null);

        /// <summary>
        /// get a list of all model flow charts
        /// </summary>
        /// <remarks>
        /// Get a list of all model flow charts
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;ModelFlowChartMeta&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<ModelFlowChartMeta>>> ModelFlowGetAsyncWithHttpInfo (string modelFlowSearchString = null);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class ModelFlowApi : IModelFlowApi
    {
        private IO.Swagger.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ModelFlowApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ModelFlowApi(String basePath)
        {
            this.Configuration = new IO.Swagger.Client.Configuration { BasePath = basePath };

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ModelFlowApi"/> class
        /// </summary>
        /// <returns></returns>
        public ModelFlowApi()
        {
            this.Configuration = IO.Swagger.Client.Configuration.Default;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ModelFlowApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ModelFlowApi(IO.Swagger.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = IO.Swagger.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public IO.Swagger.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public IO.Swagger.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// delete a list of model flow charts delete a list of model flow charts
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Object</returns>
        public Object ModelFlowDelete (string modelFlowSearchString = null)
        {
             ApiResponse<Object> localVarResponse = ModelFlowDeleteWithHttpInfo(modelFlowSearchString);
             return localVarResponse.Data;
        }

        /// <summary>
        /// delete a list of model flow charts delete a list of model flow charts
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>ApiResponse of Object</returns>
        public ApiResponse< Object > ModelFlowDeleteWithHttpInfo (string modelFlowSearchString = null)
        {

            var localVarPath = "/modelFlow";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (modelFlowSearchString != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "modelFlowSearchString", modelFlowSearchString)); // query parameter
            // authentication (application) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ModelFlowDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Object) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Object)));
        }

        /// <summary>
        /// delete a list of model flow charts delete a list of model flow charts
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Task of Object</returns>
        public async System.Threading.Tasks.Task<Object> ModelFlowDeleteAsync (string modelFlowSearchString = null)
        {
             ApiResponse<Object> localVarResponse = await ModelFlowDeleteAsyncWithHttpInfo(modelFlowSearchString);
             return localVarResponse.Data;

        }

        /// <summary>
        /// delete a list of model flow charts delete a list of model flow charts
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> ModelFlowDeleteAsyncWithHttpInfo (string modelFlowSearchString = null)
        {

            var localVarPath = "/modelFlow";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (modelFlowSearchString != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "modelFlowSearchString", modelFlowSearchString)); // query parameter
            // authentication (application) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ModelFlowDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Object) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Object)));
        }

        /// <summary>
        /// get a list of all model flow charts Get a list of all model flow charts
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>List&lt;ModelFlowChartMeta&gt;</returns>
        public List<ModelFlowChartMeta> ModelFlowGet (string modelFlowSearchString = null)
        {
             ApiResponse<List<ModelFlowChartMeta>> localVarResponse = ModelFlowGetWithHttpInfo(modelFlowSearchString);
             return localVarResponse.Data;
        }

        /// <summary>
        /// get a list of all model flow charts Get a list of all model flow charts
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>ApiResponse of List&lt;ModelFlowChartMeta&gt;</returns>
        public ApiResponse< List<ModelFlowChartMeta> > ModelFlowGetWithHttpInfo (string modelFlowSearchString = null)
        {

            var localVarPath = "/modelFlow";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (modelFlowSearchString != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "modelFlowSearchString", modelFlowSearchString)); // query parameter
            // authentication (application) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ModelFlowGet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ModelFlowChartMeta>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ModelFlowChartMeta>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ModelFlowChartMeta>)));
        }

        /// <summary>
        /// get a list of all model flow charts Get a list of all model flow charts
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Task of List&lt;ModelFlowChartMeta&gt;</returns>
        public async System.Threading.Tasks.Task<List<ModelFlowChartMeta>> ModelFlowGetAsync (string modelFlowSearchString = null)
        {
             ApiResponse<List<ModelFlowChartMeta>> localVarResponse = await ModelFlowGetAsyncWithHttpInfo(modelFlowSearchString);
             return localVarResponse.Data;

        }

        /// <summary>
        /// get a list of all model flow charts Get a list of all model flow charts
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modelFlowSearchString">the string for searching for model flow charts (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;ModelFlowChartMeta&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<ModelFlowChartMeta>>> ModelFlowGetAsyncWithHttpInfo (string modelFlowSearchString = null)
        {

            var localVarPath = "/modelFlow";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (modelFlowSearchString != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "modelFlowSearchString", modelFlowSearchString)); // query parameter
            // authentication (application) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ModelFlowGet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ModelFlowChartMeta>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ModelFlowChartMeta>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ModelFlowChartMeta>)));
        }

    }
}