function New-EnvironmentLogLinks {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashdownload},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashtail}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.EnvironmentLogLinks' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.EnvironmentLogLinks -ArgumentList @(
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashdownload},
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashtail}
        )
    }
}
