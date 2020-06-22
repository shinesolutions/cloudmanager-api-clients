pyaem_cloudmanager_api_client
----------

pyaem_cloudmanager_api_client is a Python client generated from [Adobe Cloudmanager API Swagger specification](https://github.com/AdobeDocs/cloudmanager-api-docs/blob/6f708920974dfc3649111b83a503f09f1cdf1ea7/swagger-specs/api.yaml) using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen).

Learn more about pyaem_cloudmanager_api_client:

* [Installation](https://github.com/shinesolutions/cloudmanager-api-clients/tree/master/clients/python/README.md#installation)
* [Usage](https://github.com/shinesolutions/cloudmanager-api-clients/tree/master/clients/python/README.md#usage)
* [Error Handling](https://github.com/shinesolutions/cloudmanager-api-clients/tree/master/clients/python/README.md#error-handling)
* [Development](https://github.com/shinesolutions/cloudmanager-api-clients/tree/master/clients/python/README.md#development)

pyaem_cloudmanager_api_client is part of [AEM OpenCloud](https://aemopencloud.io) platform.

Installation
------------

    pip install pyaem_cloudmanager_api_client

Usage
-----

Initialise client:

    import pyaem_cloudmanager_api_client
    import pyaem_cloudmanager_api_client.configuration

    pyaem_cloudmanager_api_client.configuration.debug = True

    with pyaem_cloudmanager_api_client.ApiClient(pyaem_cloudmanager_api_client.configuration) as api_client:
        branches_api = pyaem_cloudmanager_api_client.BranchesApi(api_client)
        environments_api = EnvironmentsApi(api_client)
        pipeline_execution_api = PipelineExecutionApi(api_client)
        pipelines_api = PipelinesApi(api_client)
        programs_api = ProgramsApi(api_client)
        repositories_api = RepositoriesApi(api_client)
        variables_api = VariablesApi(api_client)

Error Handling
--------------

Any API exception will be thrown as ApiException.


    try:
        api_response = api_instance.get_programs(x_gw_ims_org_id, authorization, x_api_key)
        print(api_response)
    except ApiException as err:
        print("Exception when calling Api: %s\n" % err)

Development
-----------

To regenerate the client with a custom Swagger Codegen:

    SWAGGER_CODEGEN_CLI_JAR=/path/to/swagger-codegen-cli.jar make build
