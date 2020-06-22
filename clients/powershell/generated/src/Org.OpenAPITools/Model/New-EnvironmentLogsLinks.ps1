function New-EnvironmentLogsLinks {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${self}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.EnvironmentLogsLinks' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.EnvironmentLogsLinks -ArgumentList @(
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram},
            ${self}
        )
    }
}
