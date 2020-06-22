function New-BranchListEmbedded {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RepositoryBranch[]]
        ${branches}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.BranchListEmbedded' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.BranchListEmbedded -ArgumentList @(
            ${branches}
        )
    }
}
