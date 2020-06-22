function New-PipelineExecutionEmbedded {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.PipelineExecutionStepState[]]
        ${stepStates}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PipelineExecutionEmbedded' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PipelineExecutionEmbedded -ArgumentList @(
            ${stepStates}
        )
    }
}
