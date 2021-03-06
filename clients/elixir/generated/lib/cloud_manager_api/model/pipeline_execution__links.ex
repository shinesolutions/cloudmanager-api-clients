# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.PipelineExecutionLinks do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"http://ns.adobe.com/adobecloud/rel/program",
    :"http://ns.adobe.com/adobecloud/rel/pipeline",
    :"self"
  ]

  @type t :: %__MODULE__{
    :"http://ns.adobe.com/adobecloud/rel/program" => HalLink | nil,
    :"http://ns.adobe.com/adobecloud/rel/pipeline" => HalLink | nil,
    :"self" => HalLink | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.PipelineExecutionLinks do
  import CloudManagerAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/program", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/pipeline", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"self", :struct, CloudManagerAPI.Model.HalLink, options)
  end
end

