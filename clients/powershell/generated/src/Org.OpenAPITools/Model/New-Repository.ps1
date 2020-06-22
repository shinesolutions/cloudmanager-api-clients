function New-Repository {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${repo},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RepositoryLinks]
        ${Underscorelinks}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Repository' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Repository -ArgumentList @(
            ${repo},
            ${description},
            ${Underscorelinks}
        )
    }
}
