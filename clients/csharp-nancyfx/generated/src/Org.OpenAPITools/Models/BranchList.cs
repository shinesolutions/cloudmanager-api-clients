using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// BranchList
    /// </summary>
    public sealed class BranchList:  IEquatable<BranchList>
    { 
        /// <summary>
        /// TotalNumberOfItems
        /// </summary>
        public int? TotalNumberOfItems { get; private set; }

        /// <summary>
        /// Embedded
        /// </summary>
        public BranchListEmbedded Embedded { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public ProgramListLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BranchList.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BranchList()
        {
        }

        private BranchList(int? TotalNumberOfItems, BranchListEmbedded Embedded, ProgramListLinks Links)
        {
            
            this.TotalNumberOfItems = TotalNumberOfItems;
            
            this.Embedded = Embedded;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of BranchList.
        /// </summary>
        /// <returns>BranchListBuilder</returns>
        public static BranchListBuilder Builder()
        {
            return new BranchListBuilder();
        }

        /// <summary>
        /// Returns BranchListBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BranchListBuilder</returns>
        public BranchListBuilder With()
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

        public bool Equals(BranchList other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BranchList.
        /// </summary>
        /// <param name="left">Compared (BranchList</param>
        /// <param name="right">Compared (BranchList</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BranchList left, BranchList right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BranchList.
        /// </summary>
        /// <param name="left">Compared (BranchList</param>
        /// <param name="right">Compared (BranchList</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BranchList left, BranchList right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BranchList.
        /// </summary>
        public sealed class BranchListBuilder
        {
            private int? _TotalNumberOfItems;
            private BranchListEmbedded _Embedded;
            private ProgramListLinks _Links;

            internal BranchListBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BranchList.TotalNumberOfItems property.
            /// </summary>
            /// <param name="value">TotalNumberOfItems</param>
            public BranchListBuilder TotalNumberOfItems(int? value)
            {
                _TotalNumberOfItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for BranchList.Embedded property.
            /// </summary>
            /// <param name="value">Embedded</param>
            public BranchListBuilder Embedded(BranchListEmbedded value)
            {
                _Embedded = value;
                return this;
            }

            /// <summary>
            /// Sets value for BranchList.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public BranchListBuilder Links(ProgramListLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BranchList.
            /// </summary>
            /// <returns>BranchList</returns>
            public BranchList Build()
            {
                Validate();
                return new BranchList(
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