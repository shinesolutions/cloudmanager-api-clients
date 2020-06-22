using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// ProgramList
    /// </summary>
    public sealed class ProgramList:  IEquatable<ProgramList>
    { 
        /// <summary>
        /// TotalNumberOfItems
        /// </summary>
        public int? TotalNumberOfItems { get; private set; }

        /// <summary>
        /// Embedded
        /// </summary>
        public ProgramListEmbedded Embedded { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public ProgramListLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ProgramList.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ProgramList()
        {
        }

        private ProgramList(int? TotalNumberOfItems, ProgramListEmbedded Embedded, ProgramListLinks Links)
        {
            
            this.TotalNumberOfItems = TotalNumberOfItems;
            
            this.Embedded = Embedded;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of ProgramList.
        /// </summary>
        /// <returns>ProgramListBuilder</returns>
        public static ProgramListBuilder Builder()
        {
            return new ProgramListBuilder();
        }

        /// <summary>
        /// Returns ProgramListBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ProgramListBuilder</returns>
        public ProgramListBuilder With()
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

        public bool Equals(ProgramList other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ProgramList.
        /// </summary>
        /// <param name="left">Compared (ProgramList</param>
        /// <param name="right">Compared (ProgramList</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ProgramList left, ProgramList right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ProgramList.
        /// </summary>
        /// <param name="left">Compared (ProgramList</param>
        /// <param name="right">Compared (ProgramList</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ProgramList left, ProgramList right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ProgramList.
        /// </summary>
        public sealed class ProgramListBuilder
        {
            private int? _TotalNumberOfItems;
            private ProgramListEmbedded _Embedded;
            private ProgramListLinks _Links;

            internal ProgramListBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ProgramList.TotalNumberOfItems property.
            /// </summary>
            /// <param name="value">TotalNumberOfItems</param>
            public ProgramListBuilder TotalNumberOfItems(int? value)
            {
                _TotalNumberOfItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProgramList.Embedded property.
            /// </summary>
            /// <param name="value">Embedded</param>
            public ProgramListBuilder Embedded(ProgramListEmbedded value)
            {
                _Embedded = value;
                return this;
            }

            /// <summary>
            /// Sets value for ProgramList.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public ProgramListBuilder Links(ProgramListLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ProgramList.
            /// </summary>
            /// <returns>ProgramList</returns>
            public ProgramList Build()
            {
                Validate();
                return new ProgramList(
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