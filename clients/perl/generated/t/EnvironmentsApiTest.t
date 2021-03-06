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

use_ok('WWW::OpenAPIClient::EnvironmentsApi');

my $api = WWW::OpenAPIClient::EnvironmentsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::EnvironmentsApi');

#
# delete_environment test
#
{
    my $program_id = undef; # replace NULL with a proper value
    my $environment_id = undef; # replace NULL with a proper value
    my $x_gw_ims_org_id = undef; # replace NULL with a proper value
    my $authorization = undef; # replace NULL with a proper value
    my $x_api_key = undef; # replace NULL with a proper value
    my $result = $api->delete_environment(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
}

#
# download_logs test
#
{
    my $program_id = undef; # replace NULL with a proper value
    my $environment_id = undef; # replace NULL with a proper value
    my $service = undef; # replace NULL with a proper value
    my $name = undef; # replace NULL with a proper value
    my $date = undef; # replace NULL with a proper value
    my $x_gw_ims_org_id = undef; # replace NULL with a proper value
    my $authorization = undef; # replace NULL with a proper value
    my $x_api_key = undef; # replace NULL with a proper value
    my $accept = undef; # replace NULL with a proper value
    my $result = $api->download_logs(program_id => $program_id, environment_id => $environment_id, service => $service, name => $name, date => $date, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, accept => $accept);
}

#
# get_environment test
#
{
    my $program_id = undef; # replace NULL with a proper value
    my $environment_id = undef; # replace NULL with a proper value
    my $x_gw_ims_org_id = undef; # replace NULL with a proper value
    my $authorization = undef; # replace NULL with a proper value
    my $x_api_key = undef; # replace NULL with a proper value
    my $result = $api->get_environment(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
}

#
# get_environment_logs test
#
{
    my $program_id = undef; # replace NULL with a proper value
    my $environment_id = undef; # replace NULL with a proper value
    my $days = undef; # replace NULL with a proper value
    my $x_gw_ims_org_id = undef; # replace NULL with a proper value
    my $authorization = undef; # replace NULL with a proper value
    my $x_api_key = undef; # replace NULL with a proper value
    my $service = undef; # replace NULL with a proper value
    my $name = undef; # replace NULL with a proper value
    my $result = $api->get_environment_logs(program_id => $program_id, environment_id => $environment_id, days => $days, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, service => $service, name => $name);
}

#
# get_environments test
#
{
    my $program_id = undef; # replace NULL with a proper value
    my $x_gw_ims_org_id = undef; # replace NULL with a proper value
    my $authorization = undef; # replace NULL with a proper value
    my $x_api_key = undef; # replace NULL with a proper value
    my $type = undef; # replace NULL with a proper value
    my $result = $api->get_environments(program_id => $program_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, type => $type);
}


1;
