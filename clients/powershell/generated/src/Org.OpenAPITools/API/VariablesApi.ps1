function Invoke-VariablesApiGetEnvironmentVariables {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${environmentId},
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
        'Calling method: VariablesApi-GetEnvironmentVariables' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:VariablesApi.GetEnvironmentVariables(
            ${programId},
            ${environmentId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey}
        )
    }
}

function Invoke-VariablesApiPatchEnvironmentVariables {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${environmentId},
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
        [Org.OpenAPITools.Model.Variable[]]
        ${body}
    )

    Process {
        'Calling method: VariablesApi-PatchEnvironmentVariables' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:VariablesApi.PatchEnvironmentVariables(
            ${programId},
            ${environmentId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey},
            ${contentType},
            ${body}
        )
    }
}

