using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// RepositoryBranchLinks
    /// </summary>
    public sealed class RepositoryBranchLinks:  IEquatable<RepositoryBranchLinks>
    { 
        /// <summary>
        /// HttpNsAdobeComAdobecloudRelProgram
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelProgram { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelRepository
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelRepository { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RepositoryBranchLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RepositoryBranchLinks()
        {
        }

        private RepositoryBranchLinks(HalLink HttpNsAdobeComAdobecloudRelProgram, HalLink HttpNsAdobeComAdobecloudRelRepository)
        {
            
            this.HttpNsAdobeComAdobecloudRelProgram = HttpNsAdobeComAdobecloudRelProgram;
            
            this.HttpNsAdobeComAdobecloudRelRepository = HttpNsAdobeComAdobecloudRelRepository;
            
        }

        /// <summary>
        /// Returns builder of RepositoryBranchLinks.
        /// </summary>
        /// <returns>RepositoryBranchLinksBuilder</returns>
        public static RepositoryBranchLinksBuilder Builder()
        {
            return new RepositoryBranchLinksBuilder();
        }

        /// <summary>
        /// Returns RepositoryBranchLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RepositoryBranchLinksBuilder</returns>
        public RepositoryBranchLinksBuilder With()
        {
            return Builder()
                .HttpNsAdobeComAdobecloudRelProgram(HttpNsAdobeComAdobecloudRelProgram)
                .HttpNsAdobeComAdobecloudRelRepository(HttpNsAdobeComAdobecloudRelRepository);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RepositoryBranchLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RepositoryBranchLinks.
        /// </summary>
        /// <param name="left">Compared (RepositoryBranchLinks</param>
        /// <param name="right">Compared (RepositoryBranchLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RepositoryBranchLinks left, RepositoryBranchLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RepositoryBranchLinks.
        /// </summary>
        /// <param name="left">Compared (RepositoryBranchLinks</param>
        /// <param name="right">Compared (RepositoryBranchLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RepositoryBranchLinks left, RepositoryBranchLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RepositoryBranchLinks.
        /// </summary>
        public sealed class RepositoryBranchLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelProgram;
            private HalLink _HttpNsAdobeComAdobecloudRelRepository;

            internal RepositoryBranchLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RepositoryBranchLinks.HttpNsAdobeComAdobecloudRelProgram property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelProgram</param>
            public RepositoryBranchLinksBuilder HttpNsAdobeComAdobecloudRelProgram(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelProgram = value;
                return this;
            }

            /// <summary>
            /// Sets value for RepositoryBranchLinks.HttpNsAdobeComAdobecloudRelRepository property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelRepository</param>
            public RepositoryBranchLinksBuilder HttpNsAdobeComAdobecloudRelRepository(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelRepository = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RepositoryBranchLinks.
            /// </summary>
            /// <returns>RepositoryBranchLinks</returns>
            public RepositoryBranchLinks Build()
            {
                Validate();
                return new RepositoryBranchLinks(
                    HttpNsAdobeComAdobecloudRelProgram: _HttpNsAdobeComAdobecloudRelProgram,
                    HttpNsAdobeComAdobecloudRelRepository: _HttpNsAdobeComAdobecloudRelRepository
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}