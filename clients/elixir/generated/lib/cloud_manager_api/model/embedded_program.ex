# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.EmbeddedProgram do
  @moduledoc """
  Describes an __Embedded Program__
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"name",
    :"enabled",
    :"tenantId"
  ]

  @type t :: %__MODULE__{
    :"id" => String.t | nil,
    :"name" => String.t | nil,
    :"enabled" => boolean() | nil,
    :"tenantId" => String.t | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.EmbeddedProgram do
  def decode(value, _options) do
    value
  end
end

