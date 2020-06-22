function New-RepositoryListEmbedded {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.Repository[]]
        ${repositories}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.RepositoryListEmbedded' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.RepositoryListEmbedded -ArgumentList @(
            ${repositories}
        )
    }
}
