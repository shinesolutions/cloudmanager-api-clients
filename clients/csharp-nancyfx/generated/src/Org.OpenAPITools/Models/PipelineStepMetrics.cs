using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// PipelineStepMetrics
    /// </summary>
    public sealed class PipelineStepMetrics:  IEquatable<PipelineStepMetrics>
    { 
        /// <summary>
        /// metrics
        /// </summary>
        public List<Metric> Metrics { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineStepMetrics.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineStepMetrics()
        {
        }

        private PipelineStepMetrics(List<Metric> Metrics)
        {
            
            this.Metrics = Metrics;
            
        }

        /// <summary>
        /// Returns builder of PipelineStepMetrics.
        /// </summary>
        /// <returns>PipelineStepMetricsBuilder</returns>
        public static PipelineStepMetricsBuilder Builder()
        {
            return new PipelineStepMetricsBuilder();
        }

        /// <summary>
        /// Returns PipelineStepMetricsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineStepMetricsBuilder</returns>
        public PipelineStepMetricsBuilder With()
        {
            return Builder()
                .Metrics(Metrics);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PipelineStepMetrics other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineStepMetrics.
        /// </summary>
        /// <param name="left">Compared (PipelineStepMetrics</param>
        /// <param name="right">Compared (PipelineStepMetrics</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineStepMetrics left, PipelineStepMetrics right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineStepMetrics.
        /// </summary>
        /// <param name="left">Compared (PipelineStepMetrics</param>
        /// <param name="right">Compared (PipelineStepMetrics</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineStepMetrics left, PipelineStepMetrics right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineStepMetrics.
        /// </summary>
        public sealed class PipelineStepMetricsBuilder
        {
            private List<Metric> _Metrics;

            internal PipelineStepMetricsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineStepMetrics.Metrics property.
            /// </summary>
            /// <param name="value">metrics</param>
            public PipelineStepMetricsBuilder Metrics(List<Metric> value)
            {
                _Metrics = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineStepMetrics.
            /// </summary>
            /// <returns>PipelineStepMetrics</returns>
            public PipelineStepMetrics Build()
            {
                Validate();
                return new PipelineStepMetrics(
                    Metrics: _Metrics
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}