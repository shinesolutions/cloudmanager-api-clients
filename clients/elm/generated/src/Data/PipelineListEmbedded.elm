{-
   Cloud Manager API
   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   The version of the OpenAPI document: 1.0.0
   Contact: opensource@shinesolutions.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.PipelineListEmbedded exposing (PipelineListEmbedded, decoder, encode, encodeWithTag, toString)

import Data.Pipeline as Pipeline exposing (Pipeline)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type alias PipelineListEmbedded =
    { pipelines : Maybe ((List Pipeline))
    }


decoder : Decoder PipelineListEmbedded
decoder =
    Decode.succeed PipelineListEmbedded
        |> optional "pipelines" (Decode.nullable (Decode.list Pipeline.decoder)) Nothing



encode : PipelineListEmbedded -> Encode.Value
encode =
    Encode.object << encodePairs


encodeWithTag : ( String, String ) -> PipelineListEmbedded -> Encode.Value
encodeWithTag (tagField, tag) model =
    Encode.object <| encodePairs model ++ [ ( tagField, Encode.string tag ) ]


encodePairs : PipelineListEmbedded -> List (String, Encode.Value)
encodePairs model =
    [ ( "pipelines", Maybe.withDefault Encode.null (Maybe.map (Encode.list Pipeline.encode) model.pipelines) )
    ]



toString : PipelineListEmbedded -> String
toString =
    Encode.encode 0 << encode




