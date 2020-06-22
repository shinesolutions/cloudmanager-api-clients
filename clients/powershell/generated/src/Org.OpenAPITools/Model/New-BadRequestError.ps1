function New-BadRequestError {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${status},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${type},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${title},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.MissingParameter[]]
        ${missingParams},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.InvalidParameter[]]
        ${invalidParams}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.BadRequestError' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.BadRequestError -ArgumentList @(
            ${status},
            ${type},
            ${title},
            ${missingParams},
            ${invalidParams}
        )
    }
}
