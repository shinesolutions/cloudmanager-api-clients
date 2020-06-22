function New-EnvironmentLogsEmbedded {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.EnvironmentLog[]]
        ${downloads}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.EnvironmentLogsEmbedded' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.EnvironmentLogsEmbedded -ArgumentList @(
            ${downloads}
        )
    }
}
