{-
   Cloud Manager API
   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   The version of the OpenAPI document: 1.0.0
   Contact: opensource@shinesolutions.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.RepositoryBranch exposing (RepositoryBranch, decoder, encode, encodeWithTag, toString)

import Data.RepositoryBranchLinks as RepositoryBranchLinks exposing (RepositoryBranchLinks)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| Represents a Git Branch
-}
type alias RepositoryBranch =
    { programId : Maybe (String)
    , repositoryId : Maybe (Int)
    , name : Maybe (String)
    , links : Maybe (RepositoryBranchLinks)
    }


decoder : Decoder RepositoryBranch
decoder =
    Decode.succeed RepositoryBranch
        |> optional "programId" (Decode.nullable Decode.string) Nothing
        |> optional "repositoryId" (Decode.nullable Decode.int) Nothing
        |> optional "name" (Decode.nullable Decode.string) Nothing
        |> optional "_links" (Decode.nullable RepositoryBranchLinks.decoder) Nothing



encode : RepositoryBranch -> Encode.Value
encode =
    Encode.object << encodePairs


encodeWithTag : ( String, String ) -> RepositoryBranch -> Encode.Value
encodeWithTag (tagField, tag) model =
    Encode.object <| encodePairs model ++ [ ( tagField, Encode.string tag ) ]


encodePairs : RepositoryBranch -> List (String, Encode.Value)
encodePairs model =
    [ ( "programId", Maybe.withDefault Encode.null (Maybe.map Encode.string model.programId) )
    , ( "repositoryId", Maybe.withDefault Encode.null (Maybe.map Encode.int model.repositoryId) )
    , ( "name", Maybe.withDefault Encode.null (Maybe.map Encode.string model.name) )
    , ( "_links", Maybe.withDefault Encode.null (Maybe.map RepositoryBranchLinks.encode model.links) )
    ]



toString : RepositoryBranch -> String
toString =
    Encode.encode 0 << encode




