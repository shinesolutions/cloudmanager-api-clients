# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule CloudManagerAPI.Model.RepositoryBranch do
  @moduledoc """
  Represents a Git Branch
  """

  @derive [Poison.Encoder]
  defstruct [
    :"programId",
    :"repositoryId",
    :"name",
    :"_links"
  ]

  @type t :: %__MODULE__{
    :"programId" => String.t | nil,
    :"repositoryId" => integer() | nil,
    :"name" => String.t | nil,
    :"_links" => RepositoryBranchLinks | nil
  }
end

defimpl Poison.Decoder, for: CloudManagerAPI.Model.RepositoryBranch do
  import CloudManagerAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"_links", :struct, CloudManagerAPI.Model.RepositoryBranchLinks, options)
  end
end

