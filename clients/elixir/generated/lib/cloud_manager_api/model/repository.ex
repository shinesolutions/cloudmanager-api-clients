# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.Repository do
  @moduledoc """
  A sourcecode repository
  """

  @derive [Poison.Encoder]
  defstruct [
    :"repo",
    :"description",
    :"_links"
  ]

  @type t :: %__MODULE__{
    :"repo" => String.t | nil,
    :"description" => String.t | nil,
    :"_links" => RepositoryLinks | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.Repository do
  import CloudManagerAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"_links", :struct, CloudManagerAPI.Model.RepositoryLinks, options)
  end
end

