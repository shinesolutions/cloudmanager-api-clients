# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.ProgramList do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"_totalNumberOfItems",
    :"_embedded",
    :"_links"
  ]

  @type t :: %__MODULE__{
    :"_totalNumberOfItems" => integer() | nil,
    :"_embedded" => ProgramListEmbedded | nil,
    :"_links" => ProgramListLinks | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.ProgramList do
  import CloudManagerAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"_embedded", :struct, CloudManagerAPI.Model.ProgramListEmbedded, options)
    |> deserialize(:"_links", :struct, CloudManagerAPI.Model.ProgramListLinks, options)
  end
end

