using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// EnvironmentLogLinks
    /// </summary>
    public sealed class EnvironmentLogLinks:  IEquatable<EnvironmentLogLinks>
    { 
        /// <summary>
        /// HttpNsAdobeComAdobecloudRelLogsDownload
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelLogsDownload { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelLogsTail
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelLogsTail { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EnvironmentLogLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EnvironmentLogLinks()
        {
        }

        private EnvironmentLogLinks(HalLink HttpNsAdobeComAdobecloudRelLogsDownload, HalLink HttpNsAdobeComAdobecloudRelLogsTail)
        {
            
            this.HttpNsAdobeComAdobecloudRelLogsDownload = HttpNsAdobeComAdobecloudRelLogsDownload;
            
            this.HttpNsAdobeComAdobecloudRelLogsTail = HttpNsAdobeComAdobecloudRelLogsTail;
            
        }

        /// <summary>
        /// Returns builder of EnvironmentLogLinks.
        /// </summary>
        /// <returns>EnvironmentLogLinksBuilder</returns>
        public static EnvironmentLogLinksBuilder Builder()
        {
            return new EnvironmentLogLinksBuilder();
        }

        /// <summary>
        /// Returns EnvironmentLogLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EnvironmentLogLinksBuilder</returns>
        public EnvironmentLogLinksBuilder With()
        {
            return Builder()
                .HttpNsAdobeComAdobecloudRelLogsDownload(HttpNsAdobeComAdobecloudRelLogsDownload)
                .HttpNsAdobeComAdobecloudRelLogsTail(HttpNsAdobeComAdobecloudRelLogsTail);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EnvironmentLogLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EnvironmentLogLinks.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLogLinks</param>
        /// <param name="right">Compared (EnvironmentLogLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EnvironmentLogLinks left, EnvironmentLogLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EnvironmentLogLinks.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLogLinks</param>
        /// <param name="right">Compared (EnvironmentLogLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EnvironmentLogLinks left, EnvironmentLogLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EnvironmentLogLinks.
        /// </summary>
        public sealed class EnvironmentLogLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelLogsDownload;
            private HalLink _HttpNsAdobeComAdobecloudRelLogsTail;

            internal EnvironmentLogLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EnvironmentLogLinks.HttpNsAdobeComAdobecloudRelLogsDownload property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelLogsDownload</param>
            public EnvironmentLogLinksBuilder HttpNsAdobeComAdobecloudRelLogsDownload(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelLogsDownload = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLogLinks.HttpNsAdobeComAdobecloudRelLogsTail property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelLogsTail</param>
            public EnvironmentLogLinksBuilder HttpNsAdobeComAdobecloudRelLogsTail(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelLogsTail = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EnvironmentLogLinks.
            /// </summary>
            /// <returns>EnvironmentLogLinks</returns>
            public EnvironmentLogLinks Build()
            {
                Validate();
                return new EnvironmentLogLinks(
                    HttpNsAdobeComAdobecloudRelLogsDownload: _HttpNsAdobeComAdobecloudRelLogsDownload,
                    HttpNsAdobeComAdobecloudRelLogsTail: _HttpNsAdobeComAdobecloudRelLogsTail
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}