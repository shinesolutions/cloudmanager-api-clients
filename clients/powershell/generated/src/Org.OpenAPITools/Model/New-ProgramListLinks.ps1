function New-ProgramListLinks {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${next},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${prev},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.HalLink]
        ${self}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ProgramListLinks' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ProgramListLinks -ArgumentList @(
            ${next},
            ${prev},
            ${self}
        )
    }
}
