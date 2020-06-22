#region Import functions

'API', 'Model', 'Private' | Get-ChildItem -Path {
    Join-Path $PSScriptRoot $_
} -Filter '*.ps1' | ForEach-Object {
    Write-Verbose "Importing file: $($_.BaseName)"
    try {
        . $_.FullName
    } catch {
        Write-Verbose "Can't import function!"
    }
}

#endregion


#region Initialize APIs

'Creating object: Org.OpenAPITools.Api.BranchesApi' | Write-Verbose
$Script:BranchesApi= New-Object -TypeName Org.OpenAPITools.Api.BranchesApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.EnvironmentsApi' | Write-Verbose
$Script:EnvironmentsApi= New-Object -TypeName Org.OpenAPITools.Api.EnvironmentsApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.PipelineExecutionApi' | Write-Verbose
$Script:PipelineExecutionApi= New-Object -TypeName Org.OpenAPITools.Api.PipelineExecutionApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.PipelinesApi' | Write-Verbose
$Script:PipelinesApi= New-Object -TypeName Org.OpenAPITools.Api.PipelinesApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.ProgramsApi' | Write-Verbose
$Script:ProgramsApi= New-Object -TypeName Org.OpenAPITools.Api.ProgramsApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.RepositoriesApi' | Write-Verbose
$Script:RepositoriesApi= New-Object -TypeName Org.OpenAPITools.Api.RepositoriesApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.VariablesApi' | Write-Verbose
$Script:VariablesApi= New-Object -TypeName Org.OpenAPITools.Api.VariablesApi -ArgumentList @($null)


#endregion
