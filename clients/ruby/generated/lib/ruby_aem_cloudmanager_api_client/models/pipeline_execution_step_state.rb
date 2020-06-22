=begin
#Cloud Manager API

#This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

The version of the OpenAPI document: 1.0.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.3.1-SNAPSHOT

=end

require 'date'

module AemCloudManagerApiClient
  # Describes the status of a particular pipeline execution step for display purposes
  class PipelineExecutionStepState
    attr_accessor :id

    attr_accessor :step_id

    attr_accessor :phase_id

    # Name of the action
    attr_accessor :action

    # Target repository
    attr_accessor :repository

    # Target branch
    attr_accessor :branch

    # Target environment
    attr_accessor :environment

    # Target environment type
    attr_accessor :environment_type

    # Start time
    attr_accessor :started_at

    # Date the execution reached a final state
    attr_accessor :finished_at

    # Information about step result
    attr_accessor :details

    # Action status
    attr_accessor :status

    attr_accessor :_links

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'id' => :'id',
        :'step_id' => :'stepId',
        :'phase_id' => :'phaseId',
        :'action' => :'action',
        :'repository' => :'repository',
        :'branch' => :'branch',
        :'environment' => :'environment',
        :'environment_type' => :'environmentType',
        :'started_at' => :'startedAt',
        :'finished_at' => :'finishedAt',
        :'details' => :'details',
        :'status' => :'status',
        :'_links' => :'_links'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'id' => :'String',
        :'step_id' => :'String',
        :'phase_id' => :'String',
        :'action' => :'String',
        :'repository' => :'String',
        :'branch' => :'String',
        :'environment' => :'String',
        :'environment_type' => :'String',
        :'started_at' => :'DateTime',
        :'finished_at' => :'DateTime',
        :'details' => :'Hash<String, Object>',
        :'status' => :'String',
        :'_links' => :'PipelineExecutionStepStateLinks'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `AemCloudManagerApiClient::PipelineExecutionStepState` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `AemCloudManagerApiClient::PipelineExecutionStepState`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'step_id')
        self.step_id = attributes[:'step_id']
      end

      if attributes.key?(:'phase_id')
        self.phase_id = attributes[:'phase_id']
      end

      if attributes.key?(:'action')
        self.action = attributes[:'action']
      end

      if attributes.key?(:'repository')
        self.repository = attributes[:'repository']
      end

      if attributes.key?(:'branch')
        self.branch = attributes[:'branch']
      end

      if attributes.key?(:'environment')
        self.environment = attributes[:'environment']
      end

      if attributes.key?(:'environment_type')
        self.environment_type = attributes[:'environment_type']
      end

      if attributes.key?(:'started_at')
        self.started_at = attributes[:'started_at']
      end

      if attributes.key?(:'finished_at')
        self.finished_at = attributes[:'finished_at']
      end

      if attributes.key?(:'details')
        if (value = attributes[:'details']).is_a?(Hash)
          self.details = value
        end
      end

      if attributes.key?(:'status')
        self.status = attributes[:'status']
      end

      if attributes.key?(:'_links')
        self._links = attributes[:'_links']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      status_validator = EnumAttributeValidator.new('String', ["NOT_STARTED", "RUNNING", "FINISHED", "ERROR", "ROLLING_BACK", "ROLLED_BACK", "WAITING", "CANCELLED", "FAILED"])
      return false unless status_validator.valid?(@status)
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] status Object to be assigned
    def status=(status)
      validator = EnumAttributeValidator.new('String', ["NOT_STARTED", "RUNNING", "FINISHED", "ERROR", "ROLLING_BACK", "ROLLED_BACK", "WAITING", "CANCELLED", "FAILED"])
      unless validator.valid?(status)
        fail ArgumentError, "invalid value for \"status\", must be one of #{validator.allowable_values}."
      end
      @status = status
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          step_id == o.step_id &&
          phase_id == o.phase_id &&
          action == o.action &&
          repository == o.repository &&
          branch == o.branch &&
          environment == o.environment &&
          environment_type == o.environment_type &&
          started_at == o.started_at &&
          finished_at == o.finished_at &&
          details == o.details &&
          status == o.status &&
          _links == o._links
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [id, step_id, phase_id, action, repository, branch, environment, environment_type, started_at, finished_at, details, status, _links].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        AemCloudManagerApiClient.const_get(type).build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end
        
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end
  end
end
