function New-Metric {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${severity},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${passed},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${override},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${actualValue},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${expectedValue},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${comparator},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${kpi}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Metric' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Metric -ArgumentList @(
            ${id},
            ${severity},
            ${passed},
            ${override},
            ${actualValue},
            ${expectedValue},
            ${comparator},
            ${kpi}
        )
    }
}
