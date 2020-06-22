using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// EnvironmentLogsLinks
    /// </summary>
    public sealed class EnvironmentLogsLinks:  IEquatable<EnvironmentLogsLinks>
    { 
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
        /// Use EnvironmentLogsLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EnvironmentLogsLinks()
        {
        }

        private EnvironmentLogsLinks(HalLink HttpNsAdobeComAdobecloudRelProgram, HalLink Self)
        {
            
            this.HttpNsAdobeComAdobecloudRelProgram = HttpNsAdobeComAdobecloudRelProgram;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of EnvironmentLogsLinks.
        /// </summary>
        /// <returns>EnvironmentLogsLinksBuilder</returns>
        public static EnvironmentLogsLinksBuilder Builder()
        {
            return new EnvironmentLogsLinksBuilder();
        }

        /// <summary>
        /// Returns EnvironmentLogsLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EnvironmentLogsLinksBuilder</returns>
        public EnvironmentLogsLinksBuilder With()
        {
            return Builder()
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

        public bool Equals(EnvironmentLogsLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EnvironmentLogsLinks.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLogsLinks</param>
        /// <param name="right">Compared (EnvironmentLogsLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EnvironmentLogsLinks left, EnvironmentLogsLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EnvironmentLogsLinks.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLogsLinks</param>
        /// <param name="right">Compared (EnvironmentLogsLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EnvironmentLogsLinks left, EnvironmentLogsLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EnvironmentLogsLinks.
        /// </summary>
        public sealed class EnvironmentLogsLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelProgram;
            private HalLink _Self;

            internal EnvironmentLogsLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EnvironmentLogsLinks.HttpNsAdobeComAdobecloudRelProgram property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelProgram</param>
            public EnvironmentLogsLinksBuilder HttpNsAdobeComAdobecloudRelProgram(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelProgram = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLogsLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public EnvironmentLogsLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EnvironmentLogsLinks.
            /// </summary>
            /// <returns>EnvironmentLogsLinks</returns>
            public EnvironmentLogsLinks Build()
            {
                Validate();
                return new EnvironmentLogsLinks(
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