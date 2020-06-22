function New-PipelineListEmbedded {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.Pipeline[]]
        ${pipelines}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PipelineListEmbedded' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PipelineListEmbedded -ArgumentList @(
            ${pipelines}
        )
    }
}
