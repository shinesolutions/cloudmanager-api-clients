function New-PipelineExecutionListRepresentation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${UnderscoretotalNumberOfItems},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.RequestedPageDetails]
        ${Underscorepage},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.PipelineExecutionListRepresentationEmbedded]
        ${Underscoreembedded},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [Org.OpenAPITools.Model.PipelineExecutionListRepresentationLinks]
        ${Underscorelinks}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.PipelineExecutionListRepresentation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.PipelineExecutionListRepresentation -ArgumentList @(
            ${UnderscoretotalNumberOfItems},
            ${Underscorepage},
            ${Underscoreembedded},
            ${Underscorelinks}
        )
    }
}
