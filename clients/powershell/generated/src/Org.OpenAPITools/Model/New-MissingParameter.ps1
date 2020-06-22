function New-MissingParameter {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${type}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.MissingParameter' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.MissingParameter -ArgumentList @(
            ${name},
            ${type}
        )
    }
}
