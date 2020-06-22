using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// PipelineExecutionStepStateLinks
    /// </summary>
    public sealed class PipelineExecutionStepStateLinks:  IEquatable<PipelineExecutionStepStateLinks>
    { 
        /// <summary>
        /// HttpNsAdobeComAdobecloudRelExecution
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelExecution { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelPipeline
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelPipeline { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelPipelineLogs
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelPipelineLogs { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelPipelineMetrics
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelPipelineMetrics { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelPipelineAdvance
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelPipelineAdvance { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelPipelineCancel
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelPipelineCancel { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelProgram
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelProgram { get; private set; }

        /// <summary>
        /// Self
        /// </summary>
        public HalLink Self { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineExecutionStepStateLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineExecutionStepStateLinks()
        {
        }

        private PipelineExecutionStepStateLinks(HalLink HttpNsAdobeComAdobecloudRelExecution, HalLink HttpNsAdobeComAdobecloudRelPipeline, HalLink HttpNsAdobeComAdobecloudRelPipelineLogs, HalLink HttpNsAdobeComAdobecloudRelPipelineMetrics, HalLink HttpNsAdobeComAdobecloudRelPipelineAdvance, HalLink HttpNsAdobeComAdobecloudRelPipelineCancel, HalLink HttpNsAdobeComAdobecloudRelProgram, HalLink Self)
        {
            
            this.HttpNsAdobeComAdobecloudRelExecution = HttpNsAdobeComAdobecloudRelExecution;
            
            this.HttpNsAdobeComAdobecloudRelPipeline = HttpNsAdobeComAdobecloudRelPipeline;
            
            this.HttpNsAdobeComAdobecloudRelPipelineLogs = HttpNsAdobeComAdobecloudRelPipelineLogs;
            
            this.HttpNsAdobeComAdobecloudRelPipelineMetrics = HttpNsAdobeComAdobecloudRelPipelineMetrics;
            
            this.HttpNsAdobeComAdobecloudRelPipelineAdvance = HttpNsAdobeComAdobecloudRelPipelineAdvance;
            
            this.HttpNsAdobeComAdobecloudRelPipelineCancel = HttpNsAdobeComAdobecloudRelPipelineCancel;
            
            this.HttpNsAdobeComAdobecloudRelProgram = HttpNsAdobeComAdobecloudRelProgram;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of PipelineExecutionStepStateLinks.
        /// </summary>
        /// <returns>PipelineExecutionStepStateLinksBuilder</returns>
        public static PipelineExecutionStepStateLinksBuilder Builder()
        {
            return new PipelineExecutionStepStateLinksBuilder();
        }

        /// <summary>
        /// Returns PipelineExecutionStepStateLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineExecutionStepStateLinksBuilder</returns>
        public PipelineExecutionStepStateLinksBuilder With()
        {
            return Builder()
                .HttpNsAdobeComAdobecloudRelExecution(HttpNsAdobeComAdobecloudRelExecution)
                .HttpNsAdobeComAdobecloudRelPipeline(HttpNsAdobeComAdobecloudRelPipeline)
                .HttpNsAdobeComAdobecloudRelPipelineLogs(HttpNsAdobeComAdobecloudRelPipelineLogs)
                .HttpNsAdobeComAdobecloudRelPipelineMetrics(HttpNsAdobeComAdobecloudRelPipelineMetrics)
                .HttpNsAdobeComAdobecloudRelPipelineAdvance(HttpNsAdobeComAdobecloudRelPipelineAdvance)
                .HttpNsAdobeComAdobecloudRelPipelineCancel(HttpNsAdobeComAdobecloudRelPipelineCancel)
                .HttpNsAdobeComAdobecloudRelProgram(HttpNsAdobeComAdobecloudRelProgram)
                .Self(Self);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PipelineExecutionStepStateLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineExecutionStepStateLinks.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionStepStateLinks</param>
        /// <param name="right">Compared (PipelineExecutionStepStateLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineExecutionStepStateLinks left, PipelineExecutionStepStateLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineExecutionStepStateLinks.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionStepStateLinks</param>
        /// <param name="right">Compared (PipelineExecutionStepStateLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineExecutionStepStateLinks left, PipelineExecutionStepStateLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineExecutionStepStateLinks.
        /// </summary>
        public sealed class PipelineExecutionStepStateLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelExecution;
            private HalLink _HttpNsAdobeComAdobecloudRelPipeline;
            private HalLink _HttpNsAdobeComAdobecloudRelPipelineLogs;
            private HalLink _HttpNsAdobeComAdobecloudRelPipelineMetrics;
            private HalLink _HttpNsAdobeComAdobecloudRelPipelineAdvance;
            private HalLink _HttpNsAdobeComAdobecloudRelPipelineCancel;
            private HalLink _HttpNsAdobeComAdobecloudRelProgram;
            private HalLink _Self;

            internal PipelineExecutionStepStateLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepStateLinks.HttpNsAdobeComAdobecloudRelExecution property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelExecution</param>
            public PipelineExecutionStepStateLinksBuilder HttpNsAdobeComAdobecloudRelExecution(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelExecution = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepStateLinks.HttpNsAdobeComAdobecloudRelPipeline property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelPipeline</param>
            public PipelineExecutionStepStateLinksBuilder HttpNsAdobeComAdobecloudRelPipeline(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelPipeline = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepStateLinks.HttpNsAdobeComAdobecloudRelPipelineLogs property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelPipelineLogs</param>
            public PipelineExecutionStepStateLinksBuilder HttpNsAdobeComAdobecloudRelPipelineLogs(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelPipelineLogs = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepStateLinks.HttpNsAdobeComAdobecloudRelPipelineMetrics property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelPipelineMetrics</param>
            public PipelineExecutionStepStateLinksBuilder HttpNsAdobeComAdobecloudRelPipelineMetrics(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelPipelineMetrics = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepStateLinks.HttpNsAdobeComAdobecloudRelPipelineAdvance property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelPipelineAdvance</param>
            public PipelineExecutionStepStateLinksBuilder HttpNsAdobeComAdobecloudRelPipelineAdvance(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelPipelineAdvance = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepStateLinks.HttpNsAdobeComAdobecloudRelPipelineCancel property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelPipelineCancel</param>
            public PipelineExecutionStepStateLinksBuilder HttpNsAdobeComAdobecloudRelPipelineCancel(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelPipelineCancel = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepStateLinks.HttpNsAdobeComAdobecloudRelProgram property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelProgram</param>
            public PipelineExecutionStepStateLinksBuilder HttpNsAdobeComAdobecloudRelProgram(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelProgram = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepStateLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public PipelineExecutionStepStateLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineExecutionStepStateLinks.
            /// </summary>
            /// <returns>PipelineExecutionStepStateLinks</returns>
            public PipelineExecutionStepStateLinks Build()
            {
                Validate();
                return new PipelineExecutionStepStateLinks(
                    HttpNsAdobeComAdobecloudRelExecution: _HttpNsAdobeComAdobecloudRelExecution,
                    HttpNsAdobeComAdobecloudRelPipeline: _HttpNsAdobeComAdobecloudRelPipeline,
                    HttpNsAdobeComAdobecloudRelPipelineLogs: _HttpNsAdobeComAdobecloudRelPipelineLogs,
                    HttpNsAdobeComAdobecloudRelPipelineMetrics: _HttpNsAdobeComAdobecloudRelPipelineMetrics,
                    HttpNsAdobeComAdobecloudRelPipelineAdvance: _HttpNsAdobeComAdobecloudRelPipelineAdvance,
                    HttpNsAdobeComAdobecloudRelPipelineCancel: _HttpNsAdobeComAdobecloudRelPipelineCancel,
                    HttpNsAdobeComAdobecloudRelProgram: _HttpNsAdobeComAdobecloudRelProgram,
                    Self: _Self
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}