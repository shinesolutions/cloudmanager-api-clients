using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// PipelineListEmbedded
    /// </summary>
    public sealed class PipelineListEmbedded:  IEquatable<PipelineListEmbedded>
    { 
        /// <summary>
        /// Pipelines
        /// </summary>
        public List<Pipeline> Pipelines { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineListEmbedded.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineListEmbedded()
        {
        }

        private PipelineListEmbedded(List<Pipeline> Pipelines)
        {
            
            this.Pipelines = Pipelines;
            
        }

        /// <summary>
        /// Returns builder of PipelineListEmbedded.
        /// </summary>
        /// <returns>PipelineListEmbeddedBuilder</returns>
        public static PipelineListEmbeddedBuilder Builder()
        {
            return new PipelineListEmbeddedBuilder();
        }

        /// <summary>
        /// Returns PipelineListEmbeddedBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineListEmbeddedBuilder</returns>
        public PipelineListEmbeddedBuilder With()
        {
            return Builder()
                .Pipelines(Pipelines);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PipelineListEmbedded other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineListEmbedded.
        /// </summary>
        /// <param name="left">Compared (PipelineListEmbedded</param>
        /// <param name="right">Compared (PipelineListEmbedded</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineListEmbedded left, PipelineListEmbedded right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineListEmbedded.
        /// </summary>
        /// <param name="left">Compared (PipelineListEmbedded</param>
        /// <param name="right">Compared (PipelineListEmbedded</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineListEmbedded left, PipelineListEmbedded right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineListEmbedded.
        /// </summary>
        public sealed class PipelineListEmbeddedBuilder
        {
            private List<Pipeline> _Pipelines;

            internal PipelineListEmbeddedBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineListEmbedded.Pipelines property.
            /// </summary>
            /// <param name="value">Pipelines</param>
            public PipelineListEmbeddedBuilder Pipelines(List<Pipeline> value)
            {
                _Pipelines = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineListEmbedded.
            /// </summary>
            /// <returns>PipelineListEmbedded</returns>
            public PipelineListEmbedded Build()
            {
                Validate();
                return new PipelineListEmbedded(
                    Pipelines: _Pipelines
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}