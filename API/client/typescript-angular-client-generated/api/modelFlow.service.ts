/**
 * Machine fault diagnosis
 * List of top level server APIs
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *//* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { ModelFlowChartMeta } from '../model/modelFlowChartMeta';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class ModelFlowService {

    protected basePath = 'https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * delete a list of model flow charts
     * delete a list of model flow charts
     * @param modelFlowSearchString the string for searching for model flow charts
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modelFlowDelete(modelFlowSearchString?: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public modelFlowDelete(modelFlowSearchString?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public modelFlowDelete(modelFlowSearchString?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public modelFlowDelete(modelFlowSearchString?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (modelFlowSearchString !== undefined && modelFlowSearchString !== null) {
            queryParameters = queryParameters.set('modelFlowSearchString', <any>modelFlowSearchString);
        }

        let headers = this.defaultHeaders;

        // authentication (application) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('delete',`${this.basePath}/modelFlow`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * get a list of all model flow charts
     * Get a list of all model flow charts
     * @param modelFlowSearchString the string for searching for model flow charts
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modelFlowGet(modelFlowSearchString?: string, observe?: 'body', reportProgress?: boolean): Observable<Array<ModelFlowChartMeta>>;
    public modelFlowGet(modelFlowSearchString?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ModelFlowChartMeta>>>;
    public modelFlowGet(modelFlowSearchString?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ModelFlowChartMeta>>>;
    public modelFlowGet(modelFlowSearchString?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (modelFlowSearchString !== undefined && modelFlowSearchString !== null) {
            queryParameters = queryParameters.set('modelFlowSearchString', <any>modelFlowSearchString);
        }

        let headers = this.defaultHeaders;

        // authentication (application) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<Array<ModelFlowChartMeta>>('get',`${this.basePath}/modelFlow`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
