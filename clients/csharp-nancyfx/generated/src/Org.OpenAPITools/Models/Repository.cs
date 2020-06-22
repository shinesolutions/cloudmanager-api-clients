using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// A sourcecode repository
    /// </summary>
    public sealed class Repository:  IEquatable<Repository>
    { 
        /// <summary>
        /// Repository name
        /// </summary>
        public string Repo { get; private set; }

        /// <summary>
        /// description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public RepositoryLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Repository.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Repository()
        {
        }

        private Repository(string Repo, string Description, RepositoryLinks Links)
        {
            
            this.Repo = Repo;
            
            this.Description = Description;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of Repository.
        /// </summary>
        /// <returns>RepositoryBuilder</returns>
        public static RepositoryBuilder Builder()
        {
            return new RepositoryBuilder();
        }

        /// <summary>
        /// Returns RepositoryBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RepositoryBuilder</returns>
        public RepositoryBuilder With()
        {
            return Builder()
                .Repo(Repo)
                .Description(Description)
                .Links(Links);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Repository other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Repository.
        /// </summary>
        /// <param name="left">Compared (Repository</param>
        /// <param name="right">Compared (Repository</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Repository left, Repository right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Repository.
        /// </summary>
        /// <param name="left">Compared (Repository</param>
        /// <param name="right">Compared (Repository</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Repository left, Repository right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Repository.
        /// </summary>
        public sealed class RepositoryBuilder
        {
            private string _Repo;
            private string _Description;
            private RepositoryLinks _Links;

            internal RepositoryBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Repository.Repo property.
            /// </summary>
            /// <param name="value">Repository name</param>
            public RepositoryBuilder Repo(string value)
            {
                _Repo = value;
                return this;
            }

            /// <summary>
            /// Sets value for Repository.Description property.
            /// </summary>
            /// <param name="value">description</param>
            public RepositoryBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for Repository.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public RepositoryBuilder Links(RepositoryLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Repository.
            /// </summary>
            /// <returns>Repository</returns>
            public Repository Build()
            {
                Validate();
                return new Repository(
                    Repo: _Repo,
                    Description: _Description,
                    Links: _Links
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}