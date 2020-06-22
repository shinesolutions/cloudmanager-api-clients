function New-InvalidParameter {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${reason}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InvalidParameter' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InvalidParameter -ArgumentList @(
            ${name},
            ${reason}
        )
    }
}
