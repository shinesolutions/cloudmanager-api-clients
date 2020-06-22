using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// PipelineLinks
    /// </summary>
    public sealed class PipelineLinks:  IEquatable<PipelineLinks>
    { 
        /// <summary>
        /// HttpNsAdobeComAdobecloudRelProgram
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelProgram { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelExecution
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelExecution { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelExecutions
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelExecutions { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution { get; private set; }

        /// <summary>
        /// Self
        /// </summary>
        public HalLink Self { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineLinks()
        {
        }

        private PipelineLinks(HalLink HttpNsAdobeComAdobecloudRelProgram, HalLink HttpNsAdobeComAdobecloudRelExecution, HalLink HttpNsAdobeComAdobecloudRelExecutions, HalLink HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution, HalLink Self)
        {
            
            this.HttpNsAdobeComAdobecloudRelProgram = HttpNsAdobeComAdobecloudRelProgram;
            
            this.HttpNsAdobeComAdobecloudRelExecution = HttpNsAdobeComAdobecloudRelExecution;
            
            this.HttpNsAdobeComAdobecloudRelExecutions = HttpNsAdobeComAdobecloudRelExecutions;
            
            this.HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of PipelineLinks.
        /// </summary>
        /// <returns>PipelineLinksBuilder</returns>
        public static PipelineLinksBuilder Builder()
        {
            return new PipelineLinksBuilder();
        }

        /// <summary>
        /// Returns PipelineLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineLinksBuilder</returns>
        public PipelineLinksBuilder With()
        {
            return Builder()
                .HttpNsAdobeComAdobecloudRelProgram(HttpNsAdobeComAdobecloudRelProgram)
                .HttpNsAdobeComAdobecloudRelExecution(HttpNsAdobeComAdobecloudRelExecution)
                .HttpNsAdobeComAdobecloudRelExecutions(HttpNsAdobeComAdobecloudRelExecutions)
                .HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution)
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

        public bool Equals(PipelineLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineLinks.
        /// </summary>
        /// <param name="left">Compared (PipelineLinks</param>
        /// <param name="right">Compared (PipelineLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineLinks left, PipelineLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineLinks.
        /// </summary>
        /// <param name="left">Compared (PipelineLinks</param>
        /// <param name="right">Compared (PipelineLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineLinks left, PipelineLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineLinks.
        /// </summary>
        public sealed class PipelineLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelProgram;
            private HalLink _HttpNsAdobeComAdobecloudRelExecution;
            private HalLink _HttpNsAdobeComAdobecloudRelExecutions;
            private HalLink _HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
            private HalLink _Self;

            internal PipelineLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineLinks.HttpNsAdobeComAdobecloudRelProgram property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelProgram</param>
            public PipelineLinksBuilder HttpNsAdobeComAdobecloudRelProgram(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelProgram = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineLinks.HttpNsAdobeComAdobecloudRelExecution property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelExecution</param>
            public PipelineLinksBuilder HttpNsAdobeComAdobecloudRelExecution(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelExecution = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineLinks.HttpNsAdobeComAdobecloudRelExecutions property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelExecutions</param>
            public PipelineLinksBuilder HttpNsAdobeComAdobecloudRelExecutions(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelExecutions = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineLinks.HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution</param>
            public PipelineLinksBuilder HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public PipelineLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineLinks.
            /// </summary>
            /// <returns>PipelineLinks</returns>
            public PipelineLinks Build()
            {
                Validate();
                return new PipelineLinks(
                    HttpNsAdobeComAdobecloudRelProgram: _HttpNsAdobeComAdobecloudRelProgram,
                    HttpNsAdobeComAdobecloudRelExecution: _HttpNsAdobeComAdobecloudRelExecution,
                    HttpNsAdobeComAdobecloudRelExecutions: _HttpNsAdobeComAdobecloudRelExecutions,
                    HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: _HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution,
                    Self: _Self
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}