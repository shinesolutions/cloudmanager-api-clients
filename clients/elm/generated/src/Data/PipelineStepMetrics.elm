{-
   Cloud Manager API
   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   The version of the OpenAPI document: 1.0.0
   Contact: opensource@shinesolutions.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.PipelineStepMetrics exposing (PipelineStepMetrics, decoder, encode, encodeWithTag, toString)

import Data.Metric as Metric exposing (Metric)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type alias PipelineStepMetrics =
    { metrics : Maybe ((List Metric))
    }


decoder : Decoder PipelineStepMetrics
decoder =
    Decode.succeed PipelineStepMetrics
        |> optional "metrics" (Decode.nullable (Decode.list Metric.decoder)) Nothing



encode : PipelineStepMetrics -> Encode.Value
encode =
    Encode.object << encodePairs


encodeWithTag : ( String, String ) -> PipelineStepMetrics -> Encode.Value
encodeWithTag (tagField, tag) model =
    Encode.object <| encodePairs model ++ [ ( tagField, Encode.string tag ) ]


encodePairs : PipelineStepMetrics -> List (String, Encode.Value)
encodePairs model =
    [ ( "metrics", Maybe.withDefault Encode.null (Maybe.map (Encode.list Metric.encode) model.metrics) )
    ]



toString : PipelineStepMetrics -> String
toString =
    Encode.encode 0 << encode




