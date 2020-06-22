function New-Pipeline {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${programId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${trigger},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${status},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${createdAt},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${updatedAt},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${lastStartedAt},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${lastFinishedAt},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.PipelinePhase[]]
        ${phases},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.PipelineLinks]
        ${Underscorelinks}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Pipeline' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Pipeline -ArgumentList @(
            ${id},
            ${programId},
            ${name},
            ${trigger},
            ${status},
            ${createdAt},
            ${updatedAt},
            ${lastStartedAt},
            ${lastFinishedAt},
            ${phases},
            ${Underscorelinks}
        )
    }
}
