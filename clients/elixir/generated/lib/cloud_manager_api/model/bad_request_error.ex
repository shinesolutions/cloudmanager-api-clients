# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.BadRequestError do
  @moduledoc """
  A Bad Request response error.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"status",
    :"type",
    :"title",
    :"missingParams",
    :"invalidParams"
  ]

  @type t :: %__MODULE__{
    :"status" => integer() | nil,
    :"type" => String.t | nil,
    :"title" => String.t | nil,
    :"missingParams" => [MissingParameter] | nil,
    :"invalidParams" => [InvalidParameter] | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.BadRequestError do
  import CloudManagerAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"missingParams", :list, CloudManagerAPI.Model.MissingParameter, options)
    |> deserialize(:"invalidParams", :list, CloudManagerAPI.Model.InvalidParameter, options)
  end
end

