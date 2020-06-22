function New-PipelineStepMetrics {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.Metric[]]
        ${metrics}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PipelineStepMetrics' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PipelineStepMetrics -ArgumentList @(
            ${metrics}
        )
    }
}
