# AemCloudManagerApiClient::PipelineExecutionListRepresentation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_total_number_of_items** | **Integer** |  | [optional] 
**_page** | [**RequestedPageDetails**](RequestedPageDetails.md) |  | [optional] 
**_embedded** | [**PipelineExecutionListRepresentationEmbedded**](PipelineExecutionListRepresentationEmbedded.md) |  | [optional] 
**_links** | [**PipelineExecutionListRepresentationLinks**](PipelineExecutionListRepresentationLinks.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::PipelineExecutionListRepresentation.new(_total_number_of_items: null,
                                 _page: null,
                                 _embedded: null,
                                 _links: null)
```


