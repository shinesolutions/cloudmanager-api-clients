function New-EnvironmentListEmbedded {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.Environment[]]
        ${environments}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.EnvironmentListEmbedded' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.EnvironmentListEmbedded -ArgumentList @(
            ${environments}
        )
    }
}
