function New-RequestedPageDetails {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${start},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${limit},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${orderBy},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${property},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${type},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${next},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${prev}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.RequestedPageDetails' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.RequestedPageDetails -ArgumentList @(
            ${start},
            ${limit},
            ${orderBy},
            ${property},
            ${type},
            ${next},
            ${prev}
        )
    }
}
