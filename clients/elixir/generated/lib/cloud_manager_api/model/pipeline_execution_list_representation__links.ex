# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.PipelineExecutionListRepresentationLinks do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"next",
    :"page",
    :"prev",
    :"self"
  ]

  @type t :: %__MODULE__{
    :"next" => HalLink | nil,
    :"page" => HalLink | nil,
    :"prev" => HalLink | nil,
    :"self" => HalLink | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.PipelineExecutionListRepresentationLinks do
  import CloudManagerAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"next", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"page", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"prev", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"self", :struct, CloudManagerAPI.Model.HalLink, options)
  end
end

