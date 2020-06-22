function New-EmbeddedProgram {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${enabled},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${tenantId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.EmbeddedProgram' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.EmbeddedProgram -ArgumentList @(
            ${id},
            ${name},
            ${enabled},
            ${tenantId}
        )
    }
}
