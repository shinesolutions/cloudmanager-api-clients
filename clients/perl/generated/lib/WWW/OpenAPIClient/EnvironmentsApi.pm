=begin comment

Cloud Manager API

This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

The version of the OpenAPI document: 1.0.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::EnvironmentsApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::OpenAPIClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::OpenAPIClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::OpenAPIClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# delete_environment
#
# DeleteEnvironment
# 
# @param string $program_id Identifier of the application (required)
# @param string $environment_id Identifier of the environment (required)
# @param string $x_gw_ims_org_id IMS organization ID that the request is being made under. (required)
# @param string $authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
# @param string $x_api_key IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
{
    my $params = {
    'program_id' => {
        data_type => 'string',
        description => 'Identifier of the application',
        required => '1',
    },
    'environment_id' => {
        data_type => 'string',
        description => 'Identifier of the environment',
        required => '1',
    },
    'x_gw_ims_org_id' => {
        data_type => 'string',
        description => 'IMS organization ID that the request is being made under.',
        required => '1',
    },
    'authorization' => {
        data_type => 'string',
        description => 'Bearer [token] - An access token for the technical account created through integration with Adobe IO',
        required => '1',
    },
    'x_api_key' => {
        data_type => 'string',
        description => 'IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'delete_environment' } = { 
        summary => 'DeleteEnvironment',
        params => $params,
        returns => 'Environment',
        };
}
# @return Environment
#
sub delete_environment {
    my ($self, %args) = @_;

    # verify the required parameter 'program_id' is set
    unless (exists $args{'program_id'}) {
      croak("Missing the required parameter 'program_id' when calling delete_environment");
    }

    # verify the required parameter 'environment_id' is set
    unless (exists $args{'environment_id'}) {
      croak("Missing the required parameter 'environment_id' when calling delete_environment");
    }

    # verify the required parameter 'x_gw_ims_org_id' is set
    unless (exists $args{'x_gw_ims_org_id'}) {
      croak("Missing the required parameter 'x_gw_ims_org_id' when calling delete_environment");
    }

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling delete_environment");
    }

    # verify the required parameter 'x_api_key' is set
    unless (exists $args{'x_api_key'}) {
      croak("Missing the required parameter 'x_api_key' when calling delete_environment");
    }

    # parse inputs
    my $_resource_path = '/api/program/{programId}/environment/{environmentId}';

    my $_method = 'DELETE';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # header params
    if ( exists $args{'x_gw_ims_org_id'}) {
        $header_params->{'x-gw-ims-org-id'} = $self->{api_client}->to_header_value($args{'x_gw_ims_org_id'});
    }

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    # header params
    if ( exists $args{'x_api_key'}) {
        $header_params->{'x-api-key'} = $self->{api_client}->to_header_value($args{'x_api_key'});
    }

    # path params
    if ( exists $args{'program_id'}) {
        my $_base_variable = "{" . "programId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'program_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'environment_id'}) {
        my $_base_variable = "{" . "environmentId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'environment_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Environment', $response);
    return $_response_object;
}

#
# download_logs
#
# Download Logs
# 
# @param string $program_id Identifier of the program (required)
# @param string $environment_id Identifier of the environment (required)
# @param string $service Name of service (required)
# @param string $name Name of log (required)
# @param string $date date for which log is required (required)
# @param string $x_gw_ims_org_id IMS organization ID that the request is being made under. (required)
# @param string $authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
# @param string $x_api_key IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
# @param string $accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)
{
    my $params = {
    'program_id' => {
        data_type => 'string',
        description => 'Identifier of the program',
        required => '1',
    },
    'environment_id' => {
        data_type => 'string',
        description => 'Identifier of the environment',
        required => '1',
    },
    'service' => {
        data_type => 'string',
        description => 'Name of service',
        required => '1',
    },
    'name' => {
        data_type => 'string',
        description => 'Name of log',
        required => '1',
    },
    'date' => {
        data_type => 'string',
        description => 'date for which log is required',
        required => '1',
    },
    'x_gw_ims_org_id' => {
        data_type => 'string',
        description => 'IMS organization ID that the request is being made under.',
        required => '1',
    },
    'authorization' => {
        data_type => 'string',
        description => 'Bearer [token] - An access token for the technical account created through integration with Adobe IO',
        required => '1',
    },
    'x_api_key' => {
        data_type => 'string',
        description => 'IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io',
        required => '1',
    },
    'accept' => {
        data_type => 'string',
        description => 'Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'download_logs' } = { 
        summary => 'Download Logs',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub download_logs {
    my ($self, %args) = @_;

    # verify the required parameter 'program_id' is set
    unless (exists $args{'program_id'}) {
      croak("Missing the required parameter 'program_id' when calling download_logs");
    }

    # verify the required parameter 'environment_id' is set
    unless (exists $args{'environment_id'}) {
      croak("Missing the required parameter 'environment_id' when calling download_logs");
    }

    # verify the required parameter 'service' is set
    unless (exists $args{'service'}) {
      croak("Missing the required parameter 'service' when calling download_logs");
    }

    # verify the required parameter 'name' is set
    unless (exists $args{'name'}) {
      croak("Missing the required parameter 'name' when calling download_logs");
    }

    # verify the required parameter 'date' is set
    unless (exists $args{'date'}) {
      croak("Missing the required parameter 'date' when calling download_logs");
    }

    # verify the required parameter 'x_gw_ims_org_id' is set
    unless (exists $args{'x_gw_ims_org_id'}) {
      croak("Missing the required parameter 'x_gw_ims_org_id' when calling download_logs");
    }

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling download_logs");
    }

    # verify the required parameter 'x_api_key' is set
    unless (exists $args{'x_api_key'}) {
      croak("Missing the required parameter 'x_api_key' when calling download_logs");
    }

    # parse inputs
    my $_resource_path = '/api/program/{programId}/environment/{environmentId}/logs/download';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'service'}) {
        $query_params->{'service'} = $self->{api_client}->to_query_value($args{'service'});
    }

    # query params
    if ( exists $args{'name'}) {
        $query_params->{'name'} = $self->{api_client}->to_query_value($args{'name'});
    }

    # query params
    if ( exists $args{'date'}) {
        $query_params->{'date'} = $self->{api_client}->to_query_value($args{'date'});
    }

    # header params
    if ( exists $args{'x_gw_ims_org_id'}) {
        $header_params->{'x-gw-ims-org-id'} = $self->{api_client}->to_header_value($args{'x_gw_ims_org_id'});
    }

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    # header params
    if ( exists $args{'x_api_key'}) {
        $header_params->{'x-api-key'} = $self->{api_client}->to_header_value($args{'x_api_key'});
    }

    # header params
    if ( exists $args{'accept'}) {
        $header_params->{'Accept'} = $self->{api_client}->to_header_value($args{'accept'});
    }

    # path params
    if ( exists $args{'program_id'}) {
        my $_base_variable = "{" . "programId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'program_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'environment_id'}) {
        my $_base_variable = "{" . "environmentId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'environment_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# get_environment
#
# Get Environment
# 
# @param string $program_id Identifier of the program (required)
# @param string $environment_id Identifier of the environment (required)
# @param string $x_gw_ims_org_id IMS organization ID that the request is being made under. (required)
# @param string $authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
# @param string $x_api_key IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
{
    my $params = {
    'program_id' => {
        data_type => 'string',
        description => 'Identifier of the program',
        required => '1',
    },
    'environment_id' => {
        data_type => 'string',
        description => 'Identifier of the environment',
        required => '1',
    },
    'x_gw_ims_org_id' => {
        data_type => 'string',
        description => 'IMS organization ID that the request is being made under.',
        required => '1',
    },
    'authorization' => {
        data_type => 'string',
        description => 'Bearer [token] - An access token for the technical account created through integration with Adobe IO',
        required => '1',
    },
    'x_api_key' => {
        data_type => 'string',
        description => 'IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_environment' } = { 
        summary => 'Get Environment',
        params => $params,
        returns => 'Environment',
        };
}
# @return Environment
#
sub get_environment {
    my ($self, %args) = @_;

    # verify the required parameter 'program_id' is set
    unless (exists $args{'program_id'}) {
      croak("Missing the required parameter 'program_id' when calling get_environment");
    }

    # verify the required parameter 'environment_id' is set
    unless (exists $args{'environment_id'}) {
      croak("Missing the required parameter 'environment_id' when calling get_environment");
    }

    # verify the required parameter 'x_gw_ims_org_id' is set
    unless (exists $args{'x_gw_ims_org_id'}) {
      croak("Missing the required parameter 'x_gw_ims_org_id' when calling get_environment");
    }

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling get_environment");
    }

    # verify the required parameter 'x_api_key' is set
    unless (exists $args{'x_api_key'}) {
      croak("Missing the required parameter 'x_api_key' when calling get_environment");
    }

    # parse inputs
    my $_resource_path = '/api/program/{programId}/environment/{environmentId}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # header params
    if ( exists $args{'x_gw_ims_org_id'}) {
        $header_params->{'x-gw-ims-org-id'} = $self->{api_client}->to_header_value($args{'x_gw_ims_org_id'});
    }

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    # header params
    if ( exists $args{'x_api_key'}) {
        $header_params->{'x-api-key'} = $self->{api_client}->to_header_value($args{'x_api_key'});
    }

    # path params
    if ( exists $args{'program_id'}) {
        my $_base_variable = "{" . "programId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'program_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'environment_id'}) {
        my $_base_variable = "{" . "environmentId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'environment_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Environment', $response);
    return $_response_object;
}

#
# get_environment_logs
#
# Get Environment Logs
# 
# @param string $program_id Identifier of the program (required)
# @param string $environment_id Identifier of the environment (required)
# @param int $days number of days for which logs are required (required)
# @param string $x_gw_ims_org_id IMS organization ID that the request is being made under. (required)
# @param string $authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
# @param string $x_api_key IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
# @param ARRAY[string] $service Names of services (optional)
# @param ARRAY[string] $name Names of log (optional)
{
    my $params = {
    'program_id' => {
        data_type => 'string',
        description => 'Identifier of the program',
        required => '1',
    },
    'environment_id' => {
        data_type => 'string',
        description => 'Identifier of the environment',
        required => '1',
    },
    'days' => {
        data_type => 'int',
        description => 'number of days for which logs are required',
        required => '1',
    },
    'x_gw_ims_org_id' => {
        data_type => 'string',
        description => 'IMS organization ID that the request is being made under.',
        required => '1',
    },
    'authorization' => {
        data_type => 'string',
        description => 'Bearer [token] - An access token for the technical account created through integration with Adobe IO',
        required => '1',
    },
    'x_api_key' => {
        data_type => 'string',
        description => 'IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io',
        required => '1',
    },
    'service' => {
        data_type => 'ARRAY[string]',
        description => 'Names of services',
        required => '0',
    },
    'name' => {
        data_type => 'ARRAY[string]',
        description => 'Names of log',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_environment_logs' } = { 
        summary => 'Get Environment Logs',
        params => $params,
        returns => 'EnvironmentLogs',
        };
}
# @return EnvironmentLogs
#
sub get_environment_logs {
    my ($self, %args) = @_;

    # verify the required parameter 'program_id' is set
    unless (exists $args{'program_id'}) {
      croak("Missing the required parameter 'program_id' when calling get_environment_logs");
    }

    # verify the required parameter 'environment_id' is set
    unless (exists $args{'environment_id'}) {
      croak("Missing the required parameter 'environment_id' when calling get_environment_logs");
    }

    # verify the required parameter 'days' is set
    unless (exists $args{'days'}) {
      croak("Missing the required parameter 'days' when calling get_environment_logs");
    }

    # verify the required parameter 'x_gw_ims_org_id' is set
    unless (exists $args{'x_gw_ims_org_id'}) {
      croak("Missing the required parameter 'x_gw_ims_org_id' when calling get_environment_logs");
    }

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling get_environment_logs");
    }

    # verify the required parameter 'x_api_key' is set
    unless (exists $args{'x_api_key'}) {
      croak("Missing the required parameter 'x_api_key' when calling get_environment_logs");
    }

    # parse inputs
    my $_resource_path = '/api/program/{programId}/environment/{environmentId}/logs';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'service'}) {
        $query_params->{'service'} = $self->{api_client}->to_query_value($args{'service'});
    }

    # query params
    if ( exists $args{'name'}) {
        $query_params->{'name'} = $self->{api_client}->to_query_value($args{'name'});
    }

    # query params
    if ( exists $args{'days'}) {
        $query_params->{'days'} = $self->{api_client}->to_query_value($args{'days'});
    }

    # header params
    if ( exists $args{'x_gw_ims_org_id'}) {
        $header_params->{'x-gw-ims-org-id'} = $self->{api_client}->to_header_value($args{'x_gw_ims_org_id'});
    }

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    # header params
    if ( exists $args{'x_api_key'}) {
        $header_params->{'x-api-key'} = $self->{api_client}->to_header_value($args{'x_api_key'});
    }

    # path params
    if ( exists $args{'program_id'}) {
        my $_base_variable = "{" . "programId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'program_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'environment_id'}) {
        my $_base_variable = "{" . "environmentId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'environment_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('EnvironmentLogs', $response);
    return $_response_object;
}

#
# get_environments
#
# List Environments
# 
# @param string $program_id Identifier of the program (required)
# @param string $x_gw_ims_org_id IMS organization ID that the request is being made under. (required)
# @param string $authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
# @param string $x_api_key IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
# @param string $type Type of the environment (optional)
{
    my $params = {
    'program_id' => {
        data_type => 'string',
        description => 'Identifier of the program',
        required => '1',
    },
    'x_gw_ims_org_id' => {
        data_type => 'string',
        description => 'IMS organization ID that the request is being made under.',
        required => '1',
    },
    'authorization' => {
        data_type => 'string',
        description => 'Bearer [token] - An access token for the technical account created through integration with Adobe IO',
        required => '1',
    },
    'x_api_key' => {
        data_type => 'string',
        description => 'IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io',
        required => '1',
    },
    'type' => {
        data_type => 'string',
        description => 'Type of the environment',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_environments' } = { 
        summary => 'List Environments',
        params => $params,
        returns => 'EnvironmentList',
        };
}
# @return EnvironmentList
#
sub get_environments {
    my ($self, %args) = @_;

    # verify the required parameter 'program_id' is set
    unless (exists $args{'program_id'}) {
      croak("Missing the required parameter 'program_id' when calling get_environments");
    }

    # verify the required parameter 'x_gw_ims_org_id' is set
    unless (exists $args{'x_gw_ims_org_id'}) {
      croak("Missing the required parameter 'x_gw_ims_org_id' when calling get_environments");
    }

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling get_environments");
    }

    # verify the required parameter 'x_api_key' is set
    unless (exists $args{'x_api_key'}) {
      croak("Missing the required parameter 'x_api_key' when calling get_environments");
    }

    # parse inputs
    my $_resource_path = '/api/program/{programId}/environments';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'type'}) {
        $query_params->{'type'} = $self->{api_client}->to_query_value($args{'type'});
    }

    # header params
    if ( exists $args{'x_gw_ims_org_id'}) {
        $header_params->{'x-gw-ims-org-id'} = $self->{api_client}->to_header_value($args{'x_gw_ims_org_id'});
    }

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    # header params
    if ( exists $args{'x_api_key'}) {
        $header_params->{'x-api-key'} = $self->{api_client}->to_header_value($args{'x_api_key'});
    }

    # path params
    if ( exists $args{'program_id'}) {
        my $_base_variable = "{" . "programId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'program_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('EnvironmentList', $response);
    return $_response_object;
}

1;
