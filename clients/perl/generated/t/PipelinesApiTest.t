=begin comment

Cloud Manager API

This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

The version of the OpenAPI document: 1.0.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::PipelinesApi');

my $api = WWW::OpenAPIClient::PipelinesApi->new();
isa_ok($api, 'WWW::OpenAPIClient::PipelinesApi');

#
# delete_pipeline test
#
{
    my $program_id = undef; # replace NULL with a proper value
    my $pipeline_id = undef; # replace NULL with a proper value
    my $x_gw_ims_org_id = undef; # replace NULL with a proper value
    my $authorization = undef; # replace NULL with a proper value
    my $x_api_key = undef; # replace NULL with a proper value
    my $result = $api->delete_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
}

#
# get_pipeline test
#
{
    my $program_id = undef; # replace NULL with a proper value
    my $pipeline_id = undef; # replace NULL with a proper value
    my $x_gw_ims_org_id = undef; # replace NULL with a proper value
    my $authorization = undef; # replace NULL with a proper value
    my $x_api_key = undef; # replace NULL with a proper value
    my $result = $api->get_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
}

#
# get_pipelines test
#
{
    my $program_id = undef; # replace NULL with a proper value
    my $x_gw_ims_org_id = undef; # replace NULL with a proper value
    my $authorization = undef; # replace NULL with a proper value
    my $x_api_key = undef; # replace NULL with a proper value
    my $result = $api->get_pipelines(program_id => $program_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
}

#
# patch_pipeline test
#
{
    my $program_id = undef; # replace NULL with a proper value
    my $pipeline_id = undef; # replace NULL with a proper value
    my $x_gw_ims_org_id = undef; # replace NULL with a proper value
    my $authorization = undef; # replace NULL with a proper value
    my $x_api_key = undef; # replace NULL with a proper value
    my $content_type = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->patch_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type, body => $body);
}


1;
