using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// PipelineExecutionListRepresentationEmbedded
    /// </summary>
    public sealed class PipelineExecutionListRepresentationEmbedded:  IEquatable<PipelineExecutionListRepresentationEmbedded>
    { 
        /// <summary>
        /// Executions
        /// </summary>
        public List<PipelineExecution> Executions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineExecutionListRepresentationEmbedded.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineExecutionListRepresentationEmbedded()
        {
        }

        private PipelineExecutionListRepresentationEmbedded(List<PipelineExecution> Executions)
        {
            
            this.Executions = Executions;
            
        }

        /// <summary>
        /// Returns builder of PipelineExecutionListRepresentationEmbedded.
        /// </summary>
        /// <returns>PipelineExecutionListRepresentationEmbeddedBuilder</returns>
        public static PipelineExecutionListRepresentationEmbeddedBuilder Builder()
        {
            return new PipelineExecutionListRepresentationEmbeddedBuilder();
        }

        /// <summary>
        /// Returns PipelineExecutionListRepresentationEmbeddedBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineExecutionListRepresentationEmbeddedBuilder</returns>
        public PipelineExecutionListRepresentationEmbeddedBuilder With()
        {
            return Builder()
                .Executions(Executions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PipelineExecutionListRepresentationEmbedded other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineExecutionListRepresentationEmbedded.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionListRepresentationEmbedded</param>
        /// <param name="right">Compared (PipelineExecutionListRepresentationEmbedded</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineExecutionListRepresentationEmbedded left, PipelineExecutionListRepresentationEmbedded right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineExecutionListRepresentationEmbedded.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionListRepresentationEmbedded</param>
        /// <param name="right">Compared (PipelineExecutionListRepresentationEmbedded</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineExecutionListRepresentationEmbedded left, PipelineExecutionListRepresentationEmbedded right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineExecutionListRepresentationEmbedded.
        /// </summary>
        public sealed class PipelineExecutionListRepresentationEmbeddedBuilder
        {
            private List<PipelineExecution> _Executions;

            internal PipelineExecutionListRepresentationEmbeddedBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineExecutionListRepresentationEmbedded.Executions property.
            /// </summary>
            /// <param name="value">Executions</param>
            public PipelineExecutionListRepresentationEmbeddedBuilder Executions(List<PipelineExecution> value)
            {
                _Executions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineExecutionListRepresentationEmbedded.
            /// </summary>
            /// <returns>PipelineExecutionListRepresentationEmbedded</returns>
            public PipelineExecutionListRepresentationEmbedded Build()
            {
                Validate();
                return new PipelineExecutionListRepresentationEmbedded(
                    Executions: _Executions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}