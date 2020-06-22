
package org.openapitools.client.model


case class ProgramListEmbedded (
    _programs: Option[List[EmbeddedProgram]]
)
object ProgramListEmbedded {
    def toStringBody(var_programs: Object) =
        s"""
        | {
        | "programs":$var_programs
        | }
        """.stripMargin
}
