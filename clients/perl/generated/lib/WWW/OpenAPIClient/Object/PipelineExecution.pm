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
package WWW::OpenAPIClient::Object::PipelineExecution;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use WWW::OpenAPIClient::Object::PipelineExecutionEmbedded;
use WWW::OpenAPIClient::Object::PipelineExecutionLinks;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#Wraps a pipeline execution
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

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
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {}); 
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new { 
    my ($class, %args) = @_; 

    my $self = bless {}, $class;

    $self->init(%args);
    
    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON { 
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }

    return $_data;
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key}; 
        if ($_type =~ /^array\[(.+)\]$/i) { # array
            my $_subclass = $1;
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
            my $_subclass = $1;
            my %_hash = ();
            while (my($_key, $_element) = each %{$hash->{$_json_attribute}}) {
                $_hash{$_key} = $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \%_hash;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }
  
    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);

    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => 'Wraps a pipeline execution',
                                  class => 'PipelineExecution',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'id' => {
        datatype => 'string',
        base_name => 'id',
        description => 'Pipeline execution identifier',
        format => '',
        read_only => '',
            },
    'program_id' => {
        datatype => 'string',
        base_name => 'programId',
        description => 'Identifier of the program. Unique within the space.',
        format => '',
        read_only => '',
            },
    'pipeline_id' => {
        datatype => 'string',
        base_name => 'pipelineId',
        description => 'Identifier of the pipeline. Unique within the space.',
        format => '',
        read_only => '',
            },
    'artifacts_version' => {
        datatype => 'string',
        base_name => 'artifactsVersion',
        description => 'Version of the artifacts generated during this execution',
        format => '',
        read_only => '',
            },
    'user' => {
        datatype => 'string',
        base_name => 'user',
        description => 'AdobeID who started the pipeline. Empty for auto triggered builds',
        format => '',
        read_only => '',
            },
    'status' => {
        datatype => 'string',
        base_name => 'status',
        description => 'Status of the execution',
        format => '',
        read_only => '',
            },
    'trigger' => {
        datatype => 'string',
        base_name => 'trigger',
        description => 'How the execution was triggered.',
        format => '',
        read_only => '',
            },
    'created_at' => {
        datatype => 'DateTime',
        base_name => 'createdAt',
        description => 'Start time',
        format => '',
        read_only => '',
            },
    'updated_at' => {
        datatype => 'DateTime',
        base_name => 'updatedAt',
        description => 'Date of last status change',
        format => '',
        read_only => '',
            },
    'finished_at' => {
        datatype => 'DateTime',
        base_name => 'finishedAt',
        description => 'Date the execution reached a final state',
        format => '',
        read_only => '',
            },
    '_embedded' => {
        datatype => 'PipelineExecutionEmbedded',
        base_name => '_embedded',
        description => '',
        format => '',
        read_only => '',
            },
    '_links' => {
        datatype => 'PipelineExecutionLinks',
        base_name => '_links',
        description => '',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'id' => 'string',
    'program_id' => 'string',
    'pipeline_id' => 'string',
    'artifacts_version' => 'string',
    'user' => 'string',
    'status' => 'string',
    'trigger' => 'string',
    'created_at' => 'DateTime',
    'updated_at' => 'DateTime',
    'finished_at' => 'DateTime',
    '_embedded' => 'PipelineExecutionEmbedded',
    '_links' => 'PipelineExecutionLinks'
} );

__PACKAGE__->attribute_map( {
    'id' => 'id',
    'program_id' => 'programId',
    'pipeline_id' => 'pipelineId',
    'artifacts_version' => 'artifactsVersion',
    'user' => 'user',
    'status' => 'status',
    'trigger' => 'trigger',
    'created_at' => 'createdAt',
    'updated_at' => 'updatedAt',
    'finished_at' => 'finishedAt',
    '_embedded' => '_embedded',
    '_links' => '_links'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
