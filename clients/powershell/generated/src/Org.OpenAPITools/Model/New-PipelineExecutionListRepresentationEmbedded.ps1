function New-PipelineExecutionListRepresentationEmbedded {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.PipelineExecution[]]
        ${executions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PipelineExecutionListRepresentationEmbedded' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PipelineExecutionListRepresentationEmbedded -ArgumentList @(
            ${executions}
        )
    }
}
