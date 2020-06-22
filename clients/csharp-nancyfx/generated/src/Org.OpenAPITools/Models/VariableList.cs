using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// VariableList
    /// </summary>
    public sealed class VariableList:  IEquatable<VariableList>
    { 
        /// <summary>
        /// TotalNumberOfItems
        /// </summary>
        public int? TotalNumberOfItems { get; private set; }

        /// <summary>
        /// Embedded
        /// </summary>
        public VariableListEmbedded Embedded { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public VariableListLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VariableList.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VariableList()
        {
        }

        private VariableList(int? TotalNumberOfItems, VariableListEmbedded Embedded, VariableListLinks Links)
        {
            
            this.TotalNumberOfItems = TotalNumberOfItems;
            
            this.Embedded = Embedded;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of VariableList.
        /// </summary>
        /// <returns>VariableListBuilder</returns>
        public static VariableListBuilder Builder()
        {
            return new VariableListBuilder();
        }

        /// <summary>
        /// Returns VariableListBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VariableListBuilder</returns>
        public VariableListBuilder With()
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

        public bool Equals(VariableList other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VariableList.
        /// </summary>
        /// <param name="left">Compared (VariableList</param>
        /// <param name="right">Compared (VariableList</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VariableList left, VariableList right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VariableList.
        /// </summary>
        /// <param name="left">Compared (VariableList</param>
        /// <param name="right">Compared (VariableList</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VariableList left, VariableList right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VariableList.
        /// </summary>
        public sealed class VariableListBuilder
        {
            private int? _TotalNumberOfItems;
            private VariableListEmbedded _Embedded;
            private VariableListLinks _Links;

            internal VariableListBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VariableList.TotalNumberOfItems property.
            /// </summary>
            /// <param name="value">TotalNumberOfItems</param>
            public VariableListBuilder TotalNumberOfItems(int? value)
            {
                _TotalNumberOfItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for VariableList.Embedded property.
            /// </summary>
            /// <param name="value">Embedded</param>
            public VariableListBuilder Embedded(VariableListEmbedded value)
            {
                _Embedded = value;
                return this;
            }

            /// <summary>
            /// Sets value for VariableList.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public VariableListBuilder Links(VariableListLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VariableList.
            /// </summary>
            /// <returns>VariableList</returns>
            public VariableList Build()
            {
                Validate();
                return new VariableList(
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