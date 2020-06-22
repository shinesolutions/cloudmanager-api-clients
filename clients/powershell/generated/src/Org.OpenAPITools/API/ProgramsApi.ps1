function Invoke-ProgramsApiDeleteProgram {
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
        'Calling method: ProgramsApi-DeleteProgram' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ProgramsApi.DeleteProgram(
            ${programId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey}
        )
    }
}

function Invoke-ProgramsApiGetProgram {
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
        'Calling method: ProgramsApi-GetProgram' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ProgramsApi.GetProgram(
            ${programId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey}
        )
    }
}

function Invoke-ProgramsApiGetPrograms {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey}
    )

    Process {
        'Calling method: ProgramsApi-GetPrograms' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ProgramsApi.GetPrograms(
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey}
        )
    }
}

