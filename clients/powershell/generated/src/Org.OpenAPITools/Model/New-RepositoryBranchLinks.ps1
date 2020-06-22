function New-RepositoryBranchLinks {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrepository}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.RepositoryBranchLinks' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.RepositoryBranchLinks -ArgumentList @(
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram},
            ${httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrepository}
        )
    }
}
