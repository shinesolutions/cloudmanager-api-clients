using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// RepositoryList
    /// </summary>
    public sealed class RepositoryList:  IEquatable<RepositoryList>
    { 
        /// <summary>
        /// TotalNumberOfItems
        /// </summary>
        public int? TotalNumberOfItems { get; private set; }

        /// <summary>
        /// Embedded
        /// </summary>
        public RepositoryListEmbedded Embedded { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public ProgramListLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RepositoryList.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RepositoryList()
        {
        }

        private RepositoryList(int? TotalNumberOfItems, RepositoryListEmbedded Embedded, ProgramListLinks Links)
        {
            
            this.TotalNumberOfItems = TotalNumberOfItems;
            
            this.Embedded = Embedded;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of RepositoryList.
        /// </summary>
        /// <returns>RepositoryListBuilder</returns>
        public static RepositoryListBuilder Builder()
        {
            return new RepositoryListBuilder();
        }

        /// <summary>
        /// Returns RepositoryListBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RepositoryListBuilder</returns>
        public RepositoryListBuilder With()
        {
            return Builder()
                .TotalNumberOfItems(TotalNumberOfItems)
                .Embedded(Embedded)
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

        public bool Equals(RepositoryList other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RepositoryList.
        /// </summary>
        /// <param name="left">Compared (RepositoryList</param>
        /// <param name="right">Compared (RepositoryList</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RepositoryList left, RepositoryList right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RepositoryList.
        /// </summary>
        /// <param name="left">Compared (RepositoryList</param>
        /// <param name="right">Compared (RepositoryList</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RepositoryList left, RepositoryList right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RepositoryList.
        /// </summary>
        public sealed class RepositoryListBuilder
        {
            private int? _TotalNumberOfItems;
            private RepositoryListEmbedded _Embedded;
            private ProgramListLinks _Links;

            internal RepositoryListBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RepositoryList.TotalNumberOfItems property.
            /// </summary>
            /// <param name="value">TotalNumberOfItems</param>
            public RepositoryListBuilder TotalNumberOfItems(int? value)
            {
                _TotalNumberOfItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for RepositoryList.Embedded property.
            /// </summary>
            /// <param name="value">Embedded</param>
            public RepositoryListBuilder Embedded(RepositoryListEmbedded value)
            {
                _Embedded = value;
                return this;
            }

            /// <summary>
            /// Sets value for RepositoryList.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public RepositoryListBuilder Links(ProgramListLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RepositoryList.
            /// </summary>
            /// <returns>RepositoryList</returns>
            public RepositoryList Build()
            {
                Validate();
                return new RepositoryList(
                    TotalNumberOfItems: _TotalNumberOfItems,
                    Embedded: _Embedded,
                    Links: _Links
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}