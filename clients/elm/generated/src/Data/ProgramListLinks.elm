{-
   Cloud Manager API
   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   The version of the OpenAPI document: 1.0.0
   Contact: opensource@shinesolutions.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.ProgramListLinks exposing (ProgramListLinks, decoder, encode, encodeWithTag, toString)

import Data.HalLink as HalLink exposing (HalLink)
import Data.HalLink as HalLink exposing (HalLink)
import Data.HalLink as HalLink exposing (HalLink)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type alias ProgramListLinks =
    { next : Maybe (HalLink)
    , prev : Maybe (HalLink)
    , self : Maybe (HalLink)
    }


decoder : Decoder ProgramListLinks
decoder =
    Decode.succeed ProgramListLinks
        |> optional "next" (Decode.nullable HalLink.decoder) Nothing
        |> optional "prev" (Decode.nullable HalLink.decoder) Nothing
        |> optional "self" (Decode.nullable HalLink.decoder) Nothing



encode : ProgramListLinks -> Encode.Value
encode =
    Encode.object << encodePairs


encodeWithTag : ( String, String ) -> ProgramListLinks -> Encode.Value
encodeWithTag (tagField, tag) model =
    Encode.object <| encodePairs model ++ [ ( tagField, Encode.string tag ) ]


encodePairs : ProgramListLinks -> List (String, Encode.Value)
encodePairs model =
    [ ( "next", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.next) )
    , ( "prev", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.prev) )
    , ( "self", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.self) )
    ]



toString : ProgramListLinks -> String
toString =
    Encode.encode 0 << encode




