# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.PipelineExecutionStepStateLinks do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"http://ns.adobe.com/adobecloud/rel/execution",
    :"http://ns.adobe.com/adobecloud/rel/pipeline",
    :"http://ns.adobe.com/adobecloud/rel/pipeline/logs",
    :"http://ns.adobe.com/adobecloud/rel/pipeline/metrics",
    :"http://ns.adobe.com/adobecloud/rel/pipeline/advance",
    :"http://ns.adobe.com/adobecloud/rel/pipeline/cancel",
    :"http://ns.adobe.com/adobecloud/rel/program",
    :"self"
  ]

  @type t :: %__MODULE__{
    :"http://ns.adobe.com/adobecloud/rel/execution" => HalLink | nil,
    :"http://ns.adobe.com/adobecloud/rel/pipeline" => HalLink | nil,
    :"http://ns.adobe.com/adobecloud/rel/pipeline/logs" => HalLink | nil,
    :"http://ns.adobe.com/adobecloud/rel/pipeline/metrics" => HalLink | nil,
    :"http://ns.adobe.com/adobecloud/rel/pipeline/advance" => HalLink | nil,
    :"http://ns.adobe.com/adobecloud/rel/pipeline/cancel" => HalLink | nil,
    :"http://ns.adobe.com/adobecloud/rel/program" => HalLink | nil,
    :"self" => HalLink | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.PipelineExecutionStepStateLinks do
  import CloudManagerAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/execution", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/pipeline", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/pipeline/logs", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/pipeline/metrics", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/pipeline/advance", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/pipeline/cancel", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/program", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"self", :struct, CloudManagerAPI.Model.HalLink, options)
  end
end

