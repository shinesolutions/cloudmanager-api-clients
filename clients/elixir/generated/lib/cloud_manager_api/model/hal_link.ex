# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.HalLink do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"href",
    :"templated",
    :"type",
    :"deprecation",
    :"profile",
    :"title",
    :"hreflang",
    :"name"
  ]

  @type t :: %__MODULE__{
    :"href" => String.t | nil,
    :"templated" => boolean() | nil,
    :"type" => String.t | nil,
    :"deprecation" => String.t | nil,
    :"profile" => String.t | nil,
    :"title" => String.t | nil,
    :"hreflang" => String.t | nil,
    :"name" => String.t | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.HalLink do
  def decode(value, _options) do
    value
  end
end

