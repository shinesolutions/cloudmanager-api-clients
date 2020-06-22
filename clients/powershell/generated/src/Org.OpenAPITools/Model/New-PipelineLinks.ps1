function New-PipelineLinks {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecution},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecutions},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrollbackLastSuccessfulExecution},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${self}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PipelineLinks' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PipelineLinks -ArgumentList @(
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram},
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecution},
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecutions},
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrollbackLastSuccessfulExecution},
            ${self}
        )
    }
}
