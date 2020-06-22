function New-PipelineExecutionStepState {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${stepId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${phaseId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${action},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${repository},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${branch},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${environment},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${environmentType},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${startedAt},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${finishedAt},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[{String, String}]]
        ${details},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${status},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.PipelineExecutionStepStateLinks]
        ${Underscorelinks}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PipelineExecutionStepState' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PipelineExecutionStepState -ArgumentList @(
            ${id},
            ${stepId},
            ${phaseId},
            ${action},
            ${repository},
            ${branch},
            ${environment},
            ${environmentType},
            ${startedAt},
            ${finishedAt},
            ${details},
            ${status},
            ${Underscorelinks}
        )
    }
}
