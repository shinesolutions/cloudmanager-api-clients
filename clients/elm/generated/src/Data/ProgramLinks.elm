{-
   Cloud Manager API
   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   The version of the OpenAPI document: 1.0.0
   Contact: opensource@shinesolutions.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.ProgramLinks exposing (ProgramLinks, decoder, encode, encodeWithTag, toString)

import Data.HalLink as HalLink exposing (HalLink)
import Data.HalLink as HalLink exposing (HalLink)
import Data.HalLink as HalLink exposing (HalLink)
import Data.HalLink as HalLink exposing (HalLink)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type alias ProgramLinks =
    { http:NsAdobeComAdobecloudRelPipelines : Maybe (HalLink)
    , http:NsAdobeComAdobecloudRelEnvironments : Maybe (HalLink)
    , http:NsAdobeComAdobecloudRelRepositories : Maybe (HalLink)
    , self : Maybe (HalLink)
    }


decoder : Decoder ProgramLinks
decoder =
    Decode.succeed ProgramLinks
        |> optional "http://ns.adobe.com/adobecloud/rel/pipelines" (Decode.nullable HalLink.decoder) Nothing
        |> optional "http://ns.adobe.com/adobecloud/rel/environments" (Decode.nullable HalLink.decoder) Nothing
        |> optional "http://ns.adobe.com/adobecloud/rel/repositories" (Decode.nullable HalLink.decoder) Nothing
        |> optional "self" (Decode.nullable HalLink.decoder) Nothing



encode : ProgramLinks -> Encode.Value
encode =
    Encode.object << encodePairs


encodeWithTag : ( String, String ) -> ProgramLinks -> Encode.Value
encodeWithTag (tagField, tag) model =
    Encode.object <| encodePairs model ++ [ ( tagField, Encode.string tag ) ]


encodePairs : ProgramLinks -> List (String, Encode.Value)
encodePairs model =
    [ ( "http://ns.adobe.com/adobecloud/rel/pipelines", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.http:NsAdobeComAdobecloudRelPipelines) )
    , ( "http://ns.adobe.com/adobecloud/rel/environments", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.http:NsAdobeComAdobecloudRelEnvironments) )
    , ( "http://ns.adobe.com/adobecloud/rel/repositories", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.http:NsAdobeComAdobecloudRelRepositories) )
    , ( "self", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.self) )
    ]



toString : ProgramLinks -> String
toString =
    Encode.encode 0 << encode




