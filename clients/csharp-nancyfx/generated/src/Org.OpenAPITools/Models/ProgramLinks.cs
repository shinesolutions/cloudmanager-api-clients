using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// ProgramLinks
    /// </summary>
    public sealed class ProgramLinks:  IEquatable<ProgramLinks>
    { 
        /// <summary>
        /// HttpNsAdobeComAdobecloudRelPipelines
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelPipelines { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelEnvironments
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelEnvironments { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelRepositories
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelRepositories { get; private set; }

        /// <summary>
        /// Self
        /// </summary>
        public HalLink Self { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ProgramLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ProgramLinks()
        {
        }

        private ProgramLinks(HalLink HttpNsAdobeComAdobecloudRelPipelines, HalLink HttpNsAdobeComAdobecloudRelEnvironments, HalLink HttpNsAdobeComAdobecloudRelRepositories, HalLink Self)
        {
            
            this.HttpNsAdobeComAdobecloudRelPipelines = HttpNsAdobeComAdobecloudRelPipelines;
            
            this.HttpNsAdobeComAdobecloudRelEnvironments = HttpNsAdobeComAdobecloudRelEnvironments;
            
            this.HttpNsAdobeComAdobecloudRelRepositories = HttpNsAdobeComAdobecloudRelRepositories;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of ProgramLinks.
        /// </summary>
        /// <returns>ProgramLinksBuilder</returns>
        public static ProgramLinksBuilder Builder()
        {
            return new ProgramLinksBuilder();
        }

        /// <summary>
        /// Returns ProgramLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ProgramLinksBuilder</returns>
        public ProgramLinksBuilder With()
        {
            return Builder()
                .HttpNsAdobeComAdobecloudRelPipelines(HttpNsAdobeComAdobecloudRelPipelines)
                .HttpNsAdobeComAdobecloudRelEnvironments(HttpNsAdobeComAdobecloudRelEnvironments)
                .HttpNsAdobeComAdobecloudRelRepositories(HttpNsAdobeComAdobecloudRelRepositories)
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

        public bool Equals(ProgramLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ProgramLinks.
        /// </summary>
        /// <param name="left">Compared (ProgramLinks</param>
        /// <param name="right">Compared (ProgramLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ProgramLinks left, ProgramLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ProgramLinks.
        /// </summary>
        /// <param name="left">Compared (ProgramLinks</param>
        /// <param name="right">Compared (ProgramLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ProgramLinks left, ProgramLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ProgramLinks.
        /// </summary>
        public sealed class ProgramLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelPipelines;
            private HalLink _HttpNsAdobeComAdobecloudRelEnvironments;
            private HalLink _HttpNsAdobeComAdobecloudRelRepositories;
            private HalLink _Self;

            internal ProgramLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ProgramLinks.HttpNsAdobeComAdobecloudRelPipelines property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelPipelines</param>
            public ProgramLinksBuilder HttpNsAdobeComAdobecloudRelPipelines(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelPipelines = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProgramLinks.HttpNsAdobeComAdobecloudRelEnvironments property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelEnvironments</param>
            public ProgramLinksBuilder HttpNsAdobeComAdobecloudRelEnvironments(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelEnvironments = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProgramLinks.HttpNsAdobeComAdobecloudRelRepositories property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelRepositories</param>
            public ProgramLinksBuilder HttpNsAdobeComAdobecloudRelRepositories(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelRepositories = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProgramLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public ProgramLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ProgramLinks.
            /// </summary>
            /// <returns>ProgramLinks</returns>
            public ProgramLinks Build()
            {
                Validate();
                return new ProgramLinks(
                    HttpNsAdobeComAdobecloudRelPipelines: _HttpNsAdobeComAdobecloudRelPipelines,
                    HttpNsAdobeComAdobecloudRelEnvironments: _HttpNsAdobeComAdobecloudRelEnvironments,
                    HttpNsAdobeComAdobecloudRelRepositories: _HttpNsAdobeComAdobecloudRelRepositories,
                    Self: _Self
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}