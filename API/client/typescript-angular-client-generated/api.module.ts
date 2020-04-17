import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { Configuration } from './configuration';
import { HttpClient } from '@angular/common/http';


import { ModelFlowService } from './api/modelFlow.service';
import { ModelFlowChartService } from './api/modelFlowChart.service';
import { ModelFlowChartEdgeService } from './api/modelFlowChartEdge.service';
import { ModelFlowChartExtensionService } from './api/modelFlowChartExtension.service';
import { ModelFlowChartNodeService } from './api/modelFlowChartNode.service';
import { ModelFlowChartNodeComponentService } from './api/modelFlowChartNodeComponent.service';
import { ModelFlowChartValidationService } from './api/modelFlowChartValidation.service';

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: [
    ModelFlowService,
    ModelFlowChartService,
    ModelFlowChartEdgeService,
    ModelFlowChartExtensionService,
    ModelFlowChartNodeService,
    ModelFlowChartNodeComponentService,
    ModelFlowChartValidationService ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): ModuleWithProviders {
        return {
            ngModule: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: ApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('ApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}
