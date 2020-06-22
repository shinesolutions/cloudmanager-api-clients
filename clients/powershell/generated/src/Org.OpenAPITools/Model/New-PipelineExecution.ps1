function New-PipelineExecution {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${programId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${pipelineId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${artifactsVersion},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${user},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${status},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${trigger},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${createdAt},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${updatedAt},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${finishedAt},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.PipelineExecutionEmbedded]
        ${Underscoreembedded},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.PipelineExecutionLinks]
        ${Underscorelinks}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PipelineExecution' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PipelineExecution -ArgumentList @(
            ${id},
            ${programId},
            ${pipelineId},
            ${artifactsVersion},
            ${user},
            ${status},
            ${trigger},
            ${createdAt},
            ${updatedAt},
            ${finishedAt},
            ${Underscoreembedded},
            ${Underscorelinks}
        )
    }
}
