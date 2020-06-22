using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// PipelineExecutionLinks
    /// </summary>
    public sealed class PipelineExecutionLinks:  IEquatable<PipelineExecutionLinks>
    { 
        /// <summary>
        /// HttpNsAdobeComAdobecloudRelProgram
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelProgram { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelPipeline
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelPipeline { get; private set; }

        /// <summary>
        /// Self
        /// </summary>
        public HalLink Self { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineExecutionLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineExecutionLinks()
        {
        }

        private PipelineExecutionLinks(HalLink HttpNsAdobeComAdobecloudRelProgram, HalLink HttpNsAdobeComAdobecloudRelPipeline, HalLink Self)
        {
            
            this.HttpNsAdobeComAdobecloudRelProgram = HttpNsAdobeComAdobecloudRelProgram;
            
            this.HttpNsAdobeComAdobecloudRelPipeline = HttpNsAdobeComAdobecloudRelPipeline;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of PipelineExecutionLinks.
        /// </summary>
        /// <returns>PipelineExecutionLinksBuilder</returns>
        public static PipelineExecutionLinksBuilder Builder()
        {
            return new PipelineExecutionLinksBuilder();
        }

        /// <summary>
        /// Returns PipelineExecutionLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineExecutionLinksBuilder</returns>
        public PipelineExecutionLinksBuilder With()
        {
            return Builder()
                .HttpNsAdobeComAdobecloudRelProgram(HttpNsAdobeComAdobecloudRelProgram)
                .HttpNsAdobeComAdobecloudRelPipeline(HttpNsAdobeComAdobecloudRelPipeline)
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

        public bool Equals(PipelineExecutionLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineExecutionLinks.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionLinks</param>
        /// <param name="right">Compared (PipelineExecutionLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineExecutionLinks left, PipelineExecutionLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineExecutionLinks.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionLinks</param>
        /// <param name="right">Compared (PipelineExecutionLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineExecutionLinks left, PipelineExecutionLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineExecutionLinks.
        /// </summary>
        public sealed class PipelineExecutionLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelProgram;
            private HalLink _HttpNsAdobeComAdobecloudRelPipeline;
            private HalLink _Self;

            internal PipelineExecutionLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineExecutionLinks.HttpNsAdobeComAdobecloudRelProgram property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelProgram</param>
            public PipelineExecutionLinksBuilder HttpNsAdobeComAdobecloudRelProgram(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelProgram = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionLinks.HttpNsAdobeComAdobecloudRelPipeline property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelPipeline</param>
            public PipelineExecutionLinksBuilder HttpNsAdobeComAdobecloudRelPipeline(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelPipeline = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public PipelineExecutionLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineExecutionLinks.
            /// </summary>
            /// <returns>PipelineExecutionLinks</returns>
            public PipelineExecutionLinks Build()
            {
                Validate();
                return new PipelineExecutionLinks(
                    HttpNsAdobeComAdobecloudRelProgram: _HttpNsAdobeComAdobecloudRelProgram,
                    HttpNsAdobeComAdobecloudRelPipeline: _HttpNsAdobeComAdobecloudRelPipeline,
                    Self: _Self
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}