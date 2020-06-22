function New-PipelinePhase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${type},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${repositoryId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${branch},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${environmentId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PipelinePhase' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PipelinePhase -ArgumentList @(
            ${name},
            ${type},
            ${repositoryId},
            ${branch},
            ${environmentId}
        )
    }
}
