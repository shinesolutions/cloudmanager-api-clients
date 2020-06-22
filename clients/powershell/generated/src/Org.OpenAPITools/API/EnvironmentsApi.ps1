function Invoke-EnvironmentsApiDeleteEnvironment {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${environmentId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey}
    )

    Process {
        'Calling method: EnvironmentsApi-DeleteEnvironment' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:EnvironmentsApi.DeleteEnvironment(
            ${programId},
            ${environmentId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey}
        )
    }
}

function Invoke-EnvironmentsApiDownloadLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${environmentId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${service},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${date},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey},
        [Parameter(Position = 8, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${accept}
    )

    Process {
        'Calling method: EnvironmentsApi-DownloadLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:EnvironmentsApi.DownloadLogs(
            ${programId},
            ${environmentId},
            ${service},
            ${name},
            ${date},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey},
            ${accept}
        )
    }
}

function Invoke-EnvironmentsApiGetEnvironment {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${environmentId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey}
    )

    Process {
        'Calling method: EnvironmentsApi-GetEnvironment' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:EnvironmentsApi.GetEnvironment(
            ${programId},
            ${environmentId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey}
        )
    }
}

function Invoke-EnvironmentsApiGetEnvironmentLogs {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${environmentId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${days},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 5, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey},
        [Parameter(Position = 6, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${service},
        [Parameter(Position = 7, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${name}
    )

    Process {
        'Calling method: EnvironmentsApi-GetEnvironmentLogs' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:EnvironmentsApi.GetEnvironmentLogs(
            ${programId},
            ${environmentId},
            ${days},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey},
            ${service},
            ${name}
        )
    }
}

function Invoke-EnvironmentsApiGetEnvironments {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${programId},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xGwImsOrgId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${authorization},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${xApiKey},
        [Parameter(Position = 4, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${type}
    )

    Process {
        'Calling method: EnvironmentsApi-GetEnvironments' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:EnvironmentsApi.GetEnvironments(
            ${programId},
            ${xGwImsOrgId},
            ${authorization},
            ${xApiKey},
            ${type}
        )
    }
}

