function New-VariableListEmbedded {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.Variable[]]
        ${variables}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.VariableListEmbedded' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.VariableListEmbedded -ArgumentList @(
            ${variables}
        )
    }
}
