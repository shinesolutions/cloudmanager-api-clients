{-
   Cloud Manager API
   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   The version of the OpenAPI document: 1.0.0
   Contact: opensource@shinesolutions.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.RepositoryLinks exposing (RepositoryLinks, decoder, encode, encodeWithTag, toString)

import Data.HalLink as HalLink exposing (HalLink)
import Data.HalLink as HalLink exposing (HalLink)
import Data.HalLink as HalLink exposing (HalLink)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type alias RepositoryLinks =
    { http:NsAdobeComAdobecloudRelProgram : Maybe (HalLink)
    , http:NsAdobeComAdobecloudRelBranches : Maybe (HalLink)
    , self : Maybe (HalLink)
    }


decoder : Decoder RepositoryLinks
decoder =
    Decode.succeed RepositoryLinks
        |> optional "http://ns.adobe.com/adobecloud/rel/program" (Decode.nullable HalLink.decoder) Nothing
        |> optional "http://ns.adobe.com/adobecloud/rel/branches" (Decode.nullable HalLink.decoder) Nothing
        |> optional "self" (Decode.nullable HalLink.decoder) Nothing



encode : RepositoryLinks -> Encode.Value
encode =
    Encode.object << encodePairs


encodeWithTag : ( String, String ) -> RepositoryLinks -> Encode.Value
encodeWithTag (tagField, tag) model =
    Encode.object <| encodePairs model ++ [ ( tagField, Encode.string tag ) ]


encodePairs : RepositoryLinks -> List (String, Encode.Value)
encodePairs model =
    [ ( "http://ns.adobe.com/adobecloud/rel/program", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.http:NsAdobeComAdobecloudRelProgram) )
    , ( "http://ns.adobe.com/adobecloud/rel/branches", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.http:NsAdobeComAdobecloudRelBranches) )
    , ( "self", Maybe.withDefault Encode.null (Maybe.map HalLink.encode model.self) )
    ]



toString : RepositoryLinks -> String
toString =
    Encode.encode 0 << encode




