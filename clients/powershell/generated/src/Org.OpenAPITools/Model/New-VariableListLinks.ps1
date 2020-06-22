function New-VariableListLinks {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashenvironment},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${self}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VariableListLinks' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VariableListLinks -ArgumentList @(
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashenvironment},
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram},
            ${self}
        )
    }
}
