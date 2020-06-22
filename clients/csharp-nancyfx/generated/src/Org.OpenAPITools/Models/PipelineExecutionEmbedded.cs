using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// PipelineExecutionEmbedded
    /// </summary>
    public sealed class PipelineExecutionEmbedded:  IEquatable<PipelineExecutionEmbedded>
    { 
        /// <summary>
        /// StepStates
        /// </summary>
        public List<PipelineExecutionStepState> StepStates { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineExecutionEmbedded.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineExecutionEmbedded()
        {
        }

        private PipelineExecutionEmbedded(List<PipelineExecutionStepState> StepStates)
        {
            
            this.StepStates = StepStates;
            
        }

        /// <summary>
        /// Returns builder of PipelineExecutionEmbedded.
        /// </summary>
        /// <returns>PipelineExecutionEmbeddedBuilder</returns>
        public static PipelineExecutionEmbeddedBuilder Builder()
        {
            return new PipelineExecutionEmbeddedBuilder();
        }

        /// <summary>
        /// Returns PipelineExecutionEmbeddedBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineExecutionEmbeddedBuilder</returns>
        public PipelineExecutionEmbeddedBuilder With()
        {
            return Builder()
                .StepStates(StepStates);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PipelineExecutionEmbedded other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineExecutionEmbedded.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionEmbedded</param>
        /// <param name="right">Compared (PipelineExecutionEmbedded</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineExecutionEmbedded left, PipelineExecutionEmbedded right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineExecutionEmbedded.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionEmbedded</param>
        /// <param name="right">Compared (PipelineExecutionEmbedded</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineExecutionEmbedded left, PipelineExecutionEmbedded right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineExecutionEmbedded.
        /// </summary>
        public sealed class PipelineExecutionEmbeddedBuilder
        {
            private List<PipelineExecutionStepState> _StepStates;

            internal PipelineExecutionEmbeddedBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineExecutionEmbedded.StepStates property.
            /// </summary>
            /// <param name="value">StepStates</param>
            public PipelineExecutionEmbeddedBuilder StepStates(List<PipelineExecutionStepState> value)
            {
                _StepStates = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineExecutionEmbedded.
            /// </summary>
            /// <returns>PipelineExecutionEmbedded</returns>
            public PipelineExecutionEmbedded Build()
            {
                Validate();
                return new PipelineExecutionEmbedded(
                    StepStates: _StepStates
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}