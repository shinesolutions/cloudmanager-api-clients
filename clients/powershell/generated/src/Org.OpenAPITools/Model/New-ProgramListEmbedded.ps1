function New-ProgramListEmbedded {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.EmbeddedProgram[]]
        ${programs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ProgramListEmbedded' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ProgramListEmbedded -ArgumentList @(
            ${programs}
        )
    }
}
