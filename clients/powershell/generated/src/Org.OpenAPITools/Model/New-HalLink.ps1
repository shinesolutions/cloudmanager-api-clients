function New-HalLink {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${href},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${templated},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${type},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${deprecation},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${profile},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${title},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${hreflang},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.HalLink' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.HalLink -ArgumentList @(
            ${href},
            ${templated},
            ${type},
            ${deprecation},
            ${profile},
            ${title},
            ${hreflang},
            ${name}
        )
    }
}
