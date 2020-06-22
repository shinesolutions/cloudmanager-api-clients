using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Describes a phase of a pipeline
    /// </summary>
    public sealed class PipelinePhase:  IEquatable<PipelinePhase>
    { 
        /// <summary>
        /// Name of the phase
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Type of the phase
        /// </summary>
        public TypeEnum? Type { get; private set; }

        /// <summary>
        /// Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD
        /// </summary>
        public string RepositoryId { get; private set; }

        /// <summary>
        /// Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing.
        /// </summary>
        public string Branch { get; private set; }

        /// <summary>
        /// Identifier of the target environment. Mandatory if type&#x3D;DEPLOY
        /// </summary>
        public string EnvironmentId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelinePhase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelinePhase()
        {
        }

        private PipelinePhase(string Name, TypeEnum? Type, string RepositoryId, string Branch, string EnvironmentId)
        {
            
            this.Name = Name;
            
            this.Type = Type;
            
            this.RepositoryId = RepositoryId;
            
            this.Branch = Branch;
            
            this.EnvironmentId = EnvironmentId;
            
        }

        /// <summary>
        /// Returns builder of PipelinePhase.
        /// </summary>
        /// <returns>PipelinePhaseBuilder</returns>
        public static PipelinePhaseBuilder Builder()
        {
            return new PipelinePhaseBuilder();
        }

        /// <summary>
        /// Returns PipelinePhaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelinePhaseBuilder</returns>
        public PipelinePhaseBuilder With()
        {
            return Builder()
                .Name(Name)
                .Type(Type)
                .RepositoryId(RepositoryId)
                .Branch(Branch)
                .EnvironmentId(EnvironmentId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PipelinePhase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelinePhase.
        /// </summary>
        /// <param name="left">Compared (PipelinePhase</param>
        /// <param name="right">Compared (PipelinePhase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelinePhase left, PipelinePhase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelinePhase.
        /// </summary>
        /// <param name="left">Compared (PipelinePhase</param>
        /// <param name="right">Compared (PipelinePhase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelinePhase left, PipelinePhase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelinePhase.
        /// </summary>
        public sealed class PipelinePhaseBuilder
        {
            private string _Name;
            private TypeEnum? _Type;
            private string _RepositoryId;
            private string _Branch;
            private string _EnvironmentId;

            internal PipelinePhaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelinePhase.Name property.
            /// </summary>
            /// <param name="value">Name of the phase</param>
            public PipelinePhaseBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelinePhase.Type property.
            /// </summary>
            /// <param name="value">Type of the phase</param>
            public PipelinePhaseBuilder Type(TypeEnum? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelinePhase.RepositoryId property.
            /// </summary>
            /// <param name="value">Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD</param>
            public PipelinePhaseBuilder RepositoryId(string value)
            {
                _RepositoryId = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelinePhase.Branch property.
            /// </summary>
            /// <param name="value">Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing.</param>
            public PipelinePhaseBuilder Branch(string value)
            {
                _Branch = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelinePhase.EnvironmentId property.
            /// </summary>
            /// <param name="value">Identifier of the target environment. Mandatory if type&#x3D;DEPLOY</param>
            public PipelinePhaseBuilder EnvironmentId(string value)
            {
                _EnvironmentId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelinePhase.
            /// </summary>
            /// <returns>PipelinePhase</returns>
            public PipelinePhase Build()
            {
                Validate();
                return new PipelinePhase(
                    Name: _Name,
                    Type: _Type,
                    RepositoryId: _RepositoryId,
                    Branch: _Branch,
                    EnvironmentId: _EnvironmentId
                );
            }

            private void Validate()
            { 
                if (_Type == null)
                {
                    throw new ArgumentException("Type is a required property for PipelinePhase and cannot be null");
                } 
            }
        }

        
        public enum TypeEnum { VALIDATE, BUILD, DEPLOY };
    }
}