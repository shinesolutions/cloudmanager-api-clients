using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// RepositoryLinks
    /// </summary>
    public sealed class RepositoryLinks:  IEquatable<RepositoryLinks>
    { 
        /// <summary>
        /// HttpNsAdobeComAdobecloudRelProgram
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelProgram { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelBranches
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelBranches { get; private set; }

        /// <summary>
        /// Self
        /// </summary>
        public HalLink Self { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RepositoryLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RepositoryLinks()
        {
        }

        private RepositoryLinks(HalLink HttpNsAdobeComAdobecloudRelProgram, HalLink HttpNsAdobeComAdobecloudRelBranches, HalLink Self)
        {
            
            this.HttpNsAdobeComAdobecloudRelProgram = HttpNsAdobeComAdobecloudRelProgram;
            
            this.HttpNsAdobeComAdobecloudRelBranches = HttpNsAdobeComAdobecloudRelBranches;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of RepositoryLinks.
        /// </summary>
        /// <returns>RepositoryLinksBuilder</returns>
        public static RepositoryLinksBuilder Builder()
        {
            return new RepositoryLinksBuilder();
        }

        /// <summary>
        /// Returns RepositoryLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RepositoryLinksBuilder</returns>
        public RepositoryLinksBuilder With()
        {
            return Builder()
                .HttpNsAdobeComAdobecloudRelProgram(HttpNsAdobeComAdobecloudRelProgram)
                .HttpNsAdobeComAdobecloudRelBranches(HttpNsAdobeComAdobecloudRelBranches)
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

        public bool Equals(RepositoryLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RepositoryLinks.
        /// </summary>
        /// <param name="left">Compared (RepositoryLinks</param>
        /// <param name="right">Compared (RepositoryLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RepositoryLinks left, RepositoryLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RepositoryLinks.
        /// </summary>
        /// <param name="left">Compared (RepositoryLinks</param>
        /// <param name="right">Compared (RepositoryLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RepositoryLinks left, RepositoryLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RepositoryLinks.
        /// </summary>
        public sealed class RepositoryLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelProgram;
            private HalLink _HttpNsAdobeComAdobecloudRelBranches;
            private HalLink _Self;

            internal RepositoryLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RepositoryLinks.HttpNsAdobeComAdobecloudRelProgram property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelProgram</param>
            public RepositoryLinksBuilder HttpNsAdobeComAdobecloudRelProgram(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelProgram = value;
                return this;
            }

            /// <summary>
            /// Sets value for RepositoryLinks.HttpNsAdobeComAdobecloudRelBranches property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelBranches</param>
            public RepositoryLinksBuilder HttpNsAdobeComAdobecloudRelBranches(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelBranches = value;
                return this;
            }

            /// <summary>
            /// Sets value for RepositoryLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public RepositoryLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RepositoryLinks.
            /// </summary>
            /// <returns>RepositoryLinks</returns>
            public RepositoryLinks Build()
            {
                Validate();
                return new RepositoryLinks(
                    HttpNsAdobeComAdobecloudRelProgram: _HttpNsAdobeComAdobecloudRelProgram,
                    HttpNsAdobeComAdobecloudRelBranches: _HttpNsAdobeComAdobecloudRelBranches,
                    Self: _Self
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}