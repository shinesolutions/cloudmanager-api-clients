# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.Program do
  @moduledoc """
  Describes a __Program__
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"name",
    :"enabled",
    :"tenantId",
    :"imsOrgId",
    :"_links"
  ]

  @type t :: %__MODULE__{
    :"id" => String.t | nil,
    :"name" => String.t,
    :"enabled" => boolean() | nil,
    :"tenantId" => String.t | nil,
    :"imsOrgId" => String.t | nil,
    :"_links" => ProgramLinks | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.Program do
  import CloudManagerAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"_links", :struct, CloudManagerAPI.Model.ProgramLinks, options)
  end
end

