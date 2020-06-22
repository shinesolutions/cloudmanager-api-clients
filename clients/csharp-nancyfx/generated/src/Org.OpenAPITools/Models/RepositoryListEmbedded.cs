using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// RepositoryListEmbedded
    /// </summary>
    public sealed class RepositoryListEmbedded:  IEquatable<RepositoryListEmbedded>
    { 
        /// <summary>
        /// Repositories
        /// </summary>
        public List<Repository> Repositories { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RepositoryListEmbedded.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RepositoryListEmbedded()
        {
        }

        private RepositoryListEmbedded(List<Repository> Repositories)
        {
            
            this.Repositories = Repositories;
            
        }

        /// <summary>
        /// Returns builder of RepositoryListEmbedded.
        /// </summary>
        /// <returns>RepositoryListEmbeddedBuilder</returns>
        public static RepositoryListEmbeddedBuilder Builder()
        {
            return new RepositoryListEmbeddedBuilder();
        }

        /// <summary>
        /// Returns RepositoryListEmbeddedBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RepositoryListEmbeddedBuilder</returns>
        public RepositoryListEmbeddedBuilder With()
        {
            return Builder()
                .Repositories(Repositories);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RepositoryListEmbedded other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RepositoryListEmbedded.
        /// </summary>
        /// <param name="left">Compared (RepositoryListEmbedded</param>
        /// <param name="right">Compared (RepositoryListEmbedded</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RepositoryListEmbedded left, RepositoryListEmbedded right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RepositoryListEmbedded.
        /// </summary>
        /// <param name="left">Compared (RepositoryListEmbedded</param>
        /// <param name="right">Compared (RepositoryListEmbedded</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RepositoryListEmbedded left, RepositoryListEmbedded right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RepositoryListEmbedded.
        /// </summary>
        public sealed class RepositoryListEmbeddedBuilder
        {
            private List<Repository> _Repositories;

            internal RepositoryListEmbeddedBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RepositoryListEmbedded.Repositories property.
            /// </summary>
            /// <param name="value">Repositories</param>
            public RepositoryListEmbeddedBuilder Repositories(List<Repository> value)
            {
                _Repositories = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RepositoryListEmbedded.
            /// </summary>
            /// <returns>RepositoryListEmbedded</returns>
            public RepositoryListEmbedded Build()
            {
                Validate();
                return new RepositoryListEmbedded(
                    Repositories: _Repositories
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}