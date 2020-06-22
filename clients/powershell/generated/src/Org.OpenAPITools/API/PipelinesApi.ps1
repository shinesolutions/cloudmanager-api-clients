function Invoke-PipelinesApiDeletePipeline {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${pipelineId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey}
    )

    Process {
        'Calling method: PipelinesApi-DeletePipeline' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PipelinesApi.DeletePipeline(
            ${programId},
            ${pipelineId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey}
        )
    }
}

function Invoke-PipelinesApiGetPipeline {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${pipelineId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey}
    )

    Process {
        'Calling method: PipelinesApi-GetPipeline' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PipelinesApi.GetPipeline(
            ${programId},
            ${pipelineId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey}
        )
    }
}

function Invoke-PipelinesApiGetPipelines {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey}
    )

    Process {
        'Calling method: PipelinesApi-GetPipelines' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PipelinesApi.GetPipelines(
            ${programId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey}
        )
    }
}

function Invoke-PipelinesApiPatchPipeline {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${pipelineId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${contentType},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.Pipeline]
        ${body}
    )

    Process {
        'Calling method: PipelinesApi-PatchPipeline' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:PipelinesApi.PatchPipeline(
            ${programId},
            ${pipelineId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey},
            ${contentType},
            ${body}
        )
    }
}

