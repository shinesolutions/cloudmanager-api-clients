{-
   Cloud Manager API
   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   The version of the OpenAPI document: 1.0.0
   Contact: opensource@shinesolutions.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.PipelineExecution exposing (PipelineExecution, Status(..), Trigger(..), decoder, encode, encodeWithTag, toString)

import DateTime exposing (DateTime)
import DateTime exposing (DateTime)
import DateTime exposing (DateTime)
import Data.PipelineExecutionEmbedded as PipelineExecutionEmbedded exposing (PipelineExecutionEmbedded)
import Data.PipelineExecutionLinks as PipelineExecutionLinks exposing (PipelineExecutionLinks)
import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


{-| Wraps a pipeline execution
-}
type alias PipelineExecution =
    { id : Maybe (String)
    , programId : Maybe (String)
    , pipelineId : Maybe (String)
    , artifactsVersion : Maybe (String)
    , user : Maybe (String)
    , status : Maybe (Status)
    , trigger : Maybe (Trigger)
    , createdAt : Maybe (DateTime)
    , updatedAt : Maybe (DateTime)
    , finishedAt : Maybe (DateTime)
    , embedded : Maybe (PipelineExecutionEmbedded)
    , links : Maybe (PipelineExecutionLinks)
    }


type Status
    = NOTSTARTED
    | RUNNING
    | CANCELLING
    | CANCELLED
    | FINISHED
    | ERROR
    | FAILED



type Trigger
    = ONCOMMIT
    | MANUAL
    | SCHEDULE
    | PUSHUPGRADES



decoder : Decoder PipelineExecution
decoder =
    Decode.succeed PipelineExecution
        |> optional "id" (Decode.nullable Decode.string) Nothing
        |> optional "programId" (Decode.nullable Decode.string) Nothing
        |> optional "pipelineId" (Decode.nullable Decode.string) Nothing
        |> optional "artifactsVersion" (Decode.nullable Decode.string) Nothing
        |> optional "user" (Decode.nullable Decode.string) Nothing
        |> optional "status" (Decode.nullable statusDecoder) Nothing
        |> optional "trigger" (Decode.nullable triggerDecoder) Nothing
        |> optional "createdAt" (Decode.nullable DateTime.decoder) Nothing
        |> optional "updatedAt" (Decode.nullable DateTime.decoder) Nothing
        |> optional "finishedAt" (Decode.nullable DateTime.decoder) Nothing
        |> optional "_embedded" (Decode.nullable PipelineExecutionEmbedded.decoder) Nothing
        |> optional "_links" (Decode.nullable PipelineExecutionLinks.decoder) Nothing



encode : PipelineExecution -> Encode.Value
encode =
    Encode.object << encodePairs


encodeWithTag : ( String, String ) -> PipelineExecution -> Encode.Value
encodeWithTag (tagField, tag) model =
    Encode.object <| encodePairs model ++ [ ( tagField, Encode.string tag ) ]


encodePairs : PipelineExecution -> List (String, Encode.Value)
encodePairs model =
    [ ( "id", Maybe.withDefault Encode.null (Maybe.map Encode.string model.id) )
    , ( "programId", Maybe.withDefault Encode.null (Maybe.map Encode.string model.programId) )
    , ( "pipelineId", Maybe.withDefault Encode.null (Maybe.map Encode.string model.pipelineId) )
    , ( "artifactsVersion", Maybe.withDefault Encode.null (Maybe.map Encode.string model.artifactsVersion) )
    , ( "user", Maybe.withDefault Encode.null (Maybe.map Encode.string model.user) )
    , ( "status", Maybe.withDefault Encode.null (Maybe.map encodeStatus model.status) )
    , ( "trigger", Maybe.withDefault Encode.null (Maybe.map encodeTrigger model.trigger) )
    , ( "createdAt", Maybe.withDefault Encode.null (Maybe.map DateTime.encode model.createdAt) )
    , ( "updatedAt", Maybe.withDefault Encode.null (Maybe.map DateTime.encode model.updatedAt) )
    , ( "finishedAt", Maybe.withDefault Encode.null (Maybe.map DateTime.encode model.finishedAt) )
    , ( "_embedded", Maybe.withDefault Encode.null (Maybe.map PipelineExecutionEmbedded.encode model.embedded) )
    , ( "_links", Maybe.withDefault Encode.null (Maybe.map PipelineExecutionLinks.encode model.links) )
    ]



toString : PipelineExecution -> String
toString =
    Encode.encode 0 << encode




statusDecoder : Decoder Status
statusDecoder =
    Decode.string
        |> Decode.andThen
            (\str ->
                case str of
                    "NOT_STARTED" ->
                        Decode.succeed NOTSTARTED

                    "RUNNING" ->
                        Decode.succeed RUNNING

                    "CANCELLING" ->
                        Decode.succeed CANCELLING

                    "CANCELLED" ->
                        Decode.succeed CANCELLED

                    "FINISHED" ->
                        Decode.succeed FINISHED

                    "ERROR" ->
                        Decode.succeed ERROR

                    "FAILED" ->
                        Decode.succeed FAILED

                    other ->
                        Decode.fail <| "Unknown type: " ++ other
            )



encodeStatus : Status -> Encode.Value
encodeStatus model =
    case model of
        NOTSTARTED ->
            Encode.string "NOT_STARTED"

        RUNNING ->
            Encode.string "RUNNING"

        CANCELLING ->
            Encode.string "CANCELLING"

        CANCELLED ->
            Encode.string "CANCELLED"

        FINISHED ->
            Encode.string "FINISHED"

        ERROR ->
            Encode.string "ERROR"

        FAILED ->
            Encode.string "FAILED"




triggerDecoder : Decoder Trigger
triggerDecoder =
    Decode.string
        |> Decode.andThen
            (\str ->
                case str of
                    "ON_COMMIT" ->
                        Decode.succeed ONCOMMIT

                    "MANUAL" ->
                        Decode.succeed MANUAL

                    "SCHEDULE" ->
                        Decode.succeed SCHEDULE

                    "PUSH_UPGRADES" ->
                        Decode.succeed PUSHUPGRADES

                    other ->
                        Decode.fail <| "Unknown type: " ++ other
            )



encodeTrigger : Trigger -> Encode.Value
encodeTrigger model =
    case model of
        ONCOMMIT ->
            Encode.string "ON_COMMIT"

        MANUAL ->
            Encode.string "MANUAL"

        SCHEDULE ->
            Encode.string "SCHEDULE"

        PUSHUPGRADES ->
            Encode.string "PUSH_UPGRADES"




