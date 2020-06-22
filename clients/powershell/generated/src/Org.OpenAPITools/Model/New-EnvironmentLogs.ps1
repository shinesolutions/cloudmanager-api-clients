function New-EnvironmentLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${service},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${days},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.EnvironmentLogsLinks]
        ${Underscorelinks},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.EnvironmentLogsEmbedded]
        ${Underscoreembedded}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.EnvironmentLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.EnvironmentLogs -ArgumentList @(
            ${service},
            ${name},
            ${days},
            ${Underscorelinks},
            ${Underscoreembedded}
        )
    }
}
