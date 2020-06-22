
package org.openapitools.client.model


case class HalLink (
    _href: Option[String],
    _templated: Option[Boolean],
    _type: Option[String],
    _deprecation: Option[String],
    _profile: Option[String],
    _title: Option[String],
    _hreflang: Option[String],
    _name: Option[String]
)
object HalLink {
    def toStringBody(var_href: Object, var_templated: Object, var_type: Object, var_deprecation: Object, var_profile: Object, var_title: Object, var_hreflang: Object, var_name: Object) =
        s"""
        | {
        | "href":$var_href,"templated":$var_templated,"type":$var_type,"deprecation":$var_deprecation,"profile":$var_profile,"title":$var_title,"hreflang":$var_hreflang,"name":$var_name
        | }
        """.stripMargin
}
