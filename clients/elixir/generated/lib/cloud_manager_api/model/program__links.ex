# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.ProgramLinks do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"http://ns.adobe.com/adobecloud/rel/pipelines",
    :"http://ns.adobe.com/adobecloud/rel/environments",
    :"http://ns.adobe.com/adobecloud/rel/repositories",
    :"self"
  ]

  @type t :: %__MODULE__{
    :"http://ns.adobe.com/adobecloud/rel/pipelines" => HalLink | nil,
    :"http://ns.adobe.com/adobecloud/rel/environments" => HalLink | nil,
    :"http://ns.adobe.com/adobecloud/rel/repositories" => HalLink | nil,
    :"self" => HalLink | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.ProgramLinks do
  import CloudManagerAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/pipelines", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/environments", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"http://ns.adobe.com/adobecloud/rel/repositories", :struct, CloudManagerAPI.Model.HalLink, options)
    |> deserialize(:"self", :struct, CloudManagerAPI.Model.HalLink, options)
  end
end

