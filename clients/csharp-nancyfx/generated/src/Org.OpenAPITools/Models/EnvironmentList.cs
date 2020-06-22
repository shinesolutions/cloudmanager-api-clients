using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// EnvironmentList
    /// </summary>
    public sealed class EnvironmentList:  IEquatable<EnvironmentList>
    { 
        /// <summary>
        /// TotalNumberOfItems
        /// </summary>
        public int? TotalNumberOfItems { get; private set; }

        /// <summary>
        /// Embedded
        /// </summary>
        public EnvironmentListEmbedded Embedded { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public ProgramListLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EnvironmentList.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EnvironmentList()
        {
        }

        private EnvironmentList(int? TotalNumberOfItems, EnvironmentListEmbedded Embedded, ProgramListLinks Links)
        {
            
            this.TotalNumberOfItems = TotalNumberOfItems;
            
            this.Embedded = Embedded;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of EnvironmentList.
        /// </summary>
        /// <returns>EnvironmentListBuilder</returns>
        public static EnvironmentListBuilder Builder()
        {
            return new EnvironmentListBuilder();
        }

        /// <summary>
        /// Returns EnvironmentListBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EnvironmentListBuilder</returns>
        public EnvironmentListBuilder With()
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

        public bool Equals(EnvironmentList other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EnvironmentList.
        /// </summary>
        /// <param name="left">Compared (EnvironmentList</param>
        /// <param name="right">Compared (EnvironmentList</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EnvironmentList left, EnvironmentList right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EnvironmentList.
        /// </summary>
        /// <param name="left">Compared (EnvironmentList</param>
        /// <param name="right">Compared (EnvironmentList</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EnvironmentList left, EnvironmentList right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EnvironmentList.
        /// </summary>
        public sealed class EnvironmentListBuilder
        {
            private int? _TotalNumberOfItems;
            private EnvironmentListEmbedded _Embedded;
            private ProgramListLinks _Links;

            internal EnvironmentListBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EnvironmentList.TotalNumberOfItems property.
            /// </summary>
            /// <param name="value">TotalNumberOfItems</param>
            public EnvironmentListBuilder TotalNumberOfItems(int? value)
            {
                _TotalNumberOfItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentList.Embedded property.
            /// </summary>
            /// <param name="value">Embedded</param>
            public EnvironmentListBuilder Embedded(EnvironmentListEmbedded value)
            {
                _Embedded = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentList.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public EnvironmentListBuilder Links(ProgramListLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EnvironmentList.
            /// </summary>
            /// <returns>EnvironmentList</returns>
            public EnvironmentList Build()
            {
                Validate();
                return new EnvironmentList(
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