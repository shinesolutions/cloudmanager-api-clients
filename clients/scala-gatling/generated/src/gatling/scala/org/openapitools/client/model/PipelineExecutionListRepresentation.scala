
package org.openapitools.client.model


case class PipelineExecutionListRepresentation (
    _totalNumberOfItems: Option[Integer],
    _page: Option[RequestedPageDetails],
    _embedded: Option[PipelineExecutionListRepresentationEmbedded],
    _links: Option[PipelineExecutionListRepresentationLinks]
)
object PipelineExecutionListRepresentation {
    def toStringBody(var_totalNumberOfItems: Object, var_page: Object, var_embedded: Object, var_links: Object) =
        s"""
        | {
        | "totalNumberOfItems":$var_totalNumberOfItems,"page":$var_page,"embedded":$var_embedded,"links":$var_links
        | }
        """.stripMargin
}
