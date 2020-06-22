
package org.openapitools.client.model


case class BadRequestError (
    /* HTTP status code of the response. */
    _status: Option[Integer],
    /* Error type identifier. */
    _type: Option[String],
    /* A short summary of the error. */
    _title: Option[String],
    /* Request's missing parameters. */
    _missingParams: Option[List[MissingParameter]],
    /* Request's invalid parameters. */
    _invalidParams: Option[List[InvalidParameter]]
)
object BadRequestError {
    def toStringBody(var_status: Object, var_type: Object, var_title: Object, var_missingParams: Object, var_invalidParams: Object) =
        s"""
        | {
        | "status":$var_status,"type":$var_type,"title":$var_title,"missingParams":$var_missingParams,"invalidParams":$var_invalidParams
        | }
        """.stripMargin
}
